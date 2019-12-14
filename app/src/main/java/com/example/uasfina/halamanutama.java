package com.example.uasfina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halamanutama extends AppCompatActivity implements View.OnClickListener {
    private Button btnExit;
    private Button btnAbout;
    private Button btnSaran;
    private Button btnFood;
    private Button btnGaleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanutama);

        btnExit = (Button) findViewById(R.id.btn_exit);
        btnAbout =  findViewById(R.id.btn_about);
        btnSaran = findViewById(R.id.btn_saran);
        btnFood = findViewById(R.id.btn_food);
        btnGaleri = findViewById(R.id.btn_galeri);


        btnExit.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnSaran.setOnClickListener(this);
        btnFood.setOnClickListener(this);
        btnGaleri.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.btn_exit:
                startActivity(new Intent( this, MainActivity.class));
                break;
        }
        switch (view.getId()) {
            case R.id.btn_about:
                startActivity(new Intent(this, about.class));
        }
        switch (view.getId()) {
            case R.id.btn_saran:
                startActivity(new Intent(this, saran.class));
        }
        switch (view.getId()) {
            case R.id.btn_food:
                startActivity(new Intent(this, food.class));
        }
        switch (view.getId()) {
            case R.id.btn_galeri:
                startActivity(new Intent(this, galeri.class));
        }
    }
}
