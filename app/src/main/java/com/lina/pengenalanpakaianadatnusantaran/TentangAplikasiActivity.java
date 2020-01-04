package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TentangAplikasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);

        ImageView imageBackIcon = findViewById(R.id.back_icon);
        imageBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TentangAplikasiActivity.this, MenuUtamaActivity.class);
                startActivity(intent);
            }
        });
    }
}
