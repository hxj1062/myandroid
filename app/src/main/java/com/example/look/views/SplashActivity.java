package com.example.look.views;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.look.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

/**
 *@explain  启动页
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);


        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
                // overridePendingTransition(0, 0);
            }
        }, 2000);

    }

}
