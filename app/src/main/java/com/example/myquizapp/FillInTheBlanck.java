package com.example.myquizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class FillInTheBlanck extends AppCompatActivity {

    Button ans1,ans2,ans3,ans4;
    TextView score,que;
    ImageButton backBtn;

    private Question2 question2=new Question2();

    private String mAnswer;
    private int mScore=0;
    private int mQuestionLength=question2.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_the_blanck);

        r=new Random();
        ans1=findViewById(R.id.ans1);
        ans2=findViewById(R.id.ans2);
        ans3=findViewById(R.id.ans3);
        ans4=findViewById(R.id.ans4);
        backBtn=findViewById(R.id.backBtn);

        score=findViewById(R.id.score);
        que=findViewById(R.id.que);

        score.setText("Score: "+mScore);

        updateQuestion(r.nextInt(mQuestionLength));

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans1.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    gameOver();
                }
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans2.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    gameOver();
                }
            }
        });

        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans3.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    gameOver();
                }
            }
        });

        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans4.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    gameOver();
                }
            }
        });
    }



    private void updateQuestion(int num) {
        que.setText(question2.getQuestion(num));
        ans1.setText(question2.getChoice1(num));
        ans2.setText(question2.getChoice2(num));
        ans3.setText(question2.getChoice3(num));
        ans4.setText(question2.getChoice4(num));

        mAnswer=question2.getCorrentanswer(num);
    }

    private void gameOver() {

        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is:"+mScore+"Points")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),Dashboard.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

}
