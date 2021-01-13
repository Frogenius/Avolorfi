package com.example.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Level4 extends AppCompatActivity {

    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level4);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Button buttonNext = (Button) findViewById(R.id.wyjscie);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level4.this, GameLevels.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }

        });

        ImageView koniec = (ImageView) findViewById(R.id.imageView10);
        dialog = new Dialog(this);
        koniec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    //Intent intent = new Intent(Level4.this, MainActivity.class);
                    //startActivity(intent);
                   // finish();

                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dialog);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.setCancelable(false);
                    dialog.show();

                    TextView btnclose = (TextView)dialog.findViewById(R.id.btnclose);
                    btnclose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                Intent intent = new Intent(Level4.this, Level4.class);
                                startActivity(intent);
                                finish();

                            } catch (Exception e) {

                            }
                            dialog.dismiss();
                        }
                    });
                    Button butncontinue = (Button)dialog.findViewById(R.id.btncontinue);

                    butncontinue.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            try {
                                Intent intent = new Intent(Level4.this, MainActivity.class);
                                startActivity(intent);
                                finish();

                            } catch (Exception e) {

                            }
                            dialog.dismiss();
                        }

                    });




                } catch (Exception e) {

                }
            }

        });




    }


}