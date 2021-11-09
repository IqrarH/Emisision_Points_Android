package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    //    String [] halaqiya = new String[]{"خ","غ","ح","ع","أ","ہ"};
    String [] mcqs = new String[]{
            "The sound of  ہ أ is produced from:",
            "The sound of  ع ح is produced from:",
            "The sound of  خ غ is produced from:",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}