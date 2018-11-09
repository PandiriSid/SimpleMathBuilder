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

import com.sid.pandiri.simplemathlearn.R;
import com.sid.pandiri.simplemathlearn.SubtractionActivity;

public class AdditionTest5 extends AppCompatActivity {
    RadioButton search;
    private RadioGroup radioONo;
    int a;
    int name1;

    private RadioButton radioOButton;
    private Button btnDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_test5);
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

                SharedPreferences mPreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = mPreferences.edit();
                name1 = mPreferences.getInt("Name", 0);
                if (a == 72) {
                    name1 = name1 + 1;
                }

                if (name1 >3)

                {
                    editor.putInt("Name", name1);
                    editor.apply();
                    goToNextActivity();

                } else {
                    name1=0;
                    editor.putInt("Name", name1);
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

        Intent intent = new Intent(this,SubtractionActivity.class);
        startActivity(intent);
    }
    public void goToPrevActivity() {
        Intent intent = new Intent(this,AdditionTest4.class);
        startActivity(intent);
    }
    public void goToOrigActivity() {
        Intent intent = new Intent(this,AdditionTest1.class);
        startActivity(intent);
    }

}
