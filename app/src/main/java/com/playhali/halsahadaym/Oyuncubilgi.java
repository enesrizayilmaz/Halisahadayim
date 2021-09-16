package com.playhali.halsahadaym;

class Oyuncubilgi {
    private String isim;
    private String telno;
    private String saat;
    private String yas;
    private String mevki;
    private String il;
    private String ilce;

    public Oyuncubilgi(String isim, String telno, String saat, String yas, String mevki, String il, String ilce) {
        this.isim = isim;
        this.telno = telno;
        this.saat = saat;
        this.mevki = mevki;
        this.il = il;
        this.ilce = ilce;
        this.yas=yas;
    }
    public Oyuncubilgi(){}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
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
}

