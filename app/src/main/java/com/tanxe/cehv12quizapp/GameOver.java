package com.tanxe.cehv12quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class GameOver extends AppCompatActivity {
    MediaPlayer mprestart;
    MediaPlayer mpexit;
    MediaPlayer mpgameover;


    TextView tvPoints, tvPersonalBest;
    SharedPreferences sharedPreferences;

    @SuppressLint({"SetTextI18n", "ApplySharedPref"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mprestart = MediaPlayer.create(this, R.raw.restart);
        mpexit = MediaPlayer.create(this, R.raw.exit);
        setContentView(R.layout.game_over);
        int points = Objects.requireNonNull(getIntent().getExtras()).getInt("points");
        tvPoints = findViewById(R.id.tvPoints);
        tvPersonalBest = findViewById(R.id.tvPersonalBest);
        tvPoints.setText("" + points);
        sharedPreferences = getSharedPreferences("pref", 0);
        int pointsSP = sharedPreferences.getInt("pointsSP", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(points > pointsSP){
            pointsSP = points;
            editor.putInt("pointsSP", pointsSP);
            editor.commit();
        }
        tvPersonalBest.setText("" + pointsSP);
        mpgameover = MediaPlayer.create(this, R.raw.gameover);
        {
            mpgameover.start();
        }
    }


    public void restart(View view) {
        Intent intent = new Intent(GameOver.this, StartGame.class);
        {
            mprestart.start();
        }
        startActivity(intent);
        finish();
    }

    public void exit(View view) {
        {
            mpexit.start();
        }


        finish();
    }
}