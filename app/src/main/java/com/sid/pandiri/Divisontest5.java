package com.sid.pandiri;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.sid.pandiri.simplemathlearn.Addition;
import com.sid.pandiri.simplemathlearn.R;

public class Divisontest5 extends AppCompatActivity {

    RadioButton search;
    private RadioGroup radioONo;
    int a;
    int name4;

    private RadioButton radioOButton;
    private Button btnDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisontest5);
        search = (RadioButton) findViewById(R.id.radioButton6);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        radioONo = (RadioGroup) findViewById(R.id.radioNo);
        btnDisplay = (Button) findViewById(R.id.button);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioONo.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioOButton = (RadioButton) findViewById(selectedId);
                a = Integer.parseInt(radioOButton.getText().toString());

                SharedPreferences mPreferences3 = getSharedPreferences("MyPREFERENCES3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = mPreferences3.edit();
                name4 = mPreferences3.getInt("Name3", 0);
                if (a == 20) {
                    name4 = name4 + 1;
                }

                if (name4 >3)

                {
                    editor.putInt("Name3", name4);
                    editor.commit();
                    goToNextActivity();
                }
                else {
                    name4=0;
                    editor.putInt("Name3", name4);
                    editor.apply();
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "You didn't pass the test  TRY AGAIN ",
                            Toast.LENGTH_SHORT);

                    toast.show();




                    goToOrigActivity();
                }

            }
        });
    }
    public void goToNextActivity() {

        Intent intent = new Intent(this,Addition.class);
        startActivity(intent);
    }

    public void goToOrigActivity() {
        Intent intent = new Intent(this,Divisontest1.class);
        startActivity(intent);
    }

}

