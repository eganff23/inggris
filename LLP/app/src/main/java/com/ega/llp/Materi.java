package com.ega.llp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class Materi extends AppCompatActivity {

    public ImageView btnback;
    public PDFView pdfmateri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(view ->
                finish());

        pdfmateri = findViewById(R.id.pdfmateri);
        pdfmateri.fromAsset("materi_bi.pdf")
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .load();
    }
}