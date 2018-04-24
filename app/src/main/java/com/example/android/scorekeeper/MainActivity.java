package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Initialize Variables
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int resetScore = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score by 50 points for Climb Bonus.
     */
    public void climbBonusTeamA(View v) {
        scoreTeamA = scoreTeamA + 50;
        displayForTeamA(scoreTeamA);
    }

    public void climbBonusTeamB(View v) {
        scoreTeamB = scoreTeamB + 50;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score by 10 points for Switch Goals.
     */
    public void switchPointsTeamA(View v) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    public void switchPointsTeamB(View v) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score by 15 points for Completed Power-Ups.
     */
    public void powerUpsTeamA(View v) {
        scoreTeamA = scoreTeamA + 15;
        displayForTeamA(scoreTeamA);
    }

    public void powerUpsTeamB(View v) {
        scoreTeamB = scoreTeamB + 15;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score to zero.
     */
    public void resetToZero(View v) {
        scoreTeamA = resetScore;
        scoreTeamB = resetScore;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}






































