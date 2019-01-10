package com.example.kitep03.myapplication;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Startscreen extends AppCompatActivity {

    public static int anser = 0;
    public static int timechange = 1;//時間変更関数

    // SoundPool(効果音再生)
    public SoundPool mSoundPool;
    public int[] mSoundId = new int[2]; // 使う効果音の数だけ配列作成

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        mSoundId[0] = mSoundPool.load(getApplicationContext(), R.raw.pop2, 1);
        mSoundId[1] = mSoundPool.load(getApplicationContext(), R.raw.kyoku1, 1);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_startscreen);

    }

    public void Onstart1(View view) {
        timechange = 8000;
        Intent intent = new Intent(this,teasy_1.class);
        startActivity(intent);
    }
    public void Onstart2(View view) {
        timechange = 6000;
        Intent intent = new Intent(this,tnomal_1.class);
        startActivity(intent);
    }
    public void Onstart3(View view) {
        timechange = 6000;
        Intent intent = new Intent(this,thard_1.class);
        startActivity(intent);
    }
}

