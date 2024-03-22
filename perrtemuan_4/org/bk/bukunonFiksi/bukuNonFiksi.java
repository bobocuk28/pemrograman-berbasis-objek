//Nama : Naufal Alwi Ramadhani
//NIM : 24060122140154
package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukuNonFiksi extends Buku {
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek() {
        return subjek;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Subjek: " + subjek);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }
}
