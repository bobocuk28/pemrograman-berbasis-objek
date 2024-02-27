public class MTitik2 {
    //Nama : Naufal Alwi Ramadhani
    //NIM : 24060122140154
    //deskripsi : membuat main dari method yang ada pada titik
    public static void main(String[] args){
        Titik2 t1 = new Titik2(8,5);
        Titik2 t2 = new Titik2(9,3);
        Garis g1 = new Garis(t1,t2);

        //Enkapsulasi
        System.out.println("absis dengan enkapsulasi: " + t1.getAbsis());

        //Garis
        System.out.println("Titik awal garis : (" + g1.getTitikAwal().getAbsis() + "," + g1.getTitikAwal().getOrdinat() + ")" );
        System.out.println("Titik akhir garis : (" + g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat() + ")" );

        //Jarak Pusat
        double jarak = t1.getJarakPusat();
        System.out.println("jarak pusat pada t1 adalah : " + jarak );

        //Refleksi
        t1.refleksiX();
        System.out.println("Hasil dari refleksi X pada t1 adalah :" + t1.getAbsis() + "," + t1.getOrdinat());
        t2.refleksiY();
        System.out.println("Hasil dari refleksi Y pada t2 adalah :" + t2.getAbsis() + "," + t2.getOrdinat());
        
        //getRefleksiX
        Titik2 titikRefleksiX = t1.getRefleksiX();
        System.out.println("Titik refleksi X: (" + titikRefleksiX.getAbsis() + "," + titikRefleksiX.getOrdinat() + ")");

        //getRefleksiY
        Titik2 titikRefleksiY = t1.getRefleksiY();
        System.out.println("Titik refleksi Y: (" + titikRefleksiY.getAbsis() + "," + titikRefleksiY.getOrdinat() + ")");

        /*kesimpulan : bahwa akses modifier berfungsi untuk memberi ijin/akses untuk melihat da memanggil detail implementasi dari suatu objek
        jika acces modifier bersifat private maka detail implementasi objek tersebut tidak dapat dilihat/akses(information hiding), 
        sedangkan public berarti detail implementasi suatu objek dapat dilihat/akses. jika detail tersebut tidak dapat diakses maka ketik
        dipanggil di Main akan eror*/
        
    }

}