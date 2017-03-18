package com.yang.gremoon.lemoonlive.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Description:sp工具类
 * Created by Administrator on 2017/3/14.
 */

public class SPUtils {

    private static final String FILE_NAME = "LenmoonLive";

    /**
     * 保存数据到sp
     *
     * @param context 上下文
     * @param key     保存的键值
     * @param o       保存数据的类型
     */
    public static void setSP(Context context, String key, Object o) {
        String type = o.getClass().getSimpleName();
        SharedPreferences preferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        if ("String".equals(type)) {
            editor.putString(key, (String) o);
        } else if ("Integer".equals(type)) {
            editor.putInt(key, (Integer) o);
        } else if ("Boolean".equals(type)) {
            editor.putBoolean(key, (Boolean) o);
        } else if ("Float".equals(type)) {
            editor.putFloat(key, (Float) o);
        } else if ("Long".equals(type)) {
            editor.putLong(key, (Long) o);
        }
        editor.commit();
    }

    /**
     * 获取保存在sp中的数据
     *
     * @param context    上下文
     * @param key        键值
     * @param defaultObj 默认值
     * @return 返回得到数据
     */
    public static Object getSP(Context context, String key, Object defaultObj) {
        String type = defaultObj.getClass().getSimpleName();
        SharedPreferences preferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        if ("String".equals(type)) {
            return preferences.getString(key, (String) defaultObj);
        } else if ("Integer".equals(type)) {
            return preferences.getInt(key, (Integer) defaultObj);
        } else if ("Boolean".equals(type)) {
            return preferences.getBoolean(key, (Boolean) defaultObj);
        } else if ("Float".equals(type)) {
            return preferences.getFloat(key, (Float) defaultObj);
        } else if ("Long".equals(type)) {
            return preferences.getLong(key, (Long) defaultObj);
        }
        return null;
    }

    /**
     * 清除sp中所有的数据
     *
     * @param context 上下文
     */
    public static void cleanAllSP(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }

}
