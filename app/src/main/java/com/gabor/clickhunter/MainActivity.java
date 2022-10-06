package com.gabor.clickhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView number;
    Button buttonPlus;
    Button buttonMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        number.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                number.setText("0");
                return true;
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numb = Integer.parseInt((String) number.getText())+1;
                String result =   Integer.toString(numb);
                number.setText(result);
                changeColor(numb);
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numb = Integer.parseInt((String) number.getText())-1;
                String result =   Integer.toString(numb);
                number.setText(result);
                changeColor(numb);
            }
        });
    }

    private void changeColor(int numb) {
        if (numb >0){
            number.setTextColor(Color.GREEN);
        } else if(0 > numb){
            number.setTextColor(Color.RED);
        }
    }

    private void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        number = findViewById(R.id.number);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
    }
}