package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inggris extends AppCompatActivity {
    Button btnInggris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inggris);
        btnInggris=(Button) findViewById(R.id.btn_inggris);

        btnInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnInggris = new Intent(inggris.this, ig.class);
                startActivity(pindahBtnInggris);
    }
});
}}