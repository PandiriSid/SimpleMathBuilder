package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this,GuiActivity.class);
        startActivity(intent);
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this,Addition.class);
        startActivity(intent);
    }
    public void goToPrevActivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
