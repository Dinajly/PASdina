package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class singapura extends AppCompatActivity {
    Button btnSingapura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singapura);
        btnSingapura = (Button) findViewById(R.id.btn_singapura);

        btnSingapura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnSingapura = new Intent(singapura.this, sg.class);
                startActivity(pindahBtnSingapura);
            }
        });
    }}