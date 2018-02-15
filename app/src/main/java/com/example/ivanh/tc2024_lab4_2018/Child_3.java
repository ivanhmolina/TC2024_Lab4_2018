package com.example.ivanh.tc2024_lab4_2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Child_3 extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_3);

        context = getApplicationContext();

        Button btnSubmit;
        btnSubmit = (Button) findViewById(R.id.button_submit);

        final SmsManager smsManager = SmsManager.getDefault();

        final TextView phone;
        phone = (TextView) findViewById(R.id.phone_number);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                smsManager.sendTextMessage(phone.getText().toString(), null, "Hola mundo", null, null);
            }
        });

    }
}
