package com.example.michaelpham_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen2);
        TextView onCreate2 = new TextView(this);
        onCreate2.setText(R.string.onCreate2);
        linearLayout.addView(onCreate2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen2);
        TextView onStart2 = new TextView(this);
        onStart2.setText(R.string.onStart2);
        linearLayout.addView(onStart2);
    }

    protected void onStop() {
        super.onStop();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen2);
        TextView onStop2 = new TextView(this);
        onStop2.setText(R.string.onStop2);
        linearLayout.addView(onStop2);
    }

    protected void onDestroy() {
        super.onDestroy();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screen2);
        TextView onDestroy2 = new TextView(this);
        onDestroy2.setText(R.string.onDestroy2);
        linearLayout.addView(onDestroy2);
    }
}