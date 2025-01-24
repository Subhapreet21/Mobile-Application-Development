package com.example.week_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.Calendar;

public class MainActivity4a extends AppCompatActivity implements
        DatePickerDialog.OnDateSetListener {

    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4a);

        student = new Student();

        FillState();
    }

    public void SaveData(View view){
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        EditText editTextAddress = findViewById(R.id.editTextAddress);
        EditText editTextAge = findViewById(R.id.editTextAge);
        EditText editTextDOB = findViewById(R.id.editTextDOB);

        student.setName(editTextName.getText().toString());
        student.setPassword(editTextPassword.getText().toString());
        student.setAddress(editTextAddress.getText().toString());

        student.setGender(GetGender());

        student.setAge(editTextAge.getText().toString());
        student.setDOB(editTextDOB.getText().toString());

        Intent intent = new Intent(MainActivity4a.this, MainActivity4b.class);
        intent.putExtra("key", student);
        startActivity(intent);
    }

    private String GetGender(){
        RadioGroup rbGroupGender = findViewById(R.id.rbGroupGender);
        RadioButton selectedRadioButton;

        int selectedRadioButtonId = rbGroupGender.getCheckedRadioButtonId();

        if (selectedRadioButtonId != -1) {
            selectedRadioButton = findViewById(selectedRadioButtonId);
            String selectedGender = selectedRadioButton.getText().toString();
            return selectedGender;
        }else {
            return "";
        }
    }

    private void FillState(){
        String[] data = { "Telangana", "Andhra Pradesh"};
        Spinner spinnerState = findViewById(R.id.spinnerState);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new
                ArrayAdapter(this,android.R.layout.simple_spinner_item,data);


        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinnerState.setAdapter(aa);
        spinnerState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        student.setState(adapterView.getItemAtPosition(i).toString());
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    });
    }

    public void ShowDatePicker(View view){
        DatePickerDialog dialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        dialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int
            dayOfMonth) {
        monthOfYear++;
        student.setDOB(dayOfMonth + "-" + monthOfYear + "-" + year);

        EditText editTextDOB = findViewById(R.id.editTextDOB);
        editTextDOB.setText(student.getDOB());
    }
}