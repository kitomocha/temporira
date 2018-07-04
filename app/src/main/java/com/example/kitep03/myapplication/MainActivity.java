package com.example.kitep03.work1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kitep03.myapplication.R;


public class MainActivity extends AppCompatActivity  {

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

package com.example.kitep03.work1;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;



public class MainActivity extends AppCompatActivity  {

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

