package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CorrectMultiplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_multiplication);
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this,Multiplication.class);
        startActivity(intent);
    }
}