package com.example.android.chicagotourapp;

public class CategoryClass {

    /** Set the state of the class */
    // Location Name
    private String mLocationName;

    // Location Description
    private String mLocationDescription;

    // Location Phone Number
    private String mLocationPhone;

    // Location Address
    private String mLocationAddress;

    // Location Image id to display in Card View
    private int mImageResourceId;

    /** Constructor, used to create he object with the required inputs the caller has to pass in */

    public CategoryClass(String name, String description, String phone, String address, int imageResourceId) {
        mLocationName = name;
        mLocationDescription = description;
        mLocationPhone = phone;
        mLocationAddress = address;
        mImageResourceId = imageResourceId;
    }

    /** Set methods to get information from this class (getter methods) */

    // Get Location Name
    public String getLocationName(){
        return mLocationName;
    }

    // Get Location Description
    public String getLocationDescription(){
        return mLocationDescription;
    }

    // Get Location Phone Number
    public String getLocationPhone(){
        return mLocationPhone;
    }

    // Get Location Address
    public String getLocationAddress(){
        return mLocationAddress;
    }

    // Get Image Location
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
