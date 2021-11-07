package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Launcher extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);


    }

    public void gotoApp(View view) {
        Intent intent = new Intent(Launcher.this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoRepo(View view) {
        Uri webpage = Uri.parse("https://github.com/IqrarH/Emisision_Points_Android");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}