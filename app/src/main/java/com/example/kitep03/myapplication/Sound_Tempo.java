package com.example.kitep03.myapplication;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Sound_Tempo extends AppCompatActivity {
    // SoundPool(効果音再生)

    public static SoundPool mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
    public static int[] mSoundId = new int[2];
    public static MediaPlayer p1 = null, p2 = null;

    public static void setSound_now(Context sound_now,int resID1,int resID2){
        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        mSoundId = new int[2];
        mSoundId[0] = mSoundPool.load(sound_now.getApplicationContext(), resID1, 1);
        mSoundId[1] = mSoundPool.load(sound_now.getApplicationContext(), resID2, 1);
    }
    public static void setBGM_now(Context sound_now,int resID1,int resID2){
        p1 = null;
        p2 = null;
        p1 = MediaPlayer.create(sound_now.getApplicationContext(), resID1);
        p2 = MediaPlayer.create(sound_now.getApplicationContext(), resID2);
    }

    public static void releas_BGM(){
        mSoundPool.release();
        p1.release();
        p2.release();
    }

}
