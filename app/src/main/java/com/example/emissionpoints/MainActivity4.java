package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = findViewById(R.id.textView8);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        tv.setText(intent.getStringExtra("score").toString());
    }
}