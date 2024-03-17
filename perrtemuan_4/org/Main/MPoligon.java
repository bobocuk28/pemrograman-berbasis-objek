package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang: " + persegi.hitungLuas());
        Segitiga segitiga = new Segitiga(6, 4, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
    }
}
