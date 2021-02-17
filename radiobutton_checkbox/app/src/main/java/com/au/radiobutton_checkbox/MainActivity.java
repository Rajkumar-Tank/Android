package com.au.radiobutton_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button clear;

    CheckBox checkBox;
    RadioGroup city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = findViewById(R.id.city);


        clear = findViewById(R.id.clear);
        checkBox=findViewById(R.id.checkBox);
        textView = findViewById(R.id.textView);


        checkBox.setText("Unchecked");
        textView.setText("Please Select An Option");






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
