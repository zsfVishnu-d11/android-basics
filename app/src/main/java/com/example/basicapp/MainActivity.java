package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Debug value";

    private Button enter;
    private EditText editName, editPassword;

    private static int SPLASH_SCREEN_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);
        System.out.println("------------------->");
        System.out.println("onCreate");
        Log.i(TAG, "onCreate");

        enter = findViewById(R.id.enterButton);
        editName = findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPassword);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editName.getText().toString();
                String pwd = editPassword.getText().toString();

                if (name.isEmpty())
                    Toast.makeText(MainActivity.this,"Enter a name",Toast.LENGTH_SHORT).show();

                else if (pwd.isEmpty())
                    Toast.makeText(MainActivity.this,"Enter a password",Toast.LENGTH_SHORT).show();

                else if (!name.isEmpty() && !pwd.isEmpty()){

                    Intent second = new Intent(MainActivity.this, SecondActivity.class);
                    second.putExtra("name",name);
                    startActivity(second);

                }

                else
                    Toast.makeText(MainActivity.this, " Try again",Toast.LENGTH_SHORT).show();

            }
        });






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
