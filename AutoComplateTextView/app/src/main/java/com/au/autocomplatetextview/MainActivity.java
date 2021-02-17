package com.au.autocomplatetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoComplateTextView;
    TextView displaItem;
    String[] actors = {"Amitabh Bachchan","Aamir Khan","Ajay Devgn","Shah Rukh Khan","Hrithik Roshan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoComplateTextView = findViewById(R.id.autoComplateTextView);
        displaItem = findViewById(R.id.displayItem);

        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,actors);
        autoComplateTextView.setThreshold(1);
        autoComplateTextView.setAdapter(adapter);
        autoComplateTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                displaItem.setText(adapter.getItem(i).toString());
                Toast.makeText(getApplicationContext(),adapter.getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
