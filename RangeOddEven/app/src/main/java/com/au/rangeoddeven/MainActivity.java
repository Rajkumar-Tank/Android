package com.au.rangeoddeven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView display;
    EditText startrange,endrange;
    int start,end,i=0;
    String odd="",even="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        display=findViewById(R.id.display);

        startrange=findViewById(R.id.startrange);
        endrange=findViewById(R.id.endrange);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start= Integer.parseInt(startrange.getText().toString());
                end=Integer.parseInt(endrange.getText().toString());
                for (i=start;i<=end;i++)
                {
                    if(i%2==0)
                    {
                       even = even + " "+i;

                    }
                    else
                    {
                        odd = odd + " "+i;

                    }
                }
                display.setText("\n Even Number : \n"+even+"\nOdd Number : \n"+odd);


            }
        });

    }
}
