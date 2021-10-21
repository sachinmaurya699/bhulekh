package com.sos.upbhulekh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splesh_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(Splesh_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);




    }
}