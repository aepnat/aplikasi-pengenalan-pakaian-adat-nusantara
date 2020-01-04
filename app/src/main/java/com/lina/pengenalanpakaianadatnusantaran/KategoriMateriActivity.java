package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KategoriMateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_materi);

        CardView cardPakaianAdat = findViewById(R.id.cardPakaianAdat);
        cardPakaianAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriMateriActivity.this, MateriPakaianAdatActivity.class);
                KategoriMateriActivity.this.startActivity(intent);
            }
        });

        CardView cardPakaianAdatPengantin = findViewById(R.id.cardPakaianAdatPengantin);
        cardPakaianAdatPengantin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriMateriActivity.this, MateriPakaianAdatPengantinActivity.class);
                KategoriMateriActivity.this.startActivity(intent);
            }
        });

        ImageView imageBackIcon = findViewById(R.id.back_icon);
        imageBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriMateriActivity.this, MenuUtamaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
