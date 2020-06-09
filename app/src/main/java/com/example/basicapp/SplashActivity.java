package com.example.basicapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    private Button secondButton;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);




                runnable = new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    }
                };

                handler = new Handler();
                handler.postDelayed(runnable,5000);

            }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler!= null && runnable!= null)
            handler.removeCallbacks(runnable);
    }
    }


