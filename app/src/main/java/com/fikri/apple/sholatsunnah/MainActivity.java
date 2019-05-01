package com.fikri.apple.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tahajud, witir, rawatib, dhuha, istikhoroh,tahiyatul, syuruq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajud = findViewById(R.id.tahajud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhoroh);
        tahiyatul = findViewById(R.id.tahiyyatulmasjid);
        syuruq = findViewById(R.id.syuruq);

        tahajud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyatul.setOnClickListener(this);
        syuruq.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tahajud:
                Intent tahajjud = new Intent(MainActivity.this, Deskripsi.class);
                tahajjud.putExtra("Sunnah", "https://wisatanabawi.com/sholat-tahajud/");
                startActivity(tahajjud);
                break;

            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("Sunnah", "https://bersamadakwah.net/sholat-witir/");
                startActivity(witir);
                break;

            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("Sunnah", "https://muslim.or.id/4602-tuntunan-shalat-sunnah-rawatib.html");
                startActivity(rawatib);
                break;

            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("Sunnah", "https://muslim.or.id/44198-fikih-shalat-dhuha.html");
                startActivity(dhuha);
                break;

            case R.id.istikhoroh:
                Intent istikhorah = new Intent(MainActivity.this, Deskripsi.class);
                istikhorah.putExtra("Sunnah", "https://www.dream.co.id/orbit/tata-cara-shalat-istikharah-1811138.html");
                startActivity(istikhorah);
                break;

            case R.id.tahiyyatulmasjid:
                Intent masjid = new Intent(MainActivity.this, Deskripsi.class);
                masjid.putExtra("Sunnah", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                startActivity(masjid);
                break;

            case R.id.syuruq:
                Intent syuruq = new Intent(MainActivity.this, Deskripsi.class);
                syuruq.putExtra("Sunnah", "https://aita");
                startActivity(syuruq);
                break;
        }

    }
}
