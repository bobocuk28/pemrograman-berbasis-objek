package latihanMedium;
public class KontrolSenjata {

        private Senjata senjata;

        public KontrolSenjata(Senjata s) {
            this.senjata = s;
        }

        public boolean isAdaPeluru() {
            return senjata.getPeluru() > 0;
        }

        public void menembak(int jumlah) {
            if (senjata.getPeluru() >= jumlah) {
                senjata.menembak(jumlah);
                senjata.setPeluru(senjata.getPeluru() - jumlah);
            } else {
                System.out.println("Peluru tidak mencukupi!");
            }
        }

        public String menusuk() {
            if (senjata.isMenusuk()) {
                return "Sudah menusuk dengan bayonet.";
            } else {
                return "Belum menusuk dengan bayonet.";
            }
        }

        public void pasangBayonet() {
            senjata.setMenusuk(true);
            System.out.println("Bayonet dipasang.");
        }
        public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru diisi dengan jumlah: " + jumPeluru);
        }

//    KontrolSenjata(Senjata s);
//    isAdaPeluru():boolean
//    isiPeluru(int jumPeluru)
//    menembak(int jumlah);
//    menusuk():String
//    pasangBayonet();
//    senjata:Senjata
}