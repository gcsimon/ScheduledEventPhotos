package com.example.scheduledeventphotos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button5);
        Button btn2 = (Button) findViewById(R.id.button6);

        btn1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent myIntent = new Intent(MainActivity.this, AddEventActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent myIntent = new Intent(MainActivity.this, SeePhotosActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }






}
