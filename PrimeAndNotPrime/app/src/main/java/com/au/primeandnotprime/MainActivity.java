package com.au.primeandnotprime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    int value,flag=0,i=0;
    TextView display;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=findViewById(R.id.number);
        button=findViewById(R.id.button);
        display=findViewById(R.id.display);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=Integer.parseInt(number.getText().toString());
                for(int i=2 ; i < value/2 ; i++) {
                    if(value%i == 0) {

                        display.setText("Not Prime Number : "+value);
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0) {
                    display.setText("Prime Number : "+value);
                }
            }
        });
    }
}
