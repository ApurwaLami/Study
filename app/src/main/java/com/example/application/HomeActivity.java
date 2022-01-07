package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button GoBackToMainScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GoBackToMainScreen = findViewById(R.id.btnhome);

        GoBackToMainScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();

            }
        });
    }
}