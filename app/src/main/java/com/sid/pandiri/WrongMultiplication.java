package com.sid.pandiri;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sid.pandiri.simplemathlearn.GuiActivity2;
import com.sid.pandiri.simplemathlearn.R;

public class WrongMultiplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_multiplication);
        MediaPlayer ring= MediaPlayer.create(WrongMultiplication.this,R.raw.wrong);
        ring.start();
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, GuiActivity2.class);
        startActivity(intent);
    }
}