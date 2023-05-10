package com.example.utspemrogramanfajar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    ImageButton IButton1, IButton2, IButton3, IButton4, IButton5, IButton6, IButton7, IButton8, IButton9;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IButton1 = findViewById(R.id.imageButton1);
        IButton2 = findViewById(R.id.imageButton2);
        IButton3 = findViewById(R.id.imageButton3);
        IButton4 = findViewById(R.id.imageButton4);
        IButton5 = findViewById(R.id.imageButton5);
        IButton6 = findViewById(R.id.imageButton6);
        IButton7 = findViewById(R.id.imageButton7);
        IButton8 = findViewById(R.id.imageButton8);

        IButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat1);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 1", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colotSecondaryDark));
                snackbar.show();
            }
        });
        IButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat2);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 2", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
        IButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat3);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 3", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
        IButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat4);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 4", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
        IButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat5);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 5", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
        IButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat6);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 6", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
        IButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat7);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 7", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
        IButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(R.raw.cat9);
                Snackbar snackbar = Snackbar.make(view, "Suara cat 8", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark));
                snackbar.show();
            }
        });
    }

    private void playSound(int soundId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundId);
        mediaPlayer.start();
    }
}