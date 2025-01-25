package com.example.week_2;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assignment1b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1b);

        Faculty faculty = (Faculty) getIntent().getSerializableExtra("key");

        String name = "Name: <b>" + faculty.getName() + "</b>";
        String designation = "Designation: <b>" + faculty.getDesignation() + "</b>";
        String gender = "Gender: <b>" + faculty.getGender() + "</b>";
        String dateOfJoin = "Date of Joining: <b>" + faculty.getDate_of_join() + "</b>";

        String experience = "Experience: <b>" + calculateExperience(faculty.getDate_of_join()) + "</b>";

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(Html.fromHtml(name));

        TextView textViewDesignation = findViewById(R.id.textViewDesignation);
        textViewDesignation.setText(Html.fromHtml(designation));

        TextView textViewGender = findViewById(R.id.textViewGender);
        textViewGender.setText(Html.fromHtml(gender));

        TextView textViewDateOfJoin = findViewById(R.id.textViewDateOfJoin);
        textViewDateOfJoin.setText(Html.fromHtml(dateOfJoin));

        TextView textViewExperience = findViewById(R.id.textViewExperience);
        textViewExperience.setText(Html.fromHtml(experience));
    }

    private String calculateExperience(String dateOfJoining) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date joiningDate = dateFormat.parse(dateOfJoining);
            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(joiningDate);

            Calendar endCalendar = Calendar.getInstance();

            int years = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
            int months = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
            int days = endCalendar.get(Calendar.DAY_OF_MONTH) - startCalendar.get(Calendar.DAY_OF_MONTH);

            if (days < 0) {
                months--;
                endCalendar.add(Calendar.MONTH, -1);
                days += endCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            }

            if (months < 0) {
                years--;
                months += 12;
            }

            return years + " years, " + months + " months, and " + days + " days";
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid Date";
        }
    }
}
