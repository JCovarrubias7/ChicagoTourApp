package com.example.android.chicagotourapp;
import android.app.Application;
import android.content.Context;

// Thanks to this link, I was able to make this work http://bit.ly/2y2OVFm
// Thanks to Mike Cole and Christian from StackOverflow.com

public class MyApp extends Application {

    // This gives the ability to access resources from any place in the app
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }
}