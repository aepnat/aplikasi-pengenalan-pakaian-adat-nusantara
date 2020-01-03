package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KategoriGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_game);

        CardView cardGamePakaianAdat = findViewById(R.id.cardGamePakaianAdat);
        cardGamePakaianAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KategoriGameActivity.this, GamePakaianAdatActivity.class);
                KategoriGameActivity.this.startActivity(intent);
            }
        });
    }
}
