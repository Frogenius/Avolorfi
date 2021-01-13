package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.myapplication.R.raw.faith;

public class MainActivity extends AppCompatActivity {

    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

       MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.faith);

        Button buttonZwuk = (Button) findViewById(R.id.buttonZwuk);
        buttonZwuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    if(isPlaying){
                        mediaPlayer.pause();
                        isPlaying = false;
                    }else {
                        mediaPlayer.start();
                        isPlaying = true;
                    }

                } catch (Exception e) {

                }
            }
        });

        Button buttonStart = (Button) findViewById(R.id.buttonStart);


        buttonStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(MainActivity.this, GameLevels.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });




    }
}