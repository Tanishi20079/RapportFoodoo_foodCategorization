package com.example.rapportfoodo;

import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private Context mContext;
    venueData mVenueData;

    public RecyclerViewAdapter(Context context, venueData mObjects) {
        mVenueData = mObjects;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.venue_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        holder.venue.setText(venueData.venueName.get(position));
        holder.kind.setText(venueData.type.get(position));
        holder.address.setText(venueData.address.get(position));

//        holder.imageName.setText(mEmergencyContacts.get(position).getName());
//        holder.imageNumber.setText(mEmergencyContacts.get(position).getNumber());

//        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: clicked on: " + mEmergencyContacts.get(position).getName());
//
////                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:"+mEmergencyContacts.get(position).getNumber()));
//                mContext.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mVenueData.getVenueName().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView venue;
        TextView address;
        TextView kind;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            venue = itemView.findViewById(R.id.venue);
            address = itemView.findViewById(R.id.address);
            kind = itemView.findViewById(R.id.kind);
//            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}