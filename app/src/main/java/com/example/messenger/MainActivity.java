package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.captaindroid.tvg.Tvg;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.buttonGradientText);
        btn = findViewById(R.id.gradientButton);

        Tvg.change(tv, Color.parseColor("#0CFF5F"),  Color.parseColor("#0086FE"));
    }
}