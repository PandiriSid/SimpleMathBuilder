package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);

        MediaPlayer ring= MediaPlayer.create(Wrong.this,R.raw.wrong);
        ring.start();
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, GuiActivity.class);
        startActivity(intent);
    }
}
