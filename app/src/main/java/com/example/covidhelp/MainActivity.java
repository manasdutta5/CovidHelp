package com.example.covidhelp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// bottom onclicklistener landing activity not set

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


//        Find phrases text view
        TextView details = (TextView) findViewById(R.id.volunteerDetails);

//        Set Click Listener for VolunteerList View
        details.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent vDetails = new Intent(MainActivity.this, VolunteerList.class);
                startActivity(vDetails);
            }
        });

        Button verify = (Button) findViewById(R.id.verifyList);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openURL = new Intent(android.content.Intent.ACTION_VIEW);
                openURL.setData(Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&ved=2ahUKEwjisrCWxNLxAhUAzjgGHT1vBG4QFjAJegQICxAD&url=https%3A%2F%2Fiacp.in%2Fdownloads%2Fiacp%2Fcovid.pdf&usg=AOvVaw0G-IeAH5JvVDCo5NVF4WcP"));
                startActivity(openURL);
            }
        });

        //        Find phrases text view
        TextView interactNow = (TextView) findViewById(R.id.Interact);

//        Set Click Listener for VolunteerList View
        interactNow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent connect = new Intent(MainActivity.this, Interact.class);
                startActivity(connect);
            }
        });
        /*
         *Setting on Click listener for Vaccinate yourself textView in mainActivity
         */
        TextView vaccinateYourself = findViewById(R.id.vaccinateYourself);

        vaccinateYourself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaccinate = new Intent(MainActivity.this,VaccineActivity.class);
                startActivity(vaccinate);
            }
        });

        /*
         *Setting on Click listener for locate hospital textView in mainActivity
         */

        TextView locateHospital = findViewById(R.id.locateHospital);

        locateHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locateOnMap = new Intent(getApplicationContext(),HelpActivity.class);
                startActivity(locateOnMap);
            }
        });

    }


}