package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button home,contact_us,open_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home =findViewById(R.id.btn_1);
        contact_us =findViewById(R.id.btn_2);
        open_camera =findViewById(R.id.btn_3);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });

        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(i);
            }
        });
        open_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(i);
            }
        });
    }
}