package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 显示状态
     * @param
     * @return
     */
    public void onDialog(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, DialogActivity.class);
        startActivity(it);
    }

    /**
     * 显示状态
     * @param
     * @return
     */
    public void onDialog2(View v) {
        Intent it = new Intent();
        it.setClass(MainActivity.this, DialogActivity2.class);
        startActivity(it);
    }
}