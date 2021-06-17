package com.example.repasolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    ImageView ivPortada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ivPortada = (ImageView) findViewById(R.id.ivPortada);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent().setClass(

                        SplashScreen.this, MainActivity.class);

                startActivity(i);
                finish();

            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 2000);
    }

}