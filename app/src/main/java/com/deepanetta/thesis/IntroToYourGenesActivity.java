package com.deepanetta.thesis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class IntroToYourGenesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_to_your_genes);
    }

    public void IntroToYourGenesQuestionnaire(View v) {
        //Whatever class you write in here, it will go to
        Intent intent = new Intent(this, Questionnaire.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }


    }

