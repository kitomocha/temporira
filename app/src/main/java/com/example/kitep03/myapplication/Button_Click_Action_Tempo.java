package com.example.kitep03.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class  Button_Click_Action_Tempo extends AppCompatActivity {

    static int number = 0;
    static boolean dec = false;
    static boolean page_change = false;
    static String ans[] = new String[8];

    public static void Click (final ImageButton button1, final ImageButton button2, final ImageButton button3, final ImageButton button4, final ImageButton button5, final ImageButton button6, final ImageButton button7
                        , final String one, final String two, final String three, final String four, final String five
                        , final TextView textView1, final TextView textView2, final TextView textView3, final TextView countdown,final String[] corect
                        , final SoundPool mSoundPool, final int[]mSoundId
                        , final ImageView ans1, final ImageView ans2, final ImageView ans3, final ImageView maru, final ImageView batu
                        , final AlphaAnimation alpha1, final  AlphaAnimation alpha2, final AlphaAnimation alpha3, final AlphaAnimation alpha4, final AlphaAnimation alpha5
                        , final View anseranime, final Context now_page, final Class next_page
                        , final MediaPlayer p1,final MediaPlayer p2)
    {

        final CountDownTimer cdt = new CountDownTimer(Startscreen.timechange, 100)/*カウントダウンプログラム*/ {
            @Override
            public void onTick(long millisUntilFinished) {
                int time = (int) millisUntilFinished / 1000;
                countdown.setText("" + time);
            }

            @Override
            public void onFinish() {

                Button_Click_Action_Tempo.button_false(button1, button2, button3, button4, button5, button6, button7);

                Button_Click_Action_Tempo.animation(anseranime,ans1,ans2,ans3,maru,batu,alpha1,alpha2,alpha3,alpha4,alpha5,now_page,next_page,p1,p2);//正解アニメーション表示

            }
        }.start();


        page_change = false;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//入力文字数が正解文字数を超えてしまう場合、処理を行わない
                if (textView1.getText() == "") {
                    textView1.setText(one);
                } else if (textView1.getText() != "" && textView2.getText() == "") {
                    textView2.setText(one);
                } else if (textView1.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(one);
                }
                if (number < 3) {
                    ans[number] = one;
                    number++;
                    mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 効果音出力
                    button1.setEnabled(false);//ボタンの効果を消滅
                    button1.setColorFilter(0xaadddd00, PorterDuff.Mode.SRC_IN);//ボタンの色を変える
                }
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView1.getText() == "") {
                    textView1.setText(two);
                } else if (textView1.getText() != "" && textView2.getText() == "") {
                    textView2.setText(two);
                } else if (textView1.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(two);
                }
                if (number < 3) {
                    ans[number] = two;
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
                if (textView1.getText() == "") {
                    textView1.setText(three);
                } else if (textView1.getText() != "" && textView2.getText() == "") {
                    textView2.setText(three);
                } else if (textView1.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(three);
                }
                if (number < 3) {
                    ans[number] = three;
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

                if (textView1.getText() == "") {
                    textView1.setText(four);
                } else if (textView1.getText() != "" && textView2.getText() == "") {
                    textView2.setText(four);
                } else if (textView1.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(four);
                }
                if (number < 3) {
                    ans[number] = four;
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

                if (textView1.getText() == "") {
                    textView1.setText(five);
                } else if (textView1.getText() != "" && textView2.getText() == "") {
                    textView2.setText(five);
                } else if (textView1.getText() != "" && textView2.getText() != "" && textView3.getText() == "") {
                    textView3.setText(five);
                }
                if (number < 3) {
                    ans[number] = five;
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

                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
                button1.setEnabled(true);//ボタンの効果を復活
                button1.setColorFilter(0xccffff00, PorterDuff.Mode.SRC_IN);//ボタンの色を復活
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

                button1.setEnabled(false);//ボタンの効果消す
                button2.setEnabled(false);//ボタンの効果消す
                button3.setEnabled(false);//ボタンの効果消す
                button4.setEnabled(false);//ボタンの効果消す
                button5.setEnabled(false);//ボタンの効果消す
                button6.setEnabled(false);//ボタンの効果消す
                button7.setEnabled(false);//ボタンの効果消す
                //p1.stop();

                if (ans[0] == corect[0]) {
                    if (ans[1] == corect[1]) {
                        if (ans[2] == corect[2]) {
                            dec = true;
                        }
                    }
                }
                cdt.cancel();
                animation(anseranime,ans1,ans2,ans3,maru,batu,alpha1,alpha2,alpha3,alpha4,alpha5,now_page,next_page,p1,p2);//正解アニメーション表示
            }
        });
    }

    protected static void animation(View view,final ImageView ans1,final ImageView ans2,final ImageView ans3,final ImageView maru,final ImageView batu
                            , final AlphaAnimation alpha1, final  AlphaAnimation alpha2, final AlphaAnimation alpha3, final AlphaAnimation alpha4, final AlphaAnimation alpha5
                            ,final Context now_page,final Class next_page,final MediaPlayer p1,final MediaPlayer p2)
    {

        //アニメーションの開始から終了までの時間設定
        alpha1.setDuration(500);
        alpha2.setDuration(500);
        alpha3.setDuration(500);
        alpha4.setDuration(1000);
        alpha5.setDuration(1000);

        alpha1.setFillAfter(true);
        alpha2.setFillAfter(true);
        alpha3.setFillAfter(true);
        alpha4.setFillAfter(true);
        alpha5.setFillAfter(true);

        p1.stop();
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

        alpha3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            //「ん」のアニメーション終了時に「ご」のアニメーションを開始
            public void onAnimationEnd(Animation animation) {

                if (dec == true) {
                    maru.startAnimation(alpha4);
                    Startscreen.anser++;//正解数を増やす
                } else if (dec == false) {
                    batu.startAnimation(alpha5);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        alpha4.setAnimationListener(new Animation.AnimationListener(){
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                number = 0;
                Sound_Tempo.releas_BGM();
                goToLoginActivity(now_page,next_page);
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
                Sound_Tempo.releas_BGM();
                goToLoginActivity(now_page,next_page);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        //「り」のアニメーションを開始
        ans1.startAnimation(alpha1);

    }

    public static void goToLoginActivity(Context now_page,Class next_page) {
        Intent login = new Intent(now_page, next_page);
        now_page.startActivity(login);
    }

    public static void button_false(final ImageButton button1, final ImageButton button2, final ImageButton button3, final ImageButton button4, final ImageButton button5, final ImageButton button6, final ImageButton button7){

        button1.setEnabled(false);//ボタンの効果消す
        button2.setEnabled(false);//ボタンの効果消す
        button3.setEnabled(false);//ボタンの効果消す
        button4.setEnabled(false);//ボタンの効果消す
        button5.setEnabled(false);//ボタンの効果消す
        button6.setEnabled(false);//ボタンの効果消す
        button7.setEnabled(false);//ボタンの効果消す

    }


}


