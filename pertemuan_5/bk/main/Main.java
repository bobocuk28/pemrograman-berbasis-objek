//Nama : Naufal Alwi Ramadhani
//NIM : 24060122140154
package bk.main;

import bk.bukuFiksi.bukuNovel;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel bukuNovel1 = new bukuNovel("The Great Gatsby", "F. Scott Fitzgerald", "1925", "Classic", 200, 150.0);
        bukuNovel1.view();
        bukuNovel1.setGenre("Romance");
        bukuNovel1.view();

        bukuAkademik bukuAkademik1 = new bukuAkademik("Dasar-Dasar Pemrograman Java", "Jane Doe", "2022", "Komputer", "Akademik", 400, 200.0);
        bukuAkademik1.view();
        bukuAkademik1.setGenre("Pemrograman Lanjut");
        bukuAkademik1.view();
    }
}
