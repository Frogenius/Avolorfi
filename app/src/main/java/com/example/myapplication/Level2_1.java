package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level2_1);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button buttonNext = (Button) findViewById(R.id.wyjscie);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_1.this, GameLevels.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        Button buttonNextLevel = (Button) findViewById(R.id.Button4);

        buttonNextLevel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_1.this, Level2_2.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        Button button1 = (Button) findViewById(R.id.Button1);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Toast.makeText(Level2_1.this, "Niepoprawna odpowiedż! Spróbuj ponownie", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {

                }
            }

        });
        Button button3 = (Button) findViewById(R.id.Button3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Toast.makeText(Level2_1.this, "Niepoprawna odpowiedż! Spróbuj ponownie", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {

                }
            }

        });
        Button button4 = (Button) findViewById(R.id.Button2);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Toast.makeText(Level2_1.this, "Niepoprawna odpowiedż! Spróbuj ponownie", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {

                }
            }

        });





    }


}