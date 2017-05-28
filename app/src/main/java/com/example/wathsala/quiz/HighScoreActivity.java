package com.example.wathsala.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HighScoreActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);
        image=(ImageView)findViewById(R.id.image);
        TextView txtScore = (TextView)findViewById(R.id.textScore);


        Intent intent = getIntent();
        int score = intent.getIntExtra("score",0);

        txtScore.setText("Your score: 5/" +score);

        if(score<3){
            image.setBackgroundResource(R.drawable.sad);
        }
        else
        {
            image.setBackgroundResource(R.drawable.happy);
        }

    }
    public void onClick(View view){
        Intent intent = new Intent(HighScoreActivity.this,QuizActivity.class);
        startActivity(intent);
    }
}