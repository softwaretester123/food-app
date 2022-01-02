package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread startTimer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    Intent intent0 = new Intent(MainActivity.this, SimpleTextClientActivity.class);
                    startActivity(intent0);
                    overridePendingTransition(R.anim.fadin, R.anim.fadout);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        startTimer.start();

    }
}