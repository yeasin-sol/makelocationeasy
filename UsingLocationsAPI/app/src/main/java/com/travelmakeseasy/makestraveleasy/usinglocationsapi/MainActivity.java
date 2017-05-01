package com.travelmakeseasy.makestraveleasy.usinglocationsapi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printToast("Hello Yeasin");
    }

    private void printToast(String strMsg){
        Context context = getApplicationContext();
        CharSequence text = "" + strMsg;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
