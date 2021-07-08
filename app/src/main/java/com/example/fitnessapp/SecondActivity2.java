package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        newArray = new int[]{
                R.id.boatpose, R.id.boundangle, R.id.bowpose, R.id.camelpose, R.id.catpose,
                R.id.chairpose, R.id.childspose, R.id.cobrapose, R.id.corpsepose, R.id.cowface,
        };
    }

    public void Imagebuttonclicked1(View view) {
        for (int i=0; i<newArray.length; i++){
            if (view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));

                Intent intent = new Intent(SecondActivity2.this, ThirdActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}