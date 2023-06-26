package com.example.elearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.elearningapp.user.UserRealDashboard;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("userLogin", MODE_PRIVATE);
                boolean check = pref.getBoolean("flag", false);

                Intent iUser;
                if (check) {
                    iUser = new Intent(SplashActivity.this, UserRealDashboard.class);
                } else {
                    iUser = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(iUser);
            }
        }, 4000);

    }
}