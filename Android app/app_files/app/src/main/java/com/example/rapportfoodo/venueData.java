package com.example.rapportfoodo;

import java.util.ArrayList;

public class venueData {
    public static ArrayList<String> venueName=new ArrayList<String>();
    public static ArrayList<String> address=new ArrayList<String>();
    public static ArrayList<String> type=new ArrayList<String>();

    public static ArrayList<String> getVenueName() {
        return venueName;
    }

    public static void setVenueName(ArrayList<String> venueName) {
        venueData.venueName = venueName;
    }

    public static ArrayList<String> getAddress() {
        return address;
    }

    public static void setAddress(ArrayList<String> address) {
        venueData.address = address;
    }

    public static ArrayList<String> getType() {
        return type;
    }

    public static void setType(ArrayList<String> type) {
        venueData.type = type;
    }
}