package com.sid.pandiri.simplemathlearn;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.sid.pandiri.WrongSubtractrion;

public class GuiActivity1 extends AppCompatActivity {


    ImageButton search;
    final Context context = this;
    ImageButton search1;
    final Context context1 = this;
    ImageButton search2;
    final Context context2 = this;
    ImageButton search3;
    final Context context3 = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui1);
        search =(ImageButton)findViewById(R.id.ladoos5);
        try {
            search.setOnClickListener(new View.OnClickListener()   {
                public void onClick(View arg0) {

                    Intent intent = new Intent(context,CorrectSubtraction.class);
                    startActivity(intent);

                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        search1 =(ImageButton)findViewById(R.id.wrong);
        try {
            search1.setOnClickListener(new View.OnClickListener()   {
                public void onClick(View arg0) {

                    Intent intent = new Intent(context,WrongSubtractrion.class);
                    startActivity(intent);

                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        search2 =(ImageButton)findViewById(R.id.wrong1);
        try {
            search2.setOnClickListener(new View.OnClickListener()   {
                public void onClick(View arg0) {

                    Intent intent = new Intent(context,WrongSubtractrion.class);
                    startActivity(intent);

                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        search3 =(ImageButton)findViewById(R.id.wrong2);
        try {
            search3.setOnClickListener(new View.OnClickListener()   {
                public void onClick(View arg0) {

                    Intent intent = new Intent(context,WrongSubtractrion.class);
                    startActivity(intent);

                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void goToPrevActivity(View view) {
        Intent intent = new Intent(this,SubtractionActivity.class);
        startActivity(intent);
    }
    public void goToNextActivity(View view) {
        Intent intent = new Intent(this,Subtraction.class);
        startActivity(intent);
    }
}