package com.example.week_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3b2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3b2);
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("KEY");

        TextView textReceived1 = findViewById(R.id.textReceived1);
        TextView textReceived2 = findViewById(R.id.textReceived2);
        textReceived1.setText(student.getName());
        textReceived2.setText(student.getRollno());
    }
}