package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MateriPakaianAdatActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapaterPakaianAdat adapter;
    List<PakaianAdatModel> models;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_pakaian_adat);

        models = new ArrayList<>();
        models.add(new PakaianAdatModel(R.drawable.bali, "Bali", "Pakaian adat sehari - hari Bali"));
        models.add(new PakaianAdatModel(R.drawable.dki_jakarta, "DKI Jakarta", "Pakaian adat sehari - hari Jakarta"));
        models.add(new PakaianAdatModel(R.drawable.banten_pria, "Banten Pria", "Pakaian adat sehari - hari Banten Pria"));
        models.add(new PakaianAdatModel(R.drawable.banten_wanita, "Banten Wanita", "Pakaian adat sehari - hari Banten Wanita"));
        models.add(new PakaianAdatModel(R.drawable.d_i_yogyakarta, "D I Yogyakarta", "Pakaian adat sehari - hari D I Yogyakarta"));
        models.add(new PakaianAdatModel(R.drawable.jawa_barat, "Jawa Barat", "Pakaian adat sehari - hari Barat"));
        models.add(new PakaianAdatModel(R.drawable.jawa_tengah, "Jawa Tengah", "Pakaian adat sehari - hari Tengah"));
        models.add(new PakaianAdatModel(R.drawable.jawa_timur_banyuwangi, "Jawa Timur Banyuwangi", "Pakaian adat sehari - hari Jawa Timur Banyuwangi"));
        models.add(new PakaianAdatModel(R.drawable.jawa_timur_madura, "Jawa Timur Madura", "Pakaian adat sehari - hari Jawa Timur Madura"));
        models.add(new PakaianAdatModel(R.drawable.kalimantan_barat_pria, "Kalimantan Barat Pria", "Pakaian adat sehari - hari Kalimantan Barat Pria"));
        models.add(new PakaianAdatModel(R.drawable.kalimantan_barat_wanita, "Kalimantan Barat Wanita", "Pakaian adat sehari - hari Kalimantan Barat Wanita"));
        models.add(new PakaianAdatModel(R.drawable.kalimantan_tengah, "Kalimantan Tengah", "Pakaian adat sehari - hari Kalimantan Tengah"));
        models.add(new PakaianAdatModel(R.drawable.kalimantan_utara, "Kalimantan Utara", "Pakaian adat sehari - hari Kalimantan Utara"));
        models.add(new PakaianAdatModel(R.drawable.lampung_pria, "Lampung Pria", "Pakaian adat sehari - hari Lampung Pria"));
        models.add(new PakaianAdatModel(R.drawable.lampung_wanita, "Lampung Wanita", "Pakaian adat sehari - hari Lampung Wanita"));
        models.add(new PakaianAdatModel(R.drawable.ntt_suku_manggarai_sikka, "Nusa Tenggara  Timur Suku Manggarai & Sikka", "Pakaian adat sehari - hari Nusa Tenggara  Timur Suku Manggarai & Sikka"));
        models.add(new PakaianAdatModel(R.drawable.ntb_suku_bima, "Nusa Tenggara Barat Suku Bima", "Pakaian adat sehari - hari Nusa Tenggara Timur Suku Bima"));
        models.add(new PakaianAdatModel(R.drawable.ntt_suku_sumba, "Nusa Tenggara Timur Suku Sumba", "Pakaian adat sehari - hari Nusa Tenggara Timur Suku Sumba"));
        models.add(new PakaianAdatModel(R.drawable.ntt_suku_timor_barat_bajawan, "Nusa Tenggara Timur Suku Timor Barat & Bajawa", "Pakaian adat sehari - hari Nusa Tenggara Timur Suku Timor Barat & Bajawa"));

        adapter = new AdapaterPakaianAdat(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);
    }
}
