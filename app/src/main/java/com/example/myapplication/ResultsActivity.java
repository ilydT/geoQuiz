package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView mGrade,mFinalScore;
    Button mRetryButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade=(TextView)findViewById(R.id.grade);
        mFinalScore=(TextView)findViewById(R.id.outOf);
        mRetryButton=(Button)findViewById(R.id.retry);

        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("finalScore");
        mFinalScore.setText("You scored"+score+"out of "+QuizBook.questions.length);

        if (score==8){
            mGrade.setText("Outstanding");
        }else if (score==7){
            mGrade.setText("Good Work");
        }else if(score==6){
            mGrade.setText("Good Effort");
        }else {
            mGrade.setText("Go over your notes");
        }
        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultsActivity.this,QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });
    }
}
