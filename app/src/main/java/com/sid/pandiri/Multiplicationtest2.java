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

public class Multiplicationtest2 extends AppCompatActivity {


    RadioButton search;
    private RadioGroup radioONo;
    int a;
    int name3;

    private RadioButton radioOButton;
    private Button btnDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicationtest2);
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

                SharedPreferences mPreferences2 = getSharedPreferences("MyPREFERENCES2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = mPreferences2.edit();
                name3 = mPreferences2.getInt("Name2", 0);
                if (a == 35) {
                    name3 = name3 + 1;
                }
                editor.putInt("Name2", name3);
                editor.commit();
                goToNextActivity();
            }
        });
    }
    public void goToNextActivity() {

        Intent intent = new Intent(this,Multiplicationtest3.class);
        startActivity(intent);
    }

}

