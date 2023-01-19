package com.example.android.baseballscorecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int outsTeamA = 0;
    int scoreTeamB = 0;
    int outsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given outs for Team A.
     */
    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs_scores);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds a one to the number of home runs.
     */

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds a one to the number of outs for Team A.
     */
    public void addOutForTeamA(View view) {
        outsTeamA = outsTeamA + 1;
        displayOutsForTeamA(outsTeamA);
    }

    /**
     * Reset the scores and outs
     */
    public void Reset(View view) {
        scoreTeamA = 0;
        outsTeamA = 0;
        scoreTeamB = 0;
        outsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayOutsForTeamA(outsTeamA);
        displayForTeamB(scoreTeamB);
        displayOutsForTeamB(outsTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Displays the given outs for Team B.
     */
    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs_scores);
        scoreView.setText(String.valueOf(outsTeamB));
    }

    /**
     * Adds a one to the number of home runs.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds a one to the number of outs for Team B.
     */
    public void addOutForTeamB(View view) {
        outsTeamB = outsTeamB + 1;
        displayOutsForTeamB(outsTeamB);
    }

}
