package com.au.actv_spinner_progressbar_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    AutoCompleteTextView actv;
    TextView actv_display;
    String[] actors = {"Amitabh Bachchan","Aamir Khan","Ajay Devgn","Shah Rukh Khan","Hrithik Roshan"};

    Spinner spinner;
    TextView spinner_display;
    String [] movie = {"Matrix","JohnWick","Twilight"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        actv = findViewById(R.id.actv);
        actv_display = findViewById(R.id.actv_display);

        spinner=findViewById(R.id.spinner);
        spinner_display=findViewById(R.id.spinner_display);

        spinner.setOnItemSelectedListener(this);
        final ArrayAdapter adapter2 = new ArrayAdapter(Main2Activity.this,android.R.layout.simple_list_item_1,movie);
        spinner.setAdapter(adapter2);

        final ArrayAdapter adapter = new ArrayAdapter(Main2Activity.this,android.R.layout.simple_list_item_1,actors);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                actv_display.setText(adapter.getItem(i).toString());
                Toast.makeText(getApplicationContext(),adapter.getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(getApplicationContext(),movie[position],Toast.LENGTH_LONG).show();
        spinner_display.setText(movie[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
