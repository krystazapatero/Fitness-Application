package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ThirdActivity2 extends AppCompatActivity {

    String buttonval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);

        Intent intent = getIntent();
        buttonval = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(buttonval);

        switch(intvalue){
            case 1:
                setContentView(R.layout.activity_boatpose);
                break;
            case 2:
                setContentView(R.layout.activity_boundangle);
                break;
            case 3:
                setContentView(R.layout.activity_bowpose);
                break;
            case 4:
                setContentView(R.layout.activity_camelpose);
                break;
            case 5:
                setContentView(R.layout.activity_catpose);
                break;
            case 6:
                setContentView(R.layout.activity_chairpose);
                break;
            case 7:
                setContentView(R.layout.activity_childspose);
                break;
            case 8:
                setContentView(R.layout.activity_cobrapose);
                break;
            case 9:
                setContentView(R.layout.activity_corpsepose);
                break;
            case 10:
                setContentView(R.layout.activity_cowfacepose);
                break;
        }
    }
}