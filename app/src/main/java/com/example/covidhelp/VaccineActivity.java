package com.example.covidhelp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class VaccineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccine);

        VaccineFragment vaccineFragment =new VaccineFragment();
        //use fragment manager and fragment transaction to replace the fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.vaccineFragmentLayout,vaccineFragment);
        transaction.commit();
    }
}