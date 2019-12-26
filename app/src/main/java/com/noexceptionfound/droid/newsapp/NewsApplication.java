package com.noexceptionfound.droid.newsapp;

import android.app.Application;

/**
 * Created by Harpal on 12/6/2018.
 */

public class NewsApplication extends Application {

    private static NewsApplication mApplicationInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationInstance = this;
    }

    public static NewsApplication getApplicationInstance(){
        if(mApplicationInstance==null){
            mApplicationInstance = new NewsApplication();
        }
        return mApplicationInstance;
    }
}
