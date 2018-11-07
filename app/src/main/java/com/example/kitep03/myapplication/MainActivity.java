package com.example.kitep03.myapplication;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String ans[] = new String[8];
    String corect[] = new String[8];
    int number=0;
    public static int anser;
    boolean dec = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton button = (ImageButton )findViewById(R.id.Button1);
        final ImageButton button2 = (ImageButton )findViewById(R.id.Button2);
        final ImageButton button3 = (ImageButton )findViewById(R.id.Button3);
        final ImageButton button4 = (ImageButton )findViewById(R.id.Button4);
        final ImageButton button5 = (ImageButton )findViewById(R.id.Button5);
        final Button button6 = (Button)findViewById(R.id.button6);
        final Button button7 = (Button)findViewById(R.id.button7);

        TextView textView = (TextView)findViewById(R.id.textView);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);

        textView.setText("");
        textView2.setText("");
        textView3.setText("");

        button.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
        button2.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
        button3.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
        button4.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
        button5.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);

        corect[0] = "り";
        corect[1] = "ん";
        corect[2] = "ご";


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                if(textView.getText() == "") {
                    textView.setText("り");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("り");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("り");
                }

                ans[number] = "り";
                number++;
                button.setEnabled(false);//ボタンの効果を消滅
                button.setColorFilter(0xaadddd00,PorterDuff.Mode.SRC_IN);//ボタンの色を変える

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                if(textView.getText() == "") {
                    textView.setText("ん");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("ん");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("ん");
                }
                ans[number] = "ん";
                number++;
                button2.setEnabled(false);//ボタンの効果を消滅
                button2.setColorFilter(0xaadddd00,PorterDuff.Mode.SRC_IN);//ボタンの色を変える
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                if(textView.getText() == "") {
                    textView.setText("ご");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("ご");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("ご");
                }
                ans[number] = "ご";
                number++;
                button3.setEnabled(false);//ボタンの効果を消滅
                button3.setColorFilter(0xaadddd00,PorterDuff.Mode.SRC_IN);//ボタンの色を変える
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                if(textView.getText() == "") {
                    textView.setText("う");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("う");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("う");
                }
                ans[number] = "う";
                number++;
                button4.setEnabled(false);//ボタンの効果を消滅
                button4.setColorFilter(0xaadddd00,PorterDuff.Mode.SRC_IN);//ボタンの色を変える
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                if(textView.getText() == "") {
                    textView.setText("ち");
                } else if(textView.getText() != "" && textView2.getText() == "") {
                    textView2.setText("ち");
                }else if(textView.getText() != "" && textView2.getText() != "" && textView3.getText() == ""){
                    textView3.setText("ち");
                }
                ans[number] = "ち";
                number++;
                button5.setEnabled(false);//ボタンの効果を消滅
                button5.setColorFilter(0xaadddd00,PorterDuff.Mode.SRC_IN);//ボタンの色を変える
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.textView);
                TextView textView2 = (TextView)findViewById(R.id.textView2);
                TextView textView3 = (TextView)findViewById(R.id.textView3);

                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                button.setEnabled(true);//ボタンの効果を復活
                button.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);//ボタンの色を復活
                button2.setEnabled(true);
                button2.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
                button3.setEnabled(true);
                button3.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
                button4.setEnabled(true);
                button4.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
                button5.setEnabled(true);
                button5.setColorFilter(0xccffff00,PorterDuff.Mode.SRC_IN);
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


                if (ans[0] == corect[0]) {
                    if (ans[1] == corect[1]) {
                        if (ans[2] == corect[2]) {
                            dec = true;
                        }
                    }
                }

/*
                if(dec == true){
                    textView4.setText("正解");
                    MainActivity.anser++;
                }else if(dec == false){
                    textView4.setText("不正解");
                }
*/
                Intent intent = new Intent(MainActivity.this, Resultscreen.class);
                //global.Global_Times_reset();
                startActivity(intent);

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