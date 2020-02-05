package com.lina.pengenalanpakaianadatnusantaran;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.Animator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class GameActivity extends AppCompatActivity {
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

    private List<PertanyaanModel> dataPertanyaan;
    private int hitungMulaiAnimasi = 0;
    private int hitungAkhirAnimasi = 0;
    private int posisiPertanyanModel = 0;
    private int skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

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

        TextView textJudulGame = findViewById(R.id.teks_judul_game);
        textJudulGame.setText("Game Pakaian Adat Sehari - hari");

        // get kategori game
        String kategori = getIntent().getStringExtra("kategori");

        // default get data soal pakaian sehari
        DataSoalPakaianAdat dataSoal = new DataSoalPakaianAdat();
        dataPertanyaan = dataSoal.getDataSoalPakaianAdatSehari();

        // jika kategori pengantin
        // get data soal pakaian pengantin
        if (kategori.equals("pengantin") ) {
            dataPertanyaan = dataSoal.getDataSoalPakaianAdatPengantin();
            textJudulGame.setText("Game Pakaian Adat Pengantin");
        }

        // mulai animasi
        playAnimasi(cardPertanyaan, 0, "gambar");

        // handle klik jawaban
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
            }
        });
    }

    private void playAnimasi(final View view, final int value, final String data) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                if (value == 0 && hitungMulaiAnimasi < 4) {
                    String option = "";
                    CardView element = cardJawabanA;
                    if (hitungMulaiAnimasi == 0) {
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanA();
                        element = cardJawabanA;
                    }else if (hitungMulaiAnimasi == 1) {
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanB();
                        element = cardJawabanB;
                    }else if (hitungMulaiAnimasi == 2) {
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanC();
                        element = cardJawabanC;
                    }else if (hitungMulaiAnimasi == 3) {
                        element = cardJawabanD;
                        option = dataPertanyaan.get(posisiPertanyanModel).getJawabanD();
                    }
                    playAnimasi(element, 0, option);
                    hitungMulaiAnimasi++;
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                // data change
                if (value == 0 && hitungAkhirAnimasi < 4) {
                    if (!data.equals("gambar")) {
                        if (hitungAkhirAnimasi == 0) {
                            jawabanA.setText(data);
                        }else if (hitungAkhirAnimasi == 1) {
                            jawabanB.setText(data);
                        }else if (hitungAkhirAnimasi == 2) {
                            jawabanC.setText(data);
                        }else if (hitungAkhirAnimasi == 3) {
                            jawabanD.setText(data);
                        }
                        hitungAkhirAnimasi++;
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

    private void pertanyaanSelanjutnya() {
        posisiPertanyanModel++;

        if (posisiPertanyanModel == dataPertanyaan.size()){
            posisiPertanyanModel--;
            // tampilkan skor activity
            Intent intent = new Intent(GameActivity.this, SkorActivity.class);
            double skorTotal = ((double) skor / dataPertanyaan.size()) * 100;
            int hasil = (int) skorTotal;
            intent.putExtra("skor", hasil);
            startActivity(intent);
            return;
        }

        hitungMulaiAnimasi = 0;
        hitungAkhirAnimasi = 0;
        playAnimasi(cardPertanyaan, 0, "gambar");
    }

    private void periksaJawaban(String jawaban) {
        String message = "Yeay! Jawaban kamu benar.";
        String jawabanBenar = dataPertanyaan.get(posisiPertanyanModel).getJawabanBenar();

        // jawaban benar tambah skor
        if (jawaban.equals(jawabanBenar)) {
            skor++;
        } else {
            message = "Uhh! Jawaban kamu salah :( yang benar itu " + jawabanBenar;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
        builder.setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Lanjut", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        pertanyaanSelanjutnya();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(GameActivity.this, "Kamu harus menyelesaikan kuis ini.",
                Toast.LENGTH_SHORT).show();
    }

}
