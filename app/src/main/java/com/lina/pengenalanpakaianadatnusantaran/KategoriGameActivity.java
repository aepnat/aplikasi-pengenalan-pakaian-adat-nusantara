package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KategoriGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_game);

        CardView cardGamePakaianAdatSehari = findViewById(R.id.cardGamePakaianAdatSehari);
        cardGamePakaianAdatSehari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriGameActivity.this, GameActivity.class);
                intent.putExtra("kategori", "sehari");
                KategoriGameActivity.this.startActivity(intent);
            }
        });

        CardView cardGamePakaianAdatPengantin = findViewById(R.id.cardGamePakaianAdatPengantin);
        cardGamePakaianAdatPengantin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriGameActivity.this, GameActivity.class);
                intent.putExtra("kategori", "pengantin");
                KategoriGameActivity.this.startActivity(intent);
            }
        });

        ImageView imageBackIcon = findViewById(R.id.back_icon);
        imageBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriGameActivity.this, MenuUtamaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
