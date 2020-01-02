package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardMateri = findViewById(R.id.cardMateri);
        cardMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, KategoriMateriActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });

        CardView cardExit = findViewById(R.id.cardExit);
        cardExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        CardView cardAbout = findViewById(R.id.cardAbout);
        cardAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });

        CardView cardKategoriGame = findViewById(R.id.cardKategoriGame);
        cardKategoriGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, KategoriGameActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });
    }
}
