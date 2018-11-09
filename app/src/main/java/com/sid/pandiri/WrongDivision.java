package com.sid.pandiri;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sid.pandiri.simplemathlearn.GuiActivity3;
import com.sid.pandiri.simplemathlearn.R;

public class WrongDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_division);
        MediaPlayer ring= MediaPlayer.create(WrongDivision.this,R.raw.wrong);
        ring.start();
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, GuiActivity3.class);
        startActivity(intent);
    }
}