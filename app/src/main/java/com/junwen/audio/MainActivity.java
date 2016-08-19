package com.junwen.audio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 描述:播放语音
     * 作者:卜俊文
     * 邮箱:344176791@qq.com
     * 创建时间: 2016/8/19 15:15
     */
    public void speakText(View view) {
        TextView text = (TextView) findViewById(R.id.main_content);
        String content = text.getText().toString().trim();
        if (!TextUtils.isEmpty(content)) {
            AudioUtils.getInstance().speakText(content);
        }
    }
}
