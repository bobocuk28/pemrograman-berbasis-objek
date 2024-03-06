public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka== 13){
            throw new AngkaSialException();

        }
        System.out.println(angka+"bukan angka sial");

    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka");
        }
    }
    /* baris keduabelas dalam modul tidak akan dieksekusi karena baris tersebut dijalankan
    hanya pada saat angka yang dimasukkan bernilai selain 13*/
    /*as.cobaAngka(13) juga tidak akan dieksekusi karena angka tersebut merupakan angka eksepsi
    sehingga ketika program tersebut berjalan dan menemukan angka 13 maka akan langsung berhenti(/)
}

