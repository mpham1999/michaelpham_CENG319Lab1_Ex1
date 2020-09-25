package com.example.michaelpham_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen3);
        TextView onCreate3 = new TextView(this);
        onCreate3.setText("Main Activity: \n Create Executed");
        linearLayout.addView(onCreate3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen3);
        TextView onStart3 = new TextView(this);
        onStart3.setText(R.string.onStart3);
        linearLayout.addView(onStart3);
    }

    protected void onStop() {
        super.onStop();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen3);
        TextView onStop3 = new TextView(this);
        onStop3.setText(R.string.onStop3);
        linearLayout.addView(onStop3);
    }

    protected void onDestroy() {
        super.onDestroy();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen3);
        TextView onDestroy3 = new TextView(this);
        onDestroy3.setText(R.string.onDestroy3);
        linearLayout.addView(onDestroy3);
    }
    }
