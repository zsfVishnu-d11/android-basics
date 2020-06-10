package com.example.basicapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private Button buttonBack,buttonBrowser, buttonShare;
    private Handler handler;
    private Runnable runnable;
    TextView displayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_second);

        String secondName = getIntent().getStringExtra("name");

        displayName = findViewById(R.id.secondName);
        buttonBack = findViewById(R.id.backButton);
        buttonBrowser = findViewById(R.id.browserButton);
        buttonShare = findViewById(R.id.shareButton);

        displayName.setText(secondName);

        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, " Share intent demo");
                shareIntent.setType("text/plain");

                Intent chooseShare = Intent.createChooser(shareIntent,null);
                startActivity(chooseShare);
            }
        });


        buttonBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri linkedInSearch = Uri.parse("https://www.dream11.com/");
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, linkedInSearch);

                if (browserIntent.resolveActivity(getPackageManager())!= null){
                    startActivity(browserIntent);
                }
            }
        });



        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( SecondActivity.this,"Delaying by 5 seconds",Toast.LENGTH_SHORT).show();

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
