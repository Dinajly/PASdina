package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perancis extends AppCompatActivity {
    Button btnPerancis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perancis);
        btnPerancis=(Button) findViewById(R.id.btn_perancis);

        btnPerancis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnPerancis = new Intent(perancis.this, pr.class);
                startActivity(pindahBtnPerancis);
            }
        });
    }
}