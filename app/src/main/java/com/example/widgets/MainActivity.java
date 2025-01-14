package com.example.widgets;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.widgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MyListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listener = new MyListener(binding);

        binding.buttonYes.setOnClickListener(listener);
        binding.buttonNo.setOnClickListener(listener);
    }
}
