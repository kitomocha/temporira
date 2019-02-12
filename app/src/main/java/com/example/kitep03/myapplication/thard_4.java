package com.example.kitep03.myapplication;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class thard_4 extends AppCompatActivity {
    String ans[] = new String[8];
    String corect[] = new String[8];
    int number = 0;
    boolean dec = false;

    ImageView ans1;//答え表示アニメーション用
    ImageView ans2;//答え表示アニメーション用
    ImageView ans3;//答え表示アニメーション用
    ImageView ans4;//答え表示アニメーション用
    ImageView maru;
    ImageView batu;

    View anseranime;//アニメーション用ビュー

    View bgm;//アニメーション用ビュー

    AlphaAnimation alpha1 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha2 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha3 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha4 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha5 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha6 = new AlphaAnimation(1.0f, 1.0f);

    // SoundPool(効果音再生)
    public SoundPool mSoundPool;
    public int[] mSoundId = new int[2]; // 使う効果音の数だけ配列作成
    MediaPlayer p1 = null,p2=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_hard4);

        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        mSoundId[0] = mSoundPool.load(getApplicationContext(), R.raw.pop2, 1);
        mSoundId[1] = mSoundPool.load(getApplicationContext(), R.raw.kyoku1, 1);

        final ImageButton button = (ImageButton) findViewById(R.id.Button1);
        final ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        final ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        final ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        final ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        final ImageButton button6 = (ImageButton) findViewById(R.id.button6);
        final ImageButton button7 = (ImageButton) findViewById(R.id.button7);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);

        final TextView countdown = (TextView) findViewById(R.id.countdown);//カウントダウン表示用テキスト

        textView.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");

        button.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button2.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button3.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button4.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button5.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);

        corect[0] = "た";/*答えの文字*/
        corect[1] = "い";
        corect[2] = "や";
        corect[3] = "き";

        ans1 = findViewById(R.id.img_ta);//アニメーションと画像を結びつける
        ans2 = findViewById(R.id.img_i);//アニメーションと画像を結びつける
        ans3 = findViewById(R.id.img_ya);//アニメーションと画像を結びつける
        ans4 = findViewById(R.id.img_ki);//アニメーションと画像を結びつける
        maru = findViewById(R.id.maru);//アニメーションと画像を結びつける
        batu = findViewById(R.id.batu);//アニメーションと画像を結びつける

        Sound_Tempo.setBGM_now(thard_4.this, R.raw.kyoku1, R.raw.rinngo_hig);

        Sound_Tempo.p1.start();

        Button_Click_Action_4_Tempo.Click(button, button2, button3, button4, button5, button6, button7
                , "た", "き", "い", "や", "な",
                textView, textView2, textView3, textView4, countdown, corect, Sound_Tempo.mSoundPool, Sound_Tempo.mSoundId, ans1, ans2, ans3, ans4, maru, batu
                , alpha1, alpha2, alpha3, alpha4, alpha5, alpha6, anseranime, thard_4.this, thard_5.class, Sound_Tempo.p1, Sound_Tempo.p2);

    }

}