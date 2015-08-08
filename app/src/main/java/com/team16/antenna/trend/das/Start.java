package com.team16.antenna.trend.das;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    //When the LOGIN button is clicked
    public void onClickButtonLoginStart(View view){
        Intent i=new Intent(Start.this,Login.class);
        startActivity(i);
    }

    //When the SIGNUP button is clicked
    public void onClickButtonSignUpStart(View view){
        Intent i=new Intent(Start.this,SignUp.class);
        startActivity(i);
    }

}
