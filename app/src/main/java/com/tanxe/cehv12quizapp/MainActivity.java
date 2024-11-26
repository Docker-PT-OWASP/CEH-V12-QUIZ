package com.tanxe.cehv12quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;




import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpscreen;
    MediaPlayer mpstart;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toast.makeText(this, "Welcome to Quiz Certified Ethical Hacker", Toast.LENGTH_SHORT).show();

    }


    public void startMusic(View view)
    {
        mpscreen.start();
    }

    public void startGame(View view) {
        // In startGame() method, create an Intent to launch StartGame Activity
        Intent intent = new Intent(MainActivity.this, StartGame.class);
        mpstart = MediaPlayer.create(this, R.raw.start);
        {
            mpstart.start();
        }
        startActivity(intent);
        // Finish MainActivity
        finish();


    }

}