package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
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
        Uri webpage = Uri.parse("https://recitewithlove.files.wordpress.com/2015/12/chapter-3-makharij-ul-huroof-with-logo.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void gotoQuiz(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
}