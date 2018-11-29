package com.example.kitep03.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Startscreen extends AppCompatActivity {

    public static int anser = 0;
    public static int timechange = 1;//時間変更関数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);
    }

    public void Onstart1(View view) {
        timechange = 10000;
        Intent intent = new Intent(this,teasy_1.class);
        startActivity(intent);
    }
    public void Onstart2(View view) {
        timechange = 8000;
        Intent intent = new Intent(this,tnomal_1.class);
        startActivity(intent);
    }
    public void Onstart3(View view) {
        timechange = 6000;
        Intent intent = new Intent(this,thard_1.class);
        startActivity(intent);
    }
}

