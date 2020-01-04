package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {

    private TextView textSkor;
    private CardView cardSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        textSkor = findViewById(R.id.teks_skor);
        cardSelesai = findViewById(R.id.cardSelesai);

        String skor = String.valueOf(getIntent().getIntExtra("skor", 0));
        String total = String.valueOf(getIntent().getIntExtra("total", 0));
        String skor_val = skor + " / " + total;
        textSkor.setText(skor_val);

        cardSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SkorActivity.this, HomeActivity.class);
                SkorActivity.this.startActivity(intent);
            }
        });
    }
}
