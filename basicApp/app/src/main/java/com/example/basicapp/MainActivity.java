package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Debug value";

    private static int SPLASH_SCREEN_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("------------------->");
        System.out.println("onCreate");
        Log.i(TAG,"onCreate");

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        //This method is used so that your splash activity
//        //can cover the entire screen.
//
//        setContentView(R.layout.activity_main);
//        //this will bind your MainActivity.class file with activity_main.
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i=new Intent(MainActivity.this,
//                        SecondActivity.class);
//                //Intent is used to switch from one activity to another.
//
//                startActivity(i);
//                //invoke the SecondActivity.
//
//                finish();
//                //the current activity will get finished.
//            }
//        }, SPLASH_SCREEN_TIME_OUT);
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("-------------->");
        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("-------------->");
        System.out.println("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("-------------->");
        System.out.println("onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("-------------->");
        System.out.println("onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("-------------->");
        System.out.println("onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("-------------->");
        System.out.println("onRestart");
    }
}
