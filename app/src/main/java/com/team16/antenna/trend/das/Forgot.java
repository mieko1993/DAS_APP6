package com.team16.antenna.trend.das;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Forgot extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
    }

    //When the textView SEND is clicked
    public void onClickButtonSend(View view){
        Intent intent=new Intent(Forgot.this,Forgot2.class);
        startActivity(intent);
    }


}