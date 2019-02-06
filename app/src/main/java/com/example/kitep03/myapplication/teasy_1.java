package com.example.kitep03.myapplication;

import android.content.Context;
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

import static com.example.kitep03.myapplication.Button_Click_Action_Tempo.page_change;

public class teasy_1 extends AppCompatActivity {
    String ans[] = new String[8];
    String corect[] = new String[8];
    int number = 0;
    public static int anser;
    boolean dec = false;

    ImageView ans1;//答え表示アニメーション用
    ImageView ans2;//答え表示アニメーション用
    ImageView ans3;//答え表示アニメーション用
    ImageView maru;
    ImageView batu;

    View anseranime;//アニメーション用ビュー

    View bgm;//アニメーション用ビュー

    AlphaAnimation alpha1 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha2 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha3 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha4 = new AlphaAnimation(1.0f, 1.0f);
    AlphaAnimation alpha5 = new AlphaAnimation(1.0f, 1.0f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_easy1);

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

        final TextView countdown = (TextView) findViewById(R.id.countdown);//カウントダウン表示用テキスト

        textView.setText("");
        textView2.setText("");
        textView3.setText("");

        button.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button2.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button3.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button4.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
        button5.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);

        corect[0] = "り";/*答えの文字*/
        corect[1] = "ん";
        corect[2] = "ご";

        ans1 = findViewById(R.id.img_ba);//アニメーションと画像を結びつける
        ans2 = findViewById(R.id.img_n);//アニメーションと画像を結びつける
        ans3 = findViewById(R.id.img_go);//アニメーションと画像を結びつける
        maru = findViewById(R.id.maru);//アニメーションと画像を結びつける
        batu = findViewById(R.id.batu);//アニメーションと画像を結びつける


        final CountDownTimer cdt = new CountDownTimer(Startscreen.timechange, 100)/*カウントダウンプログラム*/ {
            @Override
            public void onTick(long millisUntilFinished) {
                int time = (int) millisUntilFinished / 1000;
                ((TextView) findViewById(R.id.countdown)).setText("" + time);
            }

            @Override
            public void onFinish() {

                Button_Click_Action_Tempo.button_false(button, button2, button3, button4, button5, button6, button7);

                Button_Click_Action_Tempo.animation(anseranime,ans1,ans2,ans3,maru,batu,alpha1,alpha2,alpha3,alpha4,alpha5,teasy_1.this,teasy_2.class,Sound_Tempo.p1,Sound_Tempo.p2);//正解アニメーション表示

            }
        }.start();

        Sound_Tempo.setSound_now(teasy_1.this,R.raw.pop2,R.raw.sample01);
        Sound_Tempo.setBGM_now(teasy_1.this,R.raw.kyoku1,R.raw.rinngo_hig);

        Sound_Tempo.p1.start();

        Button_Click_Action_Tempo.Click(button, button2, button3, button4, button5, button6, button7,
                                        "り", "ん", "ご", "う", "ち",
                                        textView, textView2, textView3, corect, Sound_Tempo.mSoundPool, Sound_Tempo.mSoundId,ans1,ans2,ans3,maru,batu
                                        ,alpha1,alpha2,alpha3,alpha4,alpha5,anseranime,teasy_1.this,teasy_2.class,Sound_Tempo.p1,Sound_Tempo.p2);

    }
}