package com.example.week_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3a1 extends AppCompatActivity {

    static String name;
    static String rollno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3a1);
        setTitle("2211CS010547 Subhapreet Patros");
    }
    public void SayHello(View view){
        EditText editTextName;
        editTextName = findViewById(R.id.editTextName);

        String name = editTextName.getText().toString();

        Intent intent = new Intent(MainActivity3a1.this, MainActivity3a2.class);
        intent.putExtra("name",name);
        startActivity(intent);

    }
}
