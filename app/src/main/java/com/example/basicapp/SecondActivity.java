package com.example.basicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    private Button secondButton;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_second);

        secondButton = findViewById(R.id.button);


        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runnable = new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SecondActivity.this,MainActivity.class));
                    }
                };

                handler = new Handler();
                handler.postDelayed(runnable,5000);

            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler!= null && runnable!= null)
            handler.removeCallbacks(runnable);
    }
}
