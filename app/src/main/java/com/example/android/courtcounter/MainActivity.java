package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreArizona = 0;
    int scoreBuffalo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTouchArizona(View view) {
        scoreArizona = scoreArizona + 6;
        displayForArizona(scoreArizona);


    }

    private void display(int number) {
        TextView teamTextView = (TextView) findViewById(R.id.arizona_score);
        teamTextView.setText("" + number);
    }

    public void addExtraArizona(View view) {
        scoreArizona= scoreArizona + 1;
        displayForArizona(scoreArizona);
    }

    public void addFieldArizona(View view) {
        scoreArizona = scoreArizona + 3;
        displayForArizona(scoreArizona);
    }


    public void addSafetyArizona(View view) {
        scoreArizona = scoreArizona + 2;
        displayForArizona(scoreArizona);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForArizona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.arizona_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForBuffalo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.buffalo_score);
        scoreView.setText(String.valueOf(score));}

    public void addTouchBuffalo(View view) {
        scoreBuffalo = scoreBuffalo + 6;
        displayForBuffalo(scoreBuffalo);
    }

    public void addExtraBuffalo(View view) {
        scoreBuffalo = scoreBuffalo + 1;
        displayForBuffalo(scoreBuffalo);
    }

    public void addFieldBuffalo(View view) {
        scoreBuffalo = scoreBuffalo + 3;
        displayForBuffalo(scoreBuffalo);
    }
    public void addSafetyBuffalo(View view) {
        scoreBuffalo = scoreBuffalo + 2;
        displayForBuffalo(scoreBuffalo);
    }

    public void Reset(View view) {
        scoreArizona = 0;
        scoreBuffalo = 0;
        displayForBuffalo(scoreArizona);
        displayForBuffalo(scoreBuffalo);
    }
}
