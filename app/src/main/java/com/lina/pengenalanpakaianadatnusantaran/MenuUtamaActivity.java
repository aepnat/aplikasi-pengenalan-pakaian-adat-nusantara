package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        CardView cardMateri = findViewById(R.id.cardMateri);
        cardMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtamaActivity.this, KategoriMateriActivity.class);
                MenuUtamaActivity.this.startActivity(intent);
            }
        });

        CardView cardExit = findViewById(R.id.cardExit);
        cardExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuUtamaActivity.this);
                builder.setMessage("Apakah Kamu yakin mau keluar ?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finishAffinity();
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        CardView cardAbout = findViewById(R.id.cardAbout);
        cardAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtamaActivity.this, TentangAplikasiActivity.class);
                MenuUtamaActivity.this.startActivity(intent);
            }
        });

        CardView cardKategoriGame = findViewById(R.id.cardKategoriGame);
        cardKategoriGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtamaActivity.this, KategoriGameActivity.class);
                MenuUtamaActivity.this.startActivity(intent);
            }
        });
    }
}
