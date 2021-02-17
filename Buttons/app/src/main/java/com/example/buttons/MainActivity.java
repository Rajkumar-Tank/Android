package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button clear,button;
    ImageView imagebutton;
    CheckBox checkBox;
    RadioGroup city;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city = findViewById(R.id.city);
        button = findViewById(R.id.button);
        imagebutton = findViewById(R.id.imageButton);
        clear = findViewById(R.id.clear);
        checkBox=findViewById(R.id.checkBox);
        textView = findViewById(R.id.textView);

        button.setText("Hey Buddy ...  :)");
        checkBox.setText("Unchecked");
        textView.setText("Please Select An Option");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_LONG).show();
            }
        });

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"ImageButton clicked ",Toast.LENGTH_LONG).show();
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    checkBox.setText("Checked");
                }
                else {
                    checkBox.setText("Unchecked");
                }
            }
        });

        city.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton=findViewById(checkedId);
                if(radioButton!=null)
                {

                    textView.setText(radioButton.getText());
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                city.clearCheck();
                textView.setText("Please select an Option");
            }
        });





    }

}