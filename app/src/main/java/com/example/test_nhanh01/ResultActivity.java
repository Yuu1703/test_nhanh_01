package com.example.test_nhanh01;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult, tvRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = findViewById(R.id.tv_result);
        tvRandom = findViewById(R.id.tv_random_number);

        String name = getIntent().getStringExtra("user_name");
        tvResult.setText("Hello, " + name + "!");

        int randomNumber = new Random().nextInt(100) + 1; // random 1–100
        tvRandom.setText("Random number: " + randomNumber);
    }
}