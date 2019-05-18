package com.example.admin.infinitybeyond;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //code to execute after 2.5 ms .... which is basically to open a new Activity
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);//
                finish();// to remove splash screen from stack
            }
        },2500);
    }
}
