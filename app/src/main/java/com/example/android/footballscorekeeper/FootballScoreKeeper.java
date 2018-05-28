
package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FootballScoreKeeper extends AppCompatActivity {

    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A - OAKLAND RAIDERS
     */

    public void displayForTeamA(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.firstscore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B - L.A. CHARGERS
     */

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.secondscore);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * score calc for team A: Oakland Raiders
     **/

    public void addThreeForTeamA(View view) {
        score = score + 3;
        displayForTeamA(score);
    }

    public void addTwoForTeamA(View view) {
        score = score + 2;
        displayForTeamA(score);
    }

    public void addOneForTeamA(View view){
        score = score + 1;
        displayForTeamA(score);
    }

    public void addTouchdownOakChar(View view) {
        score = score + 6;
        displayForTeamA(score);
    }

    /**
     * score calc for team B: L.A. Chargers
     **/

    public void addThreeForTeamB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addOneForTeamB(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void addTouchdownLosAng(View view) {
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }

    public void resetBothScores(View view) {
        score = 0;
        scoreB = 0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }

}