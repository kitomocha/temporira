package com.example.kitep03.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Resultscreen extends AppCompatActivity {

    ImageView ri;
    ImageView n;
    ImageView go;

    AlphaAnimation alpha = new AlphaAnimation(1.0f,1.0f);
    AlphaAnimation alpha2 = new AlphaAnimation(1.0f,1.0f);
    AlphaAnimation alpha3 = new AlphaAnimation(1.0f,1.0f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultscreen);

        //ImageViewのIDを取得
        ri = findViewById(R.id.img_ba);
        n = findViewById(R.id.img_n);
        go = findViewById(R.id.img_go);

    }

    //buttonを押したときに呼び出される関数
    public void animation(View view){
        //アニメーションの開始から終了までの時間設定
        alpha.setDuration(500);
        alpha2.setDuration(500);
        alpha3.setDuration(500);

        alpha.setFillAfter(true);
        alpha2.setFillAfter(true);
        alpha3.setFillAfter(true);

        //「り」のアニメーションのリスナー
        alpha.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            //「り」のアニメーション終了時に「ん」のアニメーションを開始
            public void onAnimationEnd(Animation animation){
                n.startAnimation(alpha2);
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
                go.startAnimation(alpha3);
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
                Intent intent = new Intent(Resultscreen.this, t_result.class);
                //global.Global_Times_reset();
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        //「り」のアニメーションを開始
        ri.startAnimation(alpha);


    }
}
