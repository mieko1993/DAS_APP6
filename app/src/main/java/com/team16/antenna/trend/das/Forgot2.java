package com.team16.antenna.trend.das;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Forgot2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot2);
    }

    //when button Back is clicked
    public void onClickButtonBackForget(View view){
        super.onBackPressed();
    }

    //When the textView SEND is clicked
    public void onClickButtonLoginForget(View view){
        Intent intent=new Intent(Forgot2.this,Login.class);
        startActivity(intent);
    }
}