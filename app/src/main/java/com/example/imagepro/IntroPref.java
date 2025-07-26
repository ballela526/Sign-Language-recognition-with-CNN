package com.example.imagepro;

import android.content.Context;
import android.content.SharedPreferences;

public class IntroPref {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;
    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "xyz";
    private static final String IS_FIRST_TIME_LAUNCH = "firstTime";
    private boolean firstTimeLaunchApp = false;

    public IntroPref(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setIsFirstTimeLaunch(boolean firstTimeLaunch) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, firstTimeLaunch);
        firstTimeLaunchApp = firstTimeLaunch;
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return firstTimeLaunchApp;
    }
}