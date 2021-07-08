package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ThirdActivity extends AppCompatActivity {

    String buttonvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(buttonvalue);

        switch(intvalue){
            case 1:
                setContentView(R.layout.activity_dumbbell);
                break;
            case 2:
                setContentView(R.layout.activity_lungetouch);
                break;
            case 3:
                setContentView(R.layout.activity_anklecircle);
                break;
            case 4:
                setContentView(R.layout.activity_anklehops);
                break;
            case 5:
                setContentView(R.layout.activity_crosssidelunge);
                break;
            case 6:
                setContentView(R.layout.activity_bearsquat);
                break;
            case 7:
                setContentView(R.layout.activity_boxersquat);
                break;
            case 8:
                setContentView(R.layout.activity_bulgarian);
                break;
            case 9:
                setContentView(R.layout.activity_cossak);
                break;
            case 10:
                setContentView(R.layout.activity_frogjump);
                break;
            case 11:
                setContentView(R.layout.activity_gateswing);
                break;
            case 12:
                setContentView(R.layout.activity_basketball);
                break;
            case 13:
                setContentView(R.layout.activity_bicycle);
                break;
            case 14:
                setContentView(R.layout.activity_boattwist);
                break;
        }

    }
}