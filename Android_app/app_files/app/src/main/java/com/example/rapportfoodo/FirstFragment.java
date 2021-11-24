package com.example.rapportfoodo;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;

import static androidx.core.content.ContextCompat.checkSelfPermission;

public class FirstFragment extends Fragment {
    private TextView recipe;
    private Data d;
    private FusedLocationProviderClient client;
    double longtitude=0,latitude=0;
    Button order;
    String type;

    RecyclerView recyclerView;
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        recipe = v.findViewById(R.id.ordername);
        String r = d.getName();
        recipe.setText(Data.mainArray[MainActivity.index][0]);
        client= LocationServices.getFusedLocationProviderClient(getActivity());
        order=v.findViewById(R.id.order);
        int index = 0;

        recyclerView = v.findViewById(R.id.listRecyclerView);
        context = getActivity();

        for(int i=0;i<Data.dishNames.length;i++){
            System.out.println(Data.dishNames[i]+" "+r);
            if(r.equals(Data.dishNames[i])){
                index = i;
                break;
            }
        }
        type=Data.mainArray[index][1];

        order.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.zomato.com/"));
                startActivity(viewIntent);
            }
        });


        if (checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(getContext(),Manifest.permission.ACCESS_COARSE_LOCATION)
                ==PackageManager.PERMISSION_GRANTED) {
            //Toast.makeText(getContext(),"GPS mode on",Toast.LENGTH_SHORT).show();
            getCurrentLocation();
        }
        else{
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION},100);
            }
        }
        return v;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        if(requestCode==100 && (grantResults.length>0) && (grantResults[0]+grantResults[1]==PackageManager.PERMISSION_GRANTED)){
            getCurrentLocation();
        }
        else{
            Toast.makeText(getContext(),"Permission denied",Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("MissingPermission")
    private void getCurrentLocation() {
        LocationManager locationManager=(LocationManager)getActivity().getSystemService(getContext().LOCATION_SERVICE);
        if(locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            client.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
                @Override
                public void onComplete(@NonNull Task<Location> task) {
                    Location location = task.getResult();
                    Log.i("location","value"+location);
                    if (location != null) {
                        latitude = location.getLatitude();
                        longtitude = location.getLongitude();
                        //Toast.makeText(getContext(),"data-"+longtitude+latitude,Toast.LENGTH_SHORT).show();
                        new doIT(context,recyclerView).execute();
                    } else {
                        Toast.makeText(getContext(),"GPS mode on 2",Toast.LENGTH_SHORT).show();
                        LocationRequest locationRequest = new LocationRequest()
                                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                                .setInterval(10000)
                                .setFastestInterval(1000)
                                .setNumUpdates(1);
                        LocationCallback locationCallback = new LocationCallback() {
                            @Override
                            public void onLocationResult(LocationResult locationResult) {
                                Location location1 = locationResult.getLastLocation();
                                Log.i("location","value"+location1.getLatitude());
                                latitude = location1.getLatitude();
                                longtitude = location1.getLongitude();
                                //Toast.makeText(getContext(),"data-"+longtitude+latitude,Toast.LENGTH_SHORT).show();
                                new doIT(context,recyclerView).execute();
                            }

                        };
                        client.requestLocationUpdates(locationRequest, locationCallback
                                , Looper.myLooper());

                    }
                }
            });
        }
        else{
            startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                    .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        }
    }

    public class doIT extends AsyncTask<Void,Void,Void> {
        Context context;
        RecyclerView recyclerView;
        venueData vd;

        public doIT(Context context,RecyclerView recyclerView) {
            super();
            this.context=context;
            this.recyclerView = recyclerView;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            vd=new venueData();
            try {
                if(type!=null) {
                    String lat, lon;
                    lat = String.valueOf(latitude);
                    lon = String.valueOf(longtitude);
                    System.out.println(latitude + " " + longtitude);
                    System.out.println(lon + " " + lat);
                    String url = "https://api.foursquare.com/v2/venues/search?client_id=HN1VU2XE5I0I4KP2T3XEE1NZTE1CCQH1ILR4OESRTD2HSGUS&client_secret=OQPXJD5C5RF3UP5SCCCGCFDEOF3LARZK52WDT0IMXMSS0DDM&oauth_token=5W021DWJP4DUUHPC3LCNR2FLVU34DJJYIJOURPOCXGAEZO2P&v=20180604&ll=" + lat + "," + lon + "&query=" + type + "&radius=100000&limit=10";
//                Document document = Jsoup.connect(url).get();
                    JSONObject json = readJsonFromUrl(url);
//                    System.out.println(json.get("response"));
                    JSONObject js = (JSONObject) json.get("response");
                    System.out.println(js.get("venues"));
                    JSONArray j = (JSONArray) js.get("venues");
                    System.out.println(j.length());
                    for (int i = 0; i < j.length(); i++) {
                        JSONObject k=(JSONObject)j.get(i);
                        String venuename=k.get("name").toString();
                        JSONObject m=(JSONObject)k.get("location");
                        if(m.has("formattedAddress")) {
                            vd.venueName.add(venuename);
                            String add=m.get("formattedAddress").toString().replace("\\","");
                            String a=m.get("formattedAddress").toString().replace("[","");
                            vd.address.add(m.get("formattedAddress").toString().replace("]",""));
                            vd.type.add(type);
                        }
                    }
                    System.out.println(vd.venueName);
                }
                else{
                    Toast.makeText(getContext(),"Upload food image",Toast.LENGTH_SHORT).show();
                }

            } catch (IOException | JSONException e) {
                e.printStackTrace();
            } return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            System.out.println("---------------------------------------post Execute");
            System.out.println(vd.getVenueName());
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(context, vd);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
    }
    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }


    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}