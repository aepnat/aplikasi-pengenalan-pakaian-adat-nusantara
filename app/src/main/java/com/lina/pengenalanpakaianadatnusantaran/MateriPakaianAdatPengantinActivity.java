package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MateriPakaianAdatPengantinActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPakaianAdat adapter;
    List<PakaianAdatModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_pakaian_adat_pengantin);

        models = new ArrayList<>();
        models.add(new PakaianAdatModel(R.drawable.pengantin_aceh, "Aceh", "Pakaian adat pengantin dari Aceh"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_aceh_timur, "Aceh Timur", "Pakaian adat pengantin dari Aceh Timur"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_bali_pengantin, "Bali", "Pakaian adat pengantin dari Bali"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_bangka_belitung, "Bangka Belitung", "Pakaian adat pengantin dari Bangka Belitung"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_bengkulu, "Bengkulu", "Pakaian adat pengantin dari Bengkulu"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_d_i_yogyakarta_baju_kesatrian_ageng, "D.I Yogyakarta Baju Kesatrian Ageng", "Pakaian adat pengantin dari D.I Yogyakarta Baju Kesatrian Ageng"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_d_i_yogyakarta_paes_ageng_basahan, "D.I Yogyakarta Paes Ageng Basahan", "Pakaian adat pengantin dari D.I Yogyakarta Paes Ageng Basahan"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_d_i_yogyakarta_paes_ageng_jangan_menir, "D.I Yogyakarta Paes Ageng Jangan Menir", "Pakaian adat pengantin dari D.I Yogyakarta Paes Ageng Jangan Menir"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_dki_jakarta_pria, "DKI Jakarta Pria", "Pakaian adat pengantin dari DKI Jakarta Pria"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_dki_jakarta_wanita, "DKI Jakarta Wanita", "Pakaian adat pengantin dari DKI Jakarta Wanita"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_gorontalo, "Gorontalo", "Pakaian adat pengantin dari Gorontal"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jambi, "Jambi", "Pakaian adat pengantin dari Jambi"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_barat_busana_kepangeranan, "Jawa Barat Busana Kepangeranan", "Pakaian adat pengantin dari Jawa Barat Busana Kepangeranan"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_barat_busana_pengantin_kebesaran, "Jawa Barat Busana Pengantin Kebesaran", "Pakaian adat pengantin dari Jawa barat Pengantin Kebesaran"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_barat, "Jawa barat", "Pakaian adat pengantin dari Jawa Barat"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_tengah_basahan_khas_solo, "Jawa Tengah Basahan Khas Solo", "Pakaian adat pengantin dari Jawa Tengah Khas Solo"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_tengah, "Jawa Tengah", "Pakaian adat pengantin dari Jawa Tengah"));

        adapter = new AdapterPakaianAdat(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);
    }
}
