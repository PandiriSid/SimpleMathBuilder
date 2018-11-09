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
import android.widget.Toast;

import com.sid.pandiri.simplemathlearn.Addition;
import com.sid.pandiri.simplemathlearn.AdditionActivity;
import com.sid.pandiri.simplemathlearn.MultiplicationActivity;
import com.sid.pandiri.simplemathlearn.R;
import com.sid.pandiri.simplemathlearn.SubtractionActivity;

public class Subtractiontest5 extends AppCompatActivity {

    RadioButton search;
    private RadioGroup radioONo;
    int a;
    int name2;

    private RadioButton radioOButton;
    private Button btnDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtractiontest5);
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

                SharedPreferences mPreferences1 = getSharedPreferences("MyPREFERENCES1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = mPreferences1.edit();
                name2 = mPreferences1.getInt("Name1", 0);
                if (a == 35) {
                    name2 = name2 + 1;
                }

                if (name2 >3)

                {
                    editor.putInt("Name1",name2);
                    editor.commit();
                    goToNextActivity();
                } else {
                    name2=0;
                    editor.putInt("Name1", name2);
                    editor.commit();
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

        Intent intent = new Intent(this,MultiplicationActivity.class);
        startActivity(intent);
    }

    public void goToOrigActivity() {
        Intent intent = new Intent(this,Subtractiontest1.class);
        startActivity(intent);
    }

}

