package com.sid.pandiri;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sid.pandiri.simplemathlearn.R;

public class Divisontest4 extends AppCompatActivity {

    RadioButton search;
    private RadioGroup radioONo;
    int a;
    int name4;

    private RadioButton radioOButton;
    private Button btnDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisontest4);
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
                if (a == 7) {
                    name4 = name4 + 1;
                }
                editor.putInt("Name3", name4);
                editor.commit();
                goToNextActivity();
            }
        });
    }
    public void goToNextActivity() {

        Intent intent = new Intent(this,Divisontest5.class);
        startActivity(intent);
    }

}

