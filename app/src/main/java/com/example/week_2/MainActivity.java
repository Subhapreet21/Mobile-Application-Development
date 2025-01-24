package com.example.week_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button week_1;
    Button week_2;
    Button week_3a;
    Button week_3b;
    Button week_4;
    Button week_5;
    Button assignment_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignment_1=findViewById(R.id.assignment1);
        week_1=findViewById(R.id.week1);
        week_2=findViewById(R.id.week2);
        week_3a=findViewById(R.id.week3a);
        week_3b=findViewById(R.id.week3b);
        week_4=findViewById(R.id.week4);
        week_5=findViewById(R.id.week5);

        week_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityWeek1=new Intent(MainActivity.this,MainActivity1.class);
                startActivity(switchActivityWeek1);
            }
        });

        week_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityWeek2=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(switchActivityWeek2);
            }
        });

        week_3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityWeek3a=new Intent(MainActivity.this, MainActivity3a1.class);
                startActivity(switchActivityWeek3a);
            }
        });

        week_3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityWeek3b=new Intent(MainActivity.this, MainActivity3b1.class);
                startActivity(switchActivityWeek3b);
            }
        });

        week_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityWeek4=new Intent(MainActivity.this,MainActivity4a.class);
                startActivity(switchActivityWeek4);
            }
        });

        week_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityWeek5=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(switchActivityWeek5);
            }
        });
        assignment_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityAssignment1=new Intent(MainActivity.this,Assignment1a.class);
                startActivity(switchActivityAssignment1);
            }
        });
    }
}