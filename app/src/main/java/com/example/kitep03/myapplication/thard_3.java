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

public class thard_3 extends AppCompatActivity {
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
        setContentView(R.layout.t_hard3);

        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        mSoundId[0] = mSoundPool.load(getApplicationContext(), R.raw.pop2, 1);
        mSoundId[1] = mSoundPool.load(getApplicationContext(), R.raw.sample01, 1);

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

        corect[0] = "し";/*答えの文字*/
        corect[1] = "ま";
        corect[2] = "う";
        corect[3] = "ま";

        final String sel[] = {"つ", "う", "ま", "ま", "し"};

        ans1 = findViewById(R.id.img_si);//アニメーションと画像を結びつける
        ans2 = findViewById(R.id.img_ma1);//アニメーションと画像を結びつける
        ans3 = findViewById(R.id.img_u);//アニメーションと画像を結びつける
        ans4 = findViewById(R.id.img_ma2);//アニメーションと画像を結びつける
        maru = findViewById(R.id.maru);//アニメーションと画像を結びつける
        batu = findViewById(R.id.batu);//アニメーションと画像を結びつける

        p1 = MediaPlayer.create(getApplicationContext(),R.raw.kyoku1);
        p2 = MediaPlayer.create(getApplicationContext(),R.raw.rinngo_hig);
        p1.start();

        final CountDownTimer cdt = new CountDownTimer(Startscreen.timechange, 100)/*カウントダウンプログラム*/ {
            @Override
            public void onTick(long millisUntilFinished) {
                int time = (int) millisUntilFinished / 1000;
                ((TextView) findViewById(R.id.countdown)).setText("" + time);
            }

            @Override
            public void onFinish() {

                button.setEnabled(false);//ボタンの効果消す
                button2.setEnabled(false);//ボタンの効果消す
                button3.setEnabled(false);//ボタンの効果消す
                button4.setEnabled(false);//ボタンの効果消す
                button5.setEnabled(false);//ボタンの効果消す
                button6.setEnabled(false);//ボタンの効果消す
                button7.setEnabled(false);//ボタンの効果消す
                animation(anseranime);//正解アニメーション表示
            }
        }.start();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                if (textView.getText() == "") {
                    textView.setText(sel[0]);
                } else if (textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText(sel[0]);
                } else if (textView.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(sel[0]);
                } else if (textView.getText() != "" && textView3.getText() != "" && textView4.getText() == "") {
                    textView4.setText(sel[0]);
                }
                if (number < 4) {
                    ans[number] = sel[0];
                    number++;
                    mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 効果音出力
                    button.setEnabled(false);//ボタンの効果を消滅
                    button.setColorFilter(0xaadddd00, PorterDuff.Mode.SRC_IN);//ボタンの色を変える
                }

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                if (textView.getText() == "") {
                    textView.setText(sel[1]);
                } else if (textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText(sel[1]);
                } else if (textView.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(sel[1]);
                } else if (textView.getText() != "" && textView3.getText() != "" && textView4.getText() == "") {
                    textView4.setText(sel[1]);
                }
                if (number < 4) {
                    ans[number] = sel[1];
                    number++;
                    mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 効果音出力
                    button2.setEnabled(false);//ボタンの効果を消滅
                    button2.setColorFilter(0xaadddd00, PorterDuff.Mode.SRC_IN);//ボタンの色を変える
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                if (textView.getText() == "") {
                    textView.setText(sel[2]);
                } else if (textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText(sel[2]);
                } else if (textView.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(sel[2]);
                } else if (textView.getText() != "" && textView3.getText() != "" && textView4.getText() == "") {
                    textView4.setText(sel[2]);
                }
                if (number < 4) {
                    ans[number] = sel[2];
                    number++;
                    mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 効果音出力
                    button3.setEnabled(false);//ボタンの効果を消滅
                    button3.setColorFilter(0xaadddd00, PorterDuff.Mode.SRC_IN);//ボタンの色を変える
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                if (textView.getText() == "") {
                    textView.setText(sel[3]);
                } else if (textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText(sel[3]);
                } else if (textView.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(sel[3]);
                } else if (textView.getText() != "" && textView3.getText() != "" && textView4.getText() == "") {
                    textView4.setText(sel[3]);
                }
                if (number < 4) {
                    ans[number] = sel[3];
                    number++;
                    mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 効果音出力
                    button4.setEnabled(false);//ボタンの効果を消滅
                    button4.setColorFilter(0xaadddd00, PorterDuff.Mode.SRC_IN);//ボタンの色を変える
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);
                if (textView.getText() == "") {
                    textView.setText(sel[4]);
                } else if (textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText(sel[4]);
                } else if (textView.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(sel[4]);
                } else if (textView.getText() != "" && textView3.getText() != "" && textView4.getText() == "") {
                    textView4.setText(sel[4]);
                }
                if (number < 4) {
                    ans[number] = sel[4];
                    number++;
                    mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 効果音出力
                    button5.setEnabled(false);//ボタンの効果を消滅
                    button5.setColorFilter(0xaadddd00, PorterDuff.Mode.SRC_IN);//ボタンの色を変える
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                TextView textView3 = (TextView) findViewById(R.id.textView3);
                TextView textView4 = (TextView) findViewById(R.id.textView4);

                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                button.setEnabled(true);//ボタンの効果を復活*/
                button.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);//ボタンの色を復活
                button2.setEnabled(true);
                button2.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
                button3.setEnabled(true);
                button3.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
                button4.setEnabled(true);
                button4.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
                button5.setEnabled(true);
                button5.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);
                number = 0;
                dec = false;
            }


        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button.setEnabled(false);//ボタンの効果消す
                button2.setEnabled(false);//ボタンの効果消す
                button3.setEnabled(false);//ボタンの効果消す
                button4.setEnabled(false);//ボタンの効果消す
                button5.setEnabled(false);//ボタンの効果消す
                button6.setEnabled(false);//ボタンの効果消す
                button7.setEnabled(false);//ボタンの効果消す

                p1.stop();

                if (ans[0] == corect[0]) {
                    if (ans[1] == corect[1]) {
                        if (ans[2] == corect[2]) {
                            dec = true;
                        }
                    }
                }

                cdt.cancel();
                animation(anseranime);//正解アニメーション表示

            }
        });

        String text = textView.getText().toString();
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    //buttonを押したときに呼び出される関数
    public void animation(View view) {


        //アニメーションの開始から終了までの時間設定
        alpha1.setDuration(500);
        alpha2.setDuration(500);
        alpha3.setDuration(500);
        alpha4.setDuration(500);
        alpha5.setDuration(1000);
        alpha6.setDuration(1000);

        alpha1.setFillAfter(true);
        alpha2.setFillAfter(true);
        alpha3.setFillAfter(true);
        alpha4.setFillAfter(true);
        alpha5.setFillAfter(true);
        alpha6.setFillAfter(true);

        p2.start();

        //「り」のアニメーションのリスナー
        alpha1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            //「り」のアニメーション終了時に「ん」のアニメーションを開始
            public void onAnimationEnd(Animation animation) {
                ans2.startAnimation(alpha2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        //「ん」のアニメーションのリスナー
        alpha2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            //「ん」のアニメーション終了時に「ご」のアニメーションを開始
            public void onAnimationEnd(Animation animation) {
                ans3.startAnimation(alpha3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        //「ん」のアニメーションのリスナー
        alpha3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            //「ん」のアニメーション終了時に「ご」のアニメーションを開始
            public void onAnimationEnd(Animation animation) {
                ans4.startAnimation(alpha4);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        alpha4.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            //「ん」のアニメーション終了時に「ご」のアニメーションを開始
            public void onAnimationEnd(Animation animation) {

                if (dec == true) {
                    maru.startAnimation(alpha5);
                    Startscreen.anser++;//正解数を増やす
                } else if (dec == false) {
                    batu.startAnimation(alpha6);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        alpha5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(thard_3.this, thard_4.class);
                //global.Global_Times_reset();
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        alpha6.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(thard_3.this, thard_4.class);
                //global.Global_Times_reset();
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        //「り」のアニメーションを開始
        ans1.startAnimation(alpha1);

    }

    private void OnBGM(View view) {
        mSoundPool.play(mSoundId[1], 1.0f, 1.0f, 0, 10, 1.0f); // 効果音出力
    }

}