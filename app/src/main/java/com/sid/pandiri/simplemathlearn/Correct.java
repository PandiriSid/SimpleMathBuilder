package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Correct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this,Addition.class);
        startActivity(intent);
    }
}
