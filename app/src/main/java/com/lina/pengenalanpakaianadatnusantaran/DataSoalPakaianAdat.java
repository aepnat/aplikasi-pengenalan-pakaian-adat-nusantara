package com.lina.pengenalanpakaianadatnusantaran;

import java.util.ArrayList;
import java.util.List;

public class DataSoalPakaianAdat {
    public DataSoalPakaianAdat() {
        // constructor
    }

    public List<PertanyaanModel> getDataSoalPakaianAdatSehari() {
        List<PertanyaanModel> dataPertanyaan = new ArrayList<>();

        dataPertanyaan.add(new PertanyaanModel(R.drawable.bali,
                "DKI Jakarta",
                "Bali",
                "Yogyakarta",
                "Jawa Barat",
                "Bali"
        ));
        dataPertanyaan.add(new PertanyaanModel(R.drawable.dki_jakarta,
                "Bali",
                "Yogyakarta",
                "DKI Jakarta",
                "Jawa Barat",
                "DKI Jakarta"
        ));
        dataPertanyaan.add(new PertanyaanModel(R.drawable.jawa_barat,
                "DKI Jakarta",
                "Yogyakarta",
                "Bali",
                "Jawa Barat",
                "Jawa Barat"
        ));
        dataPertanyaan.add(new PertanyaanModel(R.drawable.d_i_yogyakarta,
                "Yogyakarta",
                "DKI Jakarta",
                "Jawa Barat",
                "Bali",
                "Yogyakarta"
        ));

        return dataPertanyaan;
    }

    public List<PertanyaanModel> getDataSoalPakaianAdatPengantin() {
        List<PertanyaanModel> dataPertanyaan = new ArrayList<>();

        dataPertanyaan.add(new PertanyaanModel(R.drawable.dki_jakarta,
                "Bali",
                "Yogyakarta",
                "DKI Jakarta",
                "Jawa Barat",
                "DKI Jakarta"
        ));
        dataPertanyaan.add(new PertanyaanModel(R.drawable.bali,
                "DKI Jakarta",
                "Bali",
                "Yogyakarta",
                "Jawa Barat",
                "Bali"
        ));
        dataPertanyaan.add(new PertanyaanModel(R.drawable.d_i_yogyakarta,
                "Yogyakarta",
                "DKI Jakarta",
                "Jawa Barat",
                "Bali",
                "Yogyakarta"
        ));
        dataPertanyaan.add(new PertanyaanModel(R.drawable.jawa_barat,
                "DKI Jakarta",
                "Yogyakarta",
                "Bali",
                "Jawa Barat",
                "Jawa Barat"
        ));

        return dataPertanyaan;
    }
}
