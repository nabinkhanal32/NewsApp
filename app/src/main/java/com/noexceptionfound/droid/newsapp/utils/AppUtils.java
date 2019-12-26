package com.noexceptionfound.droid.newsapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.noexceptionfound.droid.newsapp.NewsApplication;

/**
 * Created by Harpal on 12/6/2018.
 */

public class AppUtils {

    public static boolean isInternetConnected(Context callerContext){
        boolean isConnected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) callerContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetInfo != null) {
                if (activeNetInfo.isConnected()) {
                    isConnected = true;
                }
            }
        }
        return isConnected;
    }
}
