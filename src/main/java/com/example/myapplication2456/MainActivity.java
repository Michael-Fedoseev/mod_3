package com.example.myapplication2456;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.filament.View;
public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.powerwolf_in_the_name_of_god);
            mediaPlayer.start();
        }
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) android.view.View seekBar = findViewById(R.id.seekBar); // получаем ссылку на элемент SeekBar
        android.view.View pauseButton = findViewById(R.id.pauseButton); // получаем ссылку на кнопку "Пауза"

        android.view.View finalSeekBar1 = seekBar;
        pauseButton.setOnClickListener( new View.OnClickListener() {

            private void onClick(View v) {
                android.view.View finalSeekBar = (android.view.View) new Object();
                finalSeekBar.setEnabled(false); // устанавливаем состояние ползунка в "неактивное"
            }
        });
        seekBar = findViewById ( R.id.seekBar );
        pauseButton = findViewById ( R.id.pauseButton );

        android.view.View finalSeekBar = seekBar;
        pauseButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                finalSeekBar.setEnabled(false); // устанавливаем состояние ползунка в "неактивное"
            }
        });
    }

    private class Button {
        public void setOnClickListener() {
            setOnClickListener ( null );
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {

        }
    }
}