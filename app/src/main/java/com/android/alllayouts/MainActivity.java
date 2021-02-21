package com.android.alllayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.android.alllayouts.ConstraintLayoutActivity.MyConstraintLayout;
import com.android.alllayouts.LinearLayoutActivity.MyLinearLayout;
import com.android.alllayouts.RelativeLayoutActivity.MyRelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button linear,relative,constraint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.linear);
        relative = findViewById(R.id.relative);
        constraint = findViewById(R.id.constraint);


    }

    public void callLinearLayout(View view) {
        Intent intent = new Intent(MainActivity.this, MyLinearLayout.class);
        startActivity(intent);
    }

    public void callRelativeLayout(View view) {
        Intent intent = new Intent(MainActivity.this, MyRelativeLayout.class);
        startActivity(intent);
    }

    public void callConstraintLayout(View view) {
        Intent intent = new Intent(MainActivity.this, MyConstraintLayout.class);
        startActivity(intent);
    }
}