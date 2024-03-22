//Nama : Naufal Alwi Ramadhani
//NIM : 24060122140154
package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukuAkademik extends bukuNonFiksi {
    private String genre;

    public bukuAkademik(String judul, String penulis, String tahunTerbit, String subjek, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Genre: " + genre);
    }
}
