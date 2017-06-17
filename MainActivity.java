package com.sts.spinnerdemoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ArrayList<String> COUNTRIES;
    Spinner mSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        COUNTRIES=new ArrayList<>();
        COUNTRIES.add("india");
        COUNTRIES.add("china");
        COUNTRIES.add("japan");
        COUNTRIES.add("australia");
        COUNTRIES.add("america");

        mSpinner= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.spinnner_textview,COUNTRIES);
        //ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,COUNTRIES);
        mSpinner.setAdapter(adapter);

        mSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

       // String item= (String) parent.getItemAtPosition(position);
       // String item=COUNTRIES.get(position);
        String item= (String) mSpinner.getSelectedItem();
        Toast.makeText(this,"selected item "+item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
