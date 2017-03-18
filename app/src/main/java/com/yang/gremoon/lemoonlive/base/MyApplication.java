package com.yang.gremoon.lemoonlive.base;

import android.app.Application;
import android.content.Context;

/**
 * Description:
 * Created by Administrator on 2017/3/16.
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getInstance() {
        return instance;
    }
}
