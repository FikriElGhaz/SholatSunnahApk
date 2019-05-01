package com.fikri.apple.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        webView = findViewById(R.id.web);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("Sunnah");

        //agar javascript nya bisa di baca
        webView.getSettings().getJavaScriptEnabled();

        //agar gambar nya otomaatis di masukan
        webView.getSettings().setLoadsImagesAutomatically(true);

        //untuk memasukan linknya
        webView.loadUrl(link);
    }
}
