package com.example.test_nhanh01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("user_name", name);
            startActivity(intent);
        });
    }
}