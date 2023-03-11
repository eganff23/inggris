package com.ega.llp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView btnmateri, btnpermainan, btnprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmateri = findViewById(R.id.btnmateri);
        btnpermainan = findViewById(R.id.btnpermainan);
        btnprofil = findViewById(R.id.btnprofil);

        btnmateri.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Materi.class);
            startActivity(i);

        });

        btnpermainan.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, game.class);
            startActivity(i);

        });

        btnprofil.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, profil.class);
            startActivity(i);

        });
    }
}