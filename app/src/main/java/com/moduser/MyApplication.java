package com.moduser;

import android.app.Application;

/**
 * Created by claritus on 26/04/17.
 */

public class MyApplication extends Application {

    MyManager myManager;
    @Override
    public void onCreate() {
        super.onCreate();
        myManager=MyManager.getInstance();
    }
}
