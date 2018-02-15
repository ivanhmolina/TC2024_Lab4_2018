package com.example.ivanh.tc2024_lab4_2018;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Child_1 extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_1);

        context = getApplicationContext();

        long pattern[]={0,200,100,300,400};

        Vibrator vibrator = (Vibrator)getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(pattern, -1);
    }
}
