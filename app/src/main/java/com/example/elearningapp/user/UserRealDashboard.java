package com.example.elearningapp.user;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.elearningapp.MainActivity;
import com.example.elearningapp.R;
import com.example.elearningapp.SplashActivity;

public class UserRealDashboard extends AppCompatActivity {

    CardView cv_web, cv_frontend, cv_backend, cv_database, cv_android, cv_machineLearning;
    String[] courses = {"Web", "Frontend", "Backend", "Database", "Android", "Machine Learning"};

    Button btnLogout;

    public static final String CATEGORY = "category";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_real_dashboard);

        cv_web = findViewById(R.id.cv_web);
        cv_frontend = findViewById(R.id.cv_frontend);
        cv_backend = findViewById(R.id.cv_backend);
        cv_database = findViewById(R.id.cv_database);
        cv_android = findViewById(R.id.cv_android);
        cv_machineLearning = findViewById(R.id.cv_machineLearning);
        btnLogout = findViewById(R.id.btnLogout);

        cv_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserRealDashboard.this, UserDashboard.class).putExtra(CATEGORY, courses[0]));
            }
        });
        cv_frontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserRealDashboard.this, UserDashboard.class).putExtra(CATEGORY, courses[1]));
            }
        });
        cv_backend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserRealDashboard.this, UserDashboard.class).putExtra(CATEGORY, courses[2]));
            }
        });
        cv_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserRealDashboard.this, UserDashboard.class).putExtra(CATEGORY, courses[3]));
            }
        });
        cv_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserRealDashboard.this, UserDashboard.class).putExtra(CATEGORY, courses[4]));
            }
        });
        cv_machineLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserRealDashboard.this, UserDashboard.class).putExtra(CATEGORY, courses[5]));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref = getSharedPreferences("userLogin", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                editor.putBoolean("flag", false);
                editor.apply();

                Intent i = new Intent(UserRealDashboard.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}