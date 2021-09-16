package com.playhali.halsahadaym;

public class Bilgi {

    private String il;
    private String ilce;
    private String saat;
    private String tarih;
    private String telno;
    private String mevki;

    public Bilgi(String il, String ilce, String saat, String tarih, String telno, String mevki) {
        this.il = il;
        this.ilce = ilce;
        this.saat = saat;
        this.tarih = tarih;
        this.telno = telno;
        this.mevki = mevki;
    }

    public Bilgi(){

    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }
}