package com.moduser;

import com.moduser.main.DrawerActivity;

/**
 * Created by claritus on 26/04/17.
 */

public class MyManager {
    private static final MyManager ourInstance = new MyManager();
    private DrawerActivity activity;

    private MyManager() {

    }

   public static MyManager getInstance() {
        return ourInstance;
    }

    public void setActivity(DrawerActivity activity) {
        this.activity = activity;
    }

    public DrawerActivity getActivity()
    {
        return activity;
    }


}
