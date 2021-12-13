package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sg extends AppCompatActivity {
    Button btnBackSg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sg);
        btnBackSg=(Button) findViewById(R.id.btn_sg);

        btnBackSg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnSg = new Intent(sg.this, MainActivity.class);
                startActivity(pindahBtnSg);
            }
        });
    }
}