package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
        models.add(new PakaianAdatModel(R.drawable.pengantin_aceh, "Aceh", "Pakaian adat pengantin dari Aceh", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam lectus lectus, molestie non nunc aliquam, elementum interdum lacus. Vivamus pellentesque gravida magna id ullamcorper. Quisque non faucibus nisl, ut luctus sapien. Praesent in elementum felis. Quisque hendrerit nisi eget condimentum maximus. Nullam sed augue at sem egestas feugiat at id turpis. Pellentesque convallis id ipsum et interdum. In sed luctus neque.\n\nCurabitur ut quam magna. Phasellus euismod ultrices mauris, quis venenatis leo auctor aliquet. Curabitur sed ante libero. Fusce sagittis tincidunt blandit. Donec cursus vehicula tortor non ultricies. Proin eget magna sit amet libero lobortis iaculis sit amet vitae ex. Vivamus ut iaculis elit. Proin lorem erat, ultricies nec molestie eget, bibendum in urna. Donec felis erat, commodo nec mi ut, dignissim mollis magna. Fusce volutpat ac ipsum a semper. Vivamus dignissim iaculis volutpat."));
        models.add(new PakaianAdatModel(R.drawable.pengantin_aceh_timur, "Aceh Timur", "Pakaian adat pengantin dari Aceh Timur", "Pakaian adat pengantin dari Aceh Timur"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_bali_pengantin, "Bali", "Pakaian adat pengantin dari Bali", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_bangka_belitung, "Bangka Belitung", "Pakaian adat pengantin dari Bangka Belitung", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_bengkulu, "Bengkulu", "Pakaian adat pengantin dari Bengkulu", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_d_i_yogyakarta_baju_kesatrian_ageng, "D.I Yogyakarta Baju Kesatrian Ageng", "Pakaian adat pengantin dari D.I Yogyakarta Baju Kesatrian Ageng", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_d_i_yogyakarta_paes_ageng_basahan, "D.I Yogyakarta Paes Ageng Basahan", "Pakaian adat pengantin dari D.I Yogyakarta Paes Ageng Basahan", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_d_i_yogyakarta_paes_ageng_jangan_menir, "D.I Yogyakarta Paes Ageng Jangan Menir", "Pakaian adat pengantin dari D.I Yogyakarta Paes Ageng Jangan Menir", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_dki_jakarta_pria, "DKI Jakarta Pria", "Pakaian adat pengantin dari DKI Jakarta Pria", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_dki_jakarta_wanita, "DKI Jakarta Wanita", "Pakaian adat pengantin dari DKI Jakarta Wanita", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_gorontalo, "Gorontalo", "Pakaian adat pengantin dari Gorontal", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jambi, "Jambi", "Pakaian adat pengantin dari Jambi", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_barat_busana_kepangeranan, "Jawa Barat Busana Kepangeranan", "Pakaian adat pengantin dari Jawa Barat Busana Kepangeranan", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_barat_busana_pengantin_kebesaran, "Jawa Barat Busana Pengantin Kebesaran", "Pakaian adat pengantin dari Jawa barat Pengantin Kebesaran", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_barat, "Jawa barat", "Pakaian adat pengantin dari Jawa Barat", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_tengah_basahan_khas_solo, "Jawa Tengah Basahan Khas Solo", "Pakaian adat pengantin dari Jawa Tengah Khas Solo", "Pakaian adat pengantin"));
        models.add(new PakaianAdatModel(R.drawable.pengantin_jawa_tengah, "Jawa Tengah", "Pakaian adat pengantin dari Jawa Tengah", "Pakaian adat pengantin"));

        adapter = new AdapterPakaianAdat(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        ImageView imageBackIcon = findViewById(R.id.back_icon);
        imageBackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MateriPakaianAdatPengantinActivity.this, KategoriMateriActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
