package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int scoreTeamA=0;
     int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addthreepointsA(View view) {
        scoreTeamA+=3;
        displayforTeamA(scoreTeamA);
    }

    public void addtwopointsA(View view) {
        scoreTeamA+=2;
        displayforTeamA(scoreTeamA);
    }

    public void addonepointsA(View view) {
        scoreTeamA+=1;
        displayforTeamA(scoreTeamA);
    }
    public void addthreepointsB(View view) {
        scoreTeamB+=3;
        displayforTeamB(scoreTeamB);
    }

    public void addtwopointsB(View view) {
        scoreTeamB+=2;
        displayforTeamB(scoreTeamB);
    }

    public void addonepointsB(View view) {
        scoreTeamB+=1;
        displayforTeamB(scoreTeamB);
    }
    public void displayforTeamA(int score){
        TextView scoreView=(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayforTeamB(int score){
        TextView scoreView=(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
       displayforTeamA(scoreTeamA);
      displayforTeamB(scoreTeamB);
    }
}