package com.example.pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
    }

    public void clickback3(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }
}