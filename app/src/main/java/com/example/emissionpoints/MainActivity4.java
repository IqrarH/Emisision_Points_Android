package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv = findViewById(R.id.textView8);
        Intent intent = getIntent();
        tv.setText(String.valueOf(intent.getIntExtra("score", 0)));
    }

    public void share(View view) {
        Intent intent = getIntent();
        String share = "My test score is "+ String.valueOf(intent.getIntExtra("score", 0)) +" out of 10";
        Intent intent1 = new Intent(Intent.ACTION_SEND);
        intent1.putExtra(Intent.EXTRA_TEXT, share);
        intent1.setType("*/*");
        startActivity(intent1);
    }
}