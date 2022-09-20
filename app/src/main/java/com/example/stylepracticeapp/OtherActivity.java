package com.example.stylepracticeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void switchScreens(View v) {
        Intent intent = new Intent(OtherActivity.this, MainActivity.class);
        startActivity(intent);
    }
}