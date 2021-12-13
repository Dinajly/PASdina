package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ita extends AppCompatActivity {
    Button btnBackIta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ita);
        btnBackIta=(Button) findViewById(R.id.btn_ita);

        btnBackIta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnIta = new Intent(ita.this, MainActivity.class);
                startActivity(pindahBtnIta);
            }
        });
    }
}