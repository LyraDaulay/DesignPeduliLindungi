package com.example.pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vaksin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaksin);
    }

    public void clickback1(View view) {
        Intent v = new Intent(this, MainActivity.class);
        startActivity(v);
    }
}