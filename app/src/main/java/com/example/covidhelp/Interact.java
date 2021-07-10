package com.example.covidhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Interact extends AppCompatActivity {

    String text;
    String num1="7995124497";
    String mailingAdd="ankitasinghcip@gmail.com";
    EditText fieldText;
    EditText fieldCall;
    EditText fieldMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interact);

        Button call = (Button) findViewById(R.id.call);
        Button message=(Button) findViewById(R.id.message);
        Button mail=(Button) findViewById(R.id.mail);



        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:"+num1));
                try{
                    startActivity(callintent);
                }
                catch(Exception e)
                {
                    Toast.makeText(Interact.this,"Can not call to this number",Toast.LENGTH_LONG).show();
                }


            }
        });


        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                fieldText = (EditText) findViewById(R.id.textbody);
                text = fieldText.getText().toString();

                Intent messageintent =new Intent(Intent.ACTION_VIEW);
                messageintent.setType("vnd.android-dir/mms-sms");
                messageintent.putExtra("address", num1);
                messageintent.putExtra("sms_body",text);

                try
                {
                    startActivity(messageintent);
                    finish();
                }
                catch(Exception e)
                {
                    Toast.makeText(Interact.this,"Sms not send",Toast.LENGTH_LONG).show();
                }
            }
        });


        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                fieldText = (EditText) findViewById(R.id.textbody);
                text = fieldText.getText().toString();


                Intent emailintent = new Intent(Intent.ACTION_SEND);
                emailintent.putExtra(Intent.EXTRA_EMAIL,  new String[] { mailingAdd });
                emailintent.putExtra(Intent.EXTRA_SUBJECT,"COVID EMERGENCY");
                emailintent.putExtra(Intent.EXTRA_TEXT,text);
                emailintent.setType("message/rfc822");


                try
                {
                    startActivity(Intent.createChooser(emailintent, "Choose an Email client :"));

                    finish();
                }
                catch(Exception e)
                {
                    Toast.makeText(Interact.this,"Mail cannot be sent",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}