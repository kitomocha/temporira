package com.example.kitep03.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class t_result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_result);
        TextView Ansnumber = (TextView)findViewById(R.id.textView5);
        final ImageButton button6 = (ImageButton)findViewById(R.id.button6);
        final ImageButton button7 = (ImageButton)findViewById(R.id.button7);

        Ansnumber.setText(""+Startscreen.anser);
        Startscreen.anser = 0;//正解数をリセット

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(t_result.this,Startscreen.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(t_result.this,Startscreen.class);
                startActivity(intent);
            }
        });
    }
}
