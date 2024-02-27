public class MGaris {
    //Nama : Naufal Alwi Ramadhani
    //NIM : 24060122140154
    //deskripsi : membuat main dari method yang ada pada Caris
    
    public static void main(String[] args){
        Titik2 t1 = new Titik2(3,5);
        Titik2 t2 = new Titik2(7,9);
        Garis g1 = new Garis(t1,t2);
        //Menampilkan panjang garis
        System.out.println("Panjang garis g1: " + g1.getPanjang()); 

        //Menampilkan gradien garis
        System.out.println("Gradien garis g1: " + g1.getGradien()); 

        //getRefleksiY
        Garis garisRefleksiY = g1.getRefleksiY();
        System.out.println("Garis refleksi Y:");
        System.out.println("Titik awal: (" + garisRefleksiY.getTitikAwal().getAbsis() + "," + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir: (" + garisRefleksiY.getTitikAkhir().getAbsis() + "," + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        //isTegakLurus
        Garis g2 = new Garis(t1, new Titik2(2, 7));   //Membuat garis baru untuk dibandingkan
        System.out.println("Apakah garis g1 tegak lurus dengan garis g2? " + g1.isTegakLurus(g2)); 
    }

}