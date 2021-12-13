package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pr extends AppCompatActivity {
    Button btnBackPr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr);
        btnBackPr=(Button) findViewById(R.id.btn_pr);

        btnBackPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnPr = new Intent(pr.this, MainActivity.class);
                startActivity(pindahBtnPr);
            }
        });
    }
}