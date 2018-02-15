package com.example.ivanh.tc2024_lab4_2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        Button btnChild_1;
        btnChild_1 = (Button) findViewById(R.id.child1);

        Button btnChild_2;
        btnChild_2 = (Button) findViewById(R.id.child2);

        Button btnChild_3;
        btnChild_3 = (Button) findViewById(R.id.child3);

        btnChild_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(context, Child_1.class);
                startActivity(intent);
            }
        });

        btnChild_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(context, Child_2.class);
                startActivity(intent);
            }
        });

        btnChild_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(context, Child_3.class);
                startActivity(intent);
            }
        });
    }
}
