package com.au.framelayout_progressbar_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int i;
    ProgressBar progressBar;
    ProgressBar progressBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBar2=findViewById(R.id.progressBar2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(i<100){
                    i++;
                    progressBar.setProgress(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i==100)
                    {
                        Intent i = new Intent(getApplicationContext(),Main2Activity.class);

                        startActivity(i);
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(i<100){
                    i++;
                    progressBar2.setProgress(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i==100)
                    {
                        Intent i = new Intent(getApplicationContext(),Main2Activity.class);

                        startActivity(i);
                    }
                }

            }
        }).start();
    }

}
