package com.example.week_2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    // Declare variables as class-level fields
    private EditText editTextName;
    private Button btnSayHello;
    private TextView tvGreeting;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextName = findViewById(R.id.editTextName);
        btnSayHello = findViewById(R.id.btnSayHello);
        btnClear=findViewById(R.id.btnClear);
        tvGreeting = findViewById(R.id.tvGreeting);

        btnSayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                if (!name.isEmpty()) {
                    tvGreeting.setText("Hello, " + name + "!");
                } else {
                    tvGreeting.setText("Please enter your name!");
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editTextName.setText(" ");
            }
        });
    }
}
