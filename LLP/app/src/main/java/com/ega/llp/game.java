package com.ega.llp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class game extends AppCompatActivity {

    public ImageView btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(view ->
                finish());
    }
}