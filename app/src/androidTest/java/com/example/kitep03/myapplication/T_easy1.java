package com.example.kitep03.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View.OnClickListener;

public class T_easy1 extends AppCompatActivity {

    SoundPool sp;
    int sound_id1;
    int sound_id2;
    int sound_id3;
    int sound_id4;
    int sound_id5;
    int sound_id6;
    int sound_id7;
    private Button push_btn1;
    private Button push_btn2;
    private Button push_btn3;
    private Button push_btn4;
    private Button push_btn5;
    private Button push_btn6;
    private Button push_btn7;

    String ans[] = new String[8];
    String corect[] = new String[8];
    int number=0;
    boolean dec = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button)findViewById(R.id.button);
        final Button button2 = (Button)findViewById(R.id.button2);
        final Button button3 = (Button)findViewById(R.id.button3);
        final Button button4 = (Button)findViewById(R.id.button4);
        final Button button5 = (Button)findViewById(R.id.button5);
        final Button button6 = (Button)findViewById(R.id.button6);
        final Button button7 = (Button)findViewById(R.id.button7);

        TextView textView = (TextView)findViewById(R.id.textView);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);

        textView.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        corect[0] = "り";
        corect[1] = "ん";
        corect[2] = "ご";


            //画面のアイテムと紐付け
            push_btn1 = (Button)findViewById(R.id.button);
            push_btn2 = (Button)findViewById(R.id.button2);
            push_btn3 = (Button)findViewById(R.id.button3);
            push_btn4 = (Button)findViewById(R.id.button4);
            push_btn5 = (Button)findViewById(R.id.button5);
            push_btn6 = (Button)findViewById(R.id.button6);
            push_btn6 = (Button)findViewById(R.id.button7);

            //インスタンス作成
            sp = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
            sound_id1 = sp.load(this, R.raw.pop1, 1 );
            sound_id2 = sp.load(this, R.raw.pop1, 1 );
            sound_id3 = sp.load(this, R.raw.pop1, 1 );
            sound_id4 = sp.load(this, R.raw.pop1, 1 );
            sound_id5 = sp.load(this, R.raw.pop1, 1 );
            sound_id6 = sp.load(this, R.raw.pop1, 1 );
            sound_id7 = sp.load(this, R.raw.pop1, 1 );


            Button btn = new Button(this);
            push_btn1.setOnClickListener(new OnClickListener(){ //ボタン１押した時に発動
                @Override
                public void onClick(View v){
                    sp.play(sound_id1, 1.0F, 1.0F, 0, 0, 1.0F); //音がなる
                }
            });

            push_btn2.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    sp.play(sound_id2, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            });

            push_btn3.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    sp.play(sound_id3, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            });

            push_btn4.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    sp.play(sound_id4, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            });

            push_btn5.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    sp.play(sound_id5, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            });

            push_btn6.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    sp.play(sound_id6, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            });

            push_btn7.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    sp.play(sound_id7, 1.0F, 1.0F, 0, 0, 1.0F);
                }
            });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                if(textView.getText() == "") {
                    textView.setText("り");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("り");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("り");
                }

                ans[number] = "り";
                number++;
                button.setEnabled(false);
                textView4.setText(""+number);

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                if(textView.getText() == "") {
                    textView.setText("ん");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("ん");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("ん");
                }
                ans[number] = "ん";
                number++;
                button2.setEnabled(false);
                textView4.setText(""+number);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                if(textView.getText() == "") {
                    textView.setText("ご");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("ご");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("ご");
                }
                ans[number] = "ご";
                number++;
                button3.setEnabled(false);
                textView4.setText(""+number);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                if(textView.getText() == "") {
                    textView.setText("う");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("う");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("う");
                }
                ans[number] = "う";
                number++;
                button4.setEnabled(false);
                textView4.setText(""+number);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                if(textView.getText() == "") {
                    textView.setText("ち");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("ち");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("ち");
                }
                ans[number] = "ち";
                number++;
                button5.setEnabled(false);
                textView4.setText(""+number);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);

                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                button.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                number = 0;
                dec = false;
            }


        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                TextView textView4 = (TextView)findViewById(R.id.textView4);


                if (ans[0] == corect[0]) {
                    if (ans[1] == corect[1]) {
                        if (ans[2] == corect[2]) {
                            dec = true;
                        }
                    }
                }


                if(dec == true){
                    textView4.setText("正解");
                }else if(dec == false){
                    textView4.setText("不正解");
                }
                /*
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                button.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                number = 0;*/

            }


        });



        String text = textView.getText().toString();
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }

}

