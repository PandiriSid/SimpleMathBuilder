package com.sid.pandiri.simplemathlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sid.pandiri.AdditionTest1;

public class Addition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition2);
        Button btnsum = (Button) findViewById(R.id.buttonsum);
        final EditText etv = (EditText) findViewById(R.id.editText1);
        final EditText etv2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView1);

        btnsum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sum = x + y; //Perform Maths operation
                result.setText("The ANS of " + x + " + " + y + " = " + sum);//print answer
            }
        });
    }
    public void goToAActivity(View view) {
        Intent intent = new Intent(this, Addition.class);
        startActivity(intent);
    }

    public void goToPrevActivity(View view) {
        Intent intent = new Intent(this,GuiActivity.class);
        startActivity(intent);
    }
    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, AdditionTest1.class);
        startActivity(intent);
    }
}

