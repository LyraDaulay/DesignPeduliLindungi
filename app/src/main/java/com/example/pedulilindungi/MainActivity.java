package com.example.pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void clickperson(View view) {
        Intent i = new Intent(this, akun.class);
        startActivity(i);
    }

    public void clickvaksin(View view) {
        Intent i = new Intent(this, vaksin.class);
        startActivity(i);
    }

    public void clickhasil(View view) {
        Intent i = new Intent(this, hasil.class);
        startActivity(i);
    }

    public void  clicknotifikasi(View view){
        Intent i = new Intent(this, notifikasi.class);
        startActivity(i);
    }
}