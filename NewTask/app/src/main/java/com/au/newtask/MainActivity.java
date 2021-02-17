package com.au.newtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText plainText, password,passwordNumeric,email,phone,number;
    Button button;
    String display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        plainText=(EditText) findViewById(R.id.plainText);
        password=(EditText)findViewById(R.id.password);
        passwordNumeric=(EditText)findViewById(R.id.passwordNumeric);
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);
        number=(EditText)findViewById(R.id.number);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = "Name : " +plainText.getText() + "\n Email :"+email.getText() + "\n  Password :" +password.getText()+"\n Password Numeric : "+passwordNumeric.getText()+"\n Phone Number :"+phone.getText()+"\n Number  : "+number.getText() ;
                textView.setText(display);
                Toast.makeText(getApplicationContext(), display, Toast.LENGTH_LONG).show();

            }
        });




    }
}
