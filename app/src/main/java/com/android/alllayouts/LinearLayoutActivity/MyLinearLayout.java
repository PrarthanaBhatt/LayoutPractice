package com.android.alllayouts.LinearLayoutActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.android.alllayouts.Dashboard;
import com.android.alllayouts.R;

public class MyLinearLayout extends AppCompatActivity {

    Button arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_my_linear_layout);

        arrow = findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MyLinearLayout.this, "Liear Layout clicked..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MyLinearLayout.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}