package com.example.week_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.text.Html;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4b extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4b);

        Student student = (Student) getIntent().getSerializableExtra("key");
//        Toast.makeText(this, student.getName(), Toast.LENGTH_SHORT).show();
        String name = "Name: <b>" + student.getName() + "</b>";
        String password = "Password: <b>*****</b>";
        String address = "Address: <b>" + student.getAddress() + "</b>";
        String gender = "Gender: <b>" + student.getGender() + "</b>";
        String age = "Age (in Years): <b>" + student.getAge() + "</b>";
        String dob = "Date of Birth: <b>" + student.getDOB() + "</b>";
        String state = "State: <b>" + student.getState() + "</b>";

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(Html.fromHtml(name));

        TextView textViewPassword = findViewById(R.id.textViewPassword);
        textViewPassword.setText(Html.fromHtml(password));

        TextView textViewAddress = findViewById(R.id.textViewAddress);
        textViewAddress.setText(Html.fromHtml(address));

        TextView textViewGender = findViewById(R.id.textViewGender);
        textViewGender.setText(Html.fromHtml(gender));

        TextView textViewAge = findViewById(R.id.textViewAge);
        textViewAge.setText(Html.fromHtml(age));

        TextView textViewDOB = findViewById(R.id.textViewDOB);
        textViewDOB.setText(Html.fromHtml(dob));

        TextView textViewState = findViewById(R.id.textViewState);
        textViewState.setText(Html.fromHtml(state));

    }
}