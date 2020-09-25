package com.example.michaelpham_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen1);
        TextView onCreate = new TextView(this);
        onCreate.setText(R.string.onCreate);
        linearLayout.addView(onCreate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen1);
        TextView onStart = new TextView(this);
        onStart.setText(R.string.onStart);
        linearLayout.addView(onStart);
    }

    protected void onStop() {
        super.onStop();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen1);
        TextView onStop = new TextView(this);
        onStop.setText(R.string.onStop);
        linearLayout.addView(onStop);
    }

    protected void onDestroy() {
        super.onDestroy();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen1);
        TextView onDestroy = new TextView(this);
        onDestroy.setText(R.string.onDestroy);
        linearLayout.addView(onDestroy);
    }
}