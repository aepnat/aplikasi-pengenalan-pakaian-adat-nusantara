package com.lina.pengenalanpakaianadatnusantaran;

public class PertanyaanModel {

    private int gambar;
    private String jawabanA, jawabanB, jawabanC, jawabanD, jawabanBenar;

    public PertanyaanModel(int gambar, String jawabanA, String jawabanB, String jawabanC, String jawabanD, String jawabanBenar) {
        this.gambar = gambar;
        this.jawabanA = jawabanA;
        this.jawabanB = jawabanB;
        this.jawabanC = jawabanC;
        this.jawabanD = jawabanD;
        this.jawabanBenar = jawabanBenar;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJawabanA() {
        return jawabanA;
    }

    public void setJawabanA(String jawabanA) {
        this.jawabanA = jawabanA;
    }

    public String getJawabanB() {
        return jawabanB;
    }

    public void setJawabanB(String jawabanB) {
        this.jawabanB = jawabanB;
    }

    public String getJawabanC() {
        return jawabanC;
    }

    public void setJawabanC(String jawabanC) {
        this.jawabanC = jawabanC;
    }

    public String getJawabanD() {
        return jawabanD;
    }

    public void setJawabanD(String jawabanD) {
        this.jawabanD = jawabanD;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public void setJawabanBenar(String jawabanBenar) {
        this.jawabanBenar = jawabanBenar;
    }
}
