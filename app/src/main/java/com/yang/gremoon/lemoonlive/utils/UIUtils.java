package com.yang.gremoon.lemoonlive.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import com.yang.gremoon.lemoonlive.base.MyApplication;

/**
 * Description: 布局工具类
 * Created by Administrator on 2017/3/16.
 */

public class UIUtils {
    /**
     * 上下文
     *
     * @return 返回上下文
     */
    public static Context getContext() {
        return MyApplication.getInstance();
    }

    /**
     * 获取Resources 对象
     *
     * @return
     */
    public static Resources getResources() {
        return getContext().getResources();
    }

    /**
     * 根据布局id 返回view对象
     *
     * @param id 布局id
     * @return view对象
     */
    public static View inflate(int id) {
        return View.inflate(getContext(), id, null);
    }

}