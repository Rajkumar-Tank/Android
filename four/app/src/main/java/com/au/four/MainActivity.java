package com.au.four;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int likeCount=0,dislikeCount=0;
    Button likeIn,likeDe,dislikeIn,dislikeDe;
    TextView like,dislike;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        likeIn = findViewById(R.id.likeIn);
        likeDe = findViewById(R.id.likeDe);
        dislikeIn = findViewById(R.id.dislikeIn);
        dislikeDe = findViewById(R.id.dislikeDe);
        like=findViewById(R.id.like);
        dislike=findViewById(R.id.dislike);

        likeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likeCount++;
                msg = "Like "+likeCount;
                like.setText(msg);
            }
        });
        likeDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likeCount--;
                msg = "Like "+likeCount;
                like.setText(msg);
            }
        });
        dislikeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislikeCount++;
                msg = "Dislike "+dislikeCount;
                dislike.setText(msg);
            }
        });
        dislikeDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislikeCount--;
                msg = "Dislike "+dislikeCount;
                dislike.setText(msg);
            }
        });
    }
}
