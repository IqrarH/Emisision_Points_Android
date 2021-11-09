package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    //    String [] halaqiya = new String[]{"خ","غ","ح","ع","أ","ہ"};
    //    String [] lahatiya = new String[]{"ک","ق"};
    //    String [] shajariyahHaafiyah = new String[]{"ض","ی","ش","ج"};
    //    String [] tarfiyah = new String[]{"ر","ن","ل"};
    //    String [] niteeyah = new String[]{"ط","د","ت"};
    //    String [] lisaveyah = new String[]{"ث","ذ","ظ","س","ز","ص"};
    //    String [] ghunna = new String[]{"ن","م"};
    int count = 0;
    String [] mcqs = new String[]{
            "The sound of  ہ أ is produced from:",
            "The sound of  ع ح is produced from:",
            "The sound of غ خ is produced from:",
            "Arabic Letters  ع ح ہ أ خ غ belongs to:",
            "Arabic Letters ق ک belongs to:",
            "Arabic Letters ج ش ی ض belongs to:",
            "Arabic Letters ل ن ر belongs to:",
            "The sound of Nit-eeyah is produced from:",
            "Lisaveyah letters are: ",
            "Ghunna letters are:",
    };

    String [] correctAnswers = new String[]{
            "End of throat",
            "Middle of throat",
            "Start of the throat",
            "Halaqiya",
            "Lahatiya",
            "Shajariyah-Haafiyah",
            "Tarfiyah",
            "Tip of the tongue touching the base of the front 2 teeth",
            "All of the above",
            "Both A & B",
    };

    String [][] options = new String[][]{
            {"End of throat", "Middle of throat", "Start of the throat", "Middle of tongue"},
            {"End of throat", "Middle of throat", "Start of the throat", "Middle of tongue"},
            {"End of throat", "Middle of throat", "Start of the throat", "Middle of tongue"},
            {"Lahatiya", "Halaqiya", "Tarfiyah", "None of the above"},
            {"Lahatiya", "Halaqiya", "Tarfiyah", "None of the above"},
            {"Lahatiya", "Halaqiya", "Shajariyah-Haafiyah", "None of the above"},
            {"Lahatiya", "Halaqiya", "Tarfiyah", "None of the above"},
            {"Tip of the tongue touching the base of the front 2 teeth", "Middle of throat", "Start of the throat", "Middle of tongue"},
            {"ظ", "ذ", "ث", "All of the above"},
            {"ن", "م", "Both A & B", "None of the above"}
    };

    TextView tv;
    TextView qNoTv;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    RadioGroup rg;
    Button nextBtn;
    Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv = findViewById(R.id.questionTv);
        qNoTv = findViewById(R.id.qNoTv);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        nextBtn = findViewById(R.id.button4);
        finishBtn = findViewById(R.id.finishBtn);


        finishBtn.setVisibility(View.GONE);
        tv.setText(mcqs[0]);
        rb1.setText(options[0][0]);
        rb2.setText(options[0][1]);
        rb3.setText(options[0][2]);
        rb4.setText(options[0][3]);

    }

    public void nextMcq(View view) {
        rg.clearCheck();
        int qCount = count + 2;
        if(count < 9) {
            qNoTv.setText(String.valueOf(qCount++));
            tv.setText(mcqs[++count]);
            rb1.setText(options[count][0]);
            rb2.setText(options[count][1]);
            rb3.setText(options[count][2]);
            rb4.setText(options[count][3]);
            if(count == 9){
                nextBtn.setEnabled(false);
                finishBtn.setVisibility(View.VISIBLE);
            }
        }
    }

    public void finish(View view) {
        Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(intent);
    }
}