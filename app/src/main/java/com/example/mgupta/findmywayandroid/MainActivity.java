package com.example.mgupta.findmywayandroid;

import android.app.Notification;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

 public static final String FLightNumebrMessage = "flightNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitFlight(View view) {
        EditText flightEditText = (EditText) findViewById(R.id.flightEditText);

        Intent intent = new Intent(MainActivity.this, Result_Activity.class);

        intent.putExtra(FLightNumebrMessage, flightEditText.getText().toString());
        startActivity(intent);




    }




}
