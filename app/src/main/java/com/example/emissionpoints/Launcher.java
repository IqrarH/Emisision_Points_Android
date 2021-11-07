package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Launcher extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);


    }

    public void gotoApp(View view) {
        intent = new Intent(Launcher.this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoRepo(View view) {

    }
}