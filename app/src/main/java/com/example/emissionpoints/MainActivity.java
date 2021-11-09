package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//    String [] halaqiya = new String[]{"خ","غ","ح","ع","أ","ہ"};
//    String [] lahatiya = new String[]{"ک","ق"};
//    String [] shajariyahHaafiyah = new String[]{"ض","ی","ش","ج"};
//    String [] tarfiyah = new String[]{"ر","ن","ل"};
//    String [] niteeyah = new String[]{"ط","د","ت"};
//    String [] lisaveyah = new String[]{"ث","ذ","ظ","س","ز","ص"};
//    String [] ghunna = new String[]{"ن","م"};

    TextView tv;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tv = findViewById(R.id.tv);
//        nextBtn = (Button) findViewById(R.id.nextBtn);
//        tv.setText(halaqiya[0]);
//
//        nextBtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                tv.setText(halaqiya[new Random().nextInt(6)]);
//            }
//        });

    }

    public void gotoRevise(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void gotoQuiz(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
}