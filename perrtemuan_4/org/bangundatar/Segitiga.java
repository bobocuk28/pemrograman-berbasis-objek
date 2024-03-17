package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.jumlahSisi=jumlahSisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
