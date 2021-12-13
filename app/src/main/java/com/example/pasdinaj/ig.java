package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ig extends AppCompatActivity {
    Button btnBackIg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ig);
        btnBackIg=(Button) findViewById(R.id.btn_ig);

        btnBackIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnIg = new Intent(ig.this, MainActivity.class);
                startActivity(pindahBtnIg);
            }
        });
    }
}