package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GamePakaianAdatActivity extends AppCompatActivity {

    private CardView cardPertanyaan;
    private CardView cardJawabanA;
    private CardView cardJawabanB;
    private CardView cardJawabanC;
    private CardView cardJawabanD;
    private ImageView gambarPertanyaan;
    private TextView jawabanA;
    private TextView jawabanB;
    private TextView jawabanC;
    private TextView jawabanD;
    private int countAnimateStart = 0;
    private int countAnimateEnd = 0;
    private List<PertanyaanModel> dataPertanyaan;
    private int posisiPertanyanModel = 0;
    private int skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_pakaian_adat);

        cardPertanyaan = findViewById(R.id.cardPertanyaan);
        cardJawabanA = findViewById(R.id.jawaban_a);
        cardJawabanB = findViewById(R.id.jawaban_b);
        cardJawabanC = findViewById(R.id.jawaban_c);
        cardJawabanD = findViewById(R.id.jawaban_d);
        gambarPertanyaan = findViewById(R.id.gambar_pertanyaan);
        jawabanA = findViewById(R.id.teks_jawaban_a);
        jawabanB = findViewById(R.id.teks_jawaban_b);
        jawabanC = findViewById(R.id.teks_jawaban_c);
        jawabanD = findViewById(R.id.teks_jawaban_d);

        dataPertanyaan = new ArrayList<>();
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

        // mulai animasi
        playAnimasi(cardPertanyaan, 0, "gambar");

        klikJawaban(cardJawabanA, jawabanA);
        klikJawaban(cardJawabanB, jawabanB);
        klikJawaban(cardJawabanC, jawabanC);
        klikJawaban(cardJawabanD, jawabanD);
    }

    private void klikJawaban(View view, final TextView jawaban) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                periksaJawaban(jawaban.getText().toString());
                posisiPertanyanModel++;

                if (posisiPertanyanModel == dataPertanyaan.size()){
                    posisiPertanyanModel--;
                    // tampilkan skor activity
                    Intent intent = new Intent(GamePakaianAdatActivity.this, SkorActivity.class);
                    intent.putExtra("skor", skor);
                    intent.putExtra("total", dataPertanyaan.size());
                    startActivity(intent);

                    Toast.makeText(GamePakaianAdatActivity.this, "Skor kamu: " + skor,
                            Toast.LENGTH_LONG).show();
                    return;
                }

                countAnimateStart = 0;
                countAnimateEnd = 0;
                playAnimasi(cardPertanyaan, 0, "gambar");
            }
        });
    }

    private void playAnimasi(final View view, final int value, final String data) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                if (value == 0 && countAnimateStart < 4) {
                    String option = "";
                    CardView element = cardJawabanA;
                    if (countAnimateStart == 0) {
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanA();
                        element = cardJawabanA;
                    }else if (countAnimateStart == 1) {
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanB();
                        element = cardJawabanB;
                    }else if (countAnimateStart == 2) {
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanC();
                        element = cardJawabanC;
                    }else if (countAnimateStart == 3) {
                        element = cardJawabanD;
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanD();
                    }
                    playAnimasi(element, 0, option);
                    countAnimateStart++;
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                // data change
                if (value == 0 && countAnimateEnd < 4) {
                    if (!data.equals("gambar")) {
                        if (countAnimateEnd == 0) {
                            jawabanA.setText(data);
                        }else if (countAnimateEnd == 1) {
                            jawabanB.setText(data);
                        }else if (countAnimateEnd == 2) {
                            jawabanC.setText(data);
                        }else if (countAnimateEnd == 3) {
                            jawabanD.setText(data);
                        }
                        countAnimateEnd++;
                    }
                }

                if (value == 0) {
                    if (data.equals("gambar")) {
                        gambarPertanyaan.setImageResource(dataPertanyaan.get(posisiPertanyanModel).getGambar());
                    }
                    playAnimasi(view, 1, data);
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

    private void periksaJawaban(String jawaban) {
        if (jawaban.equals(dataPertanyaan.get(posisiPertanyanModel).getJawabanBenar())) {
            // benar
            skor++;
        } else {
            // salah
        }
    }

}
