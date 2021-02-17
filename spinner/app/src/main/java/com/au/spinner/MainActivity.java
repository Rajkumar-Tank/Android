package com.au.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    TextView display;
    String [] movie = {"Matrix","JohnWick","Twilight"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        display=findViewById(R.id.display);

        spinner.setOnItemSelectedListener(this);

        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,movie);

    spinner.setAdapter(adapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(getApplicationContext(),movie[position],Toast.LENGTH_LONG).show();
        display.setText(movie[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
