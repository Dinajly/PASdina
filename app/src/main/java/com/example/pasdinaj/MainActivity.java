package com.example.pasdinaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgPerancis, imgSingapura, imgItalia, imgInggris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgPerancis = (CircleImageView) findViewById(R.id.eiffel);
        imgInggris = (CircleImageView) findViewById(R.id.bigben);
        imgItalia = (CircleImageView) findViewById(R.id.colosseum);
        imgSingapura = (CircleImageView) findViewById(R.id.merlion);

        imgPerancis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahPerancis = new Intent(MainActivity.this, perancis.class);
                startActivity(pindahPerancis);
            }
        });
        imgSingapura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSingapura = new Intent(MainActivity.this, singapura.class);
                startActivity(pindahSingapura);
            }
        });
        imgItalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahItalia = new Intent(MainActivity.this, italia.class);
                startActivity(pindahItalia);
            }
        });
        imgInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahInggris = new Intent(MainActivity.this, inggris.class);
                startActivity(pindahInggris);
            }
        });
    }}
