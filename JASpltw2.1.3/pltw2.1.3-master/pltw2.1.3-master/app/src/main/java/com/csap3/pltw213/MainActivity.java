package com.csap3.pltw213;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arithmetic testArithmetic = new Arithmetic();
        System.out.println(testArithmetic);
    }

}

