package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sid.pandiri.Multiplicationtest1;

public class MultiplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        Toast toast = Toast.makeText(getApplicationContext(),
                "CONGRATULATIONS YOU MADE IN TO NEXT LEVEL  " +
                        "WELCOME TO MULTIPLICATION LEARNING  ",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, GuiActivity2.class);
        startActivity(intent);
    }

    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, Multiplication.class);
        startActivity(intent);
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this,GuiActivity2.class);
        startActivity(intent);
    }
}