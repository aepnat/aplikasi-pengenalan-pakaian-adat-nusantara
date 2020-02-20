package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MateriLengkapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_lengkap);

        PakaianAdatModel materi = (PakaianAdatModel) getIntent().getSerializableExtra("materi");

        TextView titleView = findViewById(R.id.title);
        ImageView imageView = findViewById(R.id.image);
        TextView contentView = findViewById(R.id.content);

        titleView.setText(materi.getTitle());
        imageView.setImageResource(materi.getImage());
        contentView.setText(materi.getContent());

        ImageView imageBackIcon = findViewById(R.id.back_icon);
        imageBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
