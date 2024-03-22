//Nama : Naufal Alwi Ramadhani
//NIM : 24060122140154
package bk.buku;

public class Buku {
    private String judul;
    private String penulis;
    private String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void view() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
