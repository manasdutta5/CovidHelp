package com.example.covidhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class VolunteerList extends AppCompatActivity {
    ArrayList<Word> words = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        addNewItem();
    }

    public void addNewItem() //String Name, String Details, String Gender
    {
        words.add(new Word("S .Momintaz","aandhra Pradesh +917095991902"));
        words.add(new Word("Kassa Jasmin","Tirupathi +91 9398980722"));
        words.add(new Word(" N.Hithesh Reddy","Tirupathi +917995124497"));
        words.add(new Word(" Baduru Amaravathi","Chandragiri +917995106297"));
        words.add(new Word(" Shaik Mohammad Yasin","Kalikari +91347010761"));
        words.add(new Word("Mukta Mrinalini","Patna +919369014728"));
        words.add(new Word("Dr. Shivani Pandey","Delhi NCR +919451079826"));
        words.add(new Word("Biswajit Dey","Gujrat +917600492692"));
        words.add(new Word("Sudeshna Das","Jharkhand +919903184691"));
        words.add(new Word("Dr. Jyotsna Agrawal","Karnataka +917783805884"));
        words.add(new Word("Dr. Gitanjali Narayanan","Karnaraka +919650137619"));
        words.add(new Word("Amal Thomas","Kerela +919495626659"));
        words.add(new Word("Dr Muddasir","Kashmir +918825006014"));
        words.add(new Word("Jasmine Mary Lyngdoh","Meghalaya +919436307269"));
        words.add(new Word("Gagandeep Kaur Makkar","Odisha +919330926013"));
        words.add(new Word("Dr. Krishan K Sony","Punjab +918607494950"));
        words.add(new Word("Dr. Savita Jagawat","Rajasthan +917297811224"));
        words.add(new Word("D.Vijayaragavan","Tamil Nadu +919677774099"));
        words.add(new Word("Srijita Gupta ","Hyderabad +918884318658"));
        words.add(new Word("Meenakshi Moorjani","Telangana +917032914110"));
        words.add(new Word("Ashok Parashar","Uttar Pradesh +918871743267"));
        words.add(new Word("Ushnaa Ghatak","West Bengal +919831759808"));


        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        //enable call on touch on list view volunteer names
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView num = findViewById(R.id.ddescription);
                String number1 = num.getText().toString();
                String number2 = number1.substring(number1.length()-10);

                Toast.makeText(VolunteerList.this,"Connecting the call",Toast.LENGTH_SHORT).show();
                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:"+number2));

                try{
                    startActivity(callintent);
                }
                catch(Exception e)
                {
                    Toast.makeText(VolunteerList.this,"Can not call to this number",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}