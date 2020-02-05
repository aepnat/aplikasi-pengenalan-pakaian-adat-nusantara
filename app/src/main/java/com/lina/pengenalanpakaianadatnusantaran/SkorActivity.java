package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView textSkor = findViewById(R.id.teks_skor);
        CardView cardSelesai = findViewById(R.id.cardSelesai);

        String skor = String.valueOf(getIntent().getIntExtra("skor", 0));
        textSkor.setText(skor);

        cardSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkorActivity.this, MenuUtamaActivity.class);
                SkorActivity.this.startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
