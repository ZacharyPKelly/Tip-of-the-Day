package com.example.tipoftheday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Log.e - Error
         * log.w - Warning
         * log.i - Information
         * log.d - Debug
         * log.v - Verbose
         * log.wtf - What the #&@!
         */

        Log.d("DEBUG", "Entered MainActivity onCreate");

    }

    public void pressMe (View view){

        Log.d("DEBUG", "Entered pressMe");

        methodOne();

    }

    public void methodOne(){

        Log.d("DEBUG", "Entered methodOne");

        methodThree();

    }

    public void methodTwo(){

        Log.d("DEBUG", "Entered methodTwo");

        methodFour();

    }

    public void methodThree(){

        Log.d("DEBUG", "Entered methodThree");

        methodTwo();

    }

    public void methodFour(){

        Log.d("DEBUG", "Entered methodFour");

    }


}