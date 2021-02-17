package com.au.linear_layout_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

        TextView a_display,m_display,c_display,s_display;
        RatingBar a_ratingbar,m_ratingbar,c_ratingbar,s_ratingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a_display=findViewById(R.id.a_display);
        m_display=findViewById(R.id.m_display);
        c_display=findViewById(R.id.c_display);
        s_display=findViewById(R.id.s_display);

        a_ratingbar=findViewById(R.id.a_ratingbar);
        m_ratingbar=findViewById(R.id.m_ratingbar);
        c_ratingbar=findViewById(R.id.c_ratingbar);
        s_ratingbar=findViewById(R.id.s_ratingbar);


        a_ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                a_display.setText(""+v);
                Toast.makeText(getApplicationContext(),""+v,Toast.LENGTH_LONG).show();
            }
        });

        c_ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                c_display.setText(""+v);
                Toast.makeText(getApplicationContext(),""+v,Toast.LENGTH_LONG).show();
            }
        });

        m_ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                m_display.setText(""+v);
                Toast.makeText(getApplicationContext(),""+v,Toast.LENGTH_LONG).show();
            }
        });

        s_ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                s_display.setText(""+v);
                Toast.makeText(getApplicationContext(),""+v,Toast.LENGTH_LONG).show();
            }
        });

    }



}
