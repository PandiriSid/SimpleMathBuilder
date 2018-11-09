package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DivisonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divison);
        Toast toast = Toast.makeText(getApplicationContext(),
                "CONGRATULATIONS YOU MADE IN TO NEXT LEVEL " +
                        "WELCOME TO DIVISON LEARNING  ",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, GuiActivity3.class);
        startActivity(intent);
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, Divison.class);
        startActivity(intent);
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this,GuiActivity3.class);
        startActivity(intent);
    }
}