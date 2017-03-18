package com.yang.gremoon.lemoonlive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yang.gremoon.lemoonlive.conmoon.Constant;
import com.yang.gremoon.lemoonlive.ui.activity.GuideActivity;
import com.yang.gremoon.lemoonlive.ui.activity.MainActivity;
import com.yang.gremoon.lemoonlive.utils.SPUtils;
import com.yang.gremoon.lemoonlive.utils.UIUtils;

public class SplashActivity extends AppCompatActivity {


    private boolean mFirst_install;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mFirst_install = (boolean) SPUtils.getSP(UIUtils.getContext(), Constant.IS_FIRST_INSTALL, true);

        //如果是第一次安装 跳转到引导界面，若不是则直接进入主界面
        if(mFirst_install){
            //TODO  跳转到引导界面
            Intent intent = new Intent(UIUtils.getContext(),GuideActivity.class);
            startActivity(intent);
        }else{
            //TODO 跳转到主界面
            Intent intent = new Intent(UIUtils.getContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }


    }
}
