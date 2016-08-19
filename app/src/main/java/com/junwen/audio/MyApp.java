package com.junwen.audio;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * 描述：
 * 作者：卜俊文
 * 创建：2016/8/19 15:07
 * 邮箱：344176791@qq.com
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(getApplicationContext(), "appid=57b65a07 ");
        AudioUtils.getInstance().init(getApplicationContext());
    }
}
