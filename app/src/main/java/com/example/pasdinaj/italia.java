package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class italia extends AppCompatActivity {
    Button btnItalia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italia);
        btnItalia = (Button) findViewById(R.id.btn_italia);

        btnItalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnItalia = new Intent(italia.this, ita.class);
                startActivity(pindahBtnItalia);
            }
        });
    }}