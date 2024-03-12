import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 0);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scanner = new Scanner(System.in);

        // Interaksi dengan pengguna
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp25000");
        System.out.println("2. Mie Ayam - Rp20000");

        try {
            // Meminta input dari pengguna
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = scanner.nextInt();

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();

            // Menentukan menu yang dipilih
            Menu menu = null;
            if (pilihanMenu == 1) {
                menu = menu1;
            } else if (pilihanMenu == 2) {
                menu = menu2;
            } else {
                throw new MenuTidakTersediaException("Menu tidak valid.");
            }
            
            if (menu == null) {
                throw new MenuTidakTersediaException("Menu tidak valid.");
            }

            if (menu.getStok() <= 0) {
                throw new MenuTidakTersediaException("Maaf, menu " + menu.getNama() + " tidak tersedia.");
            }

            if (jumlahPesanan > menu.getStok()) {
                throw new JumlahPesananMelebihiStokException("Jumlah pesanan melebihi stok yang tersedia.");
            }

            // Melakukan pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            menu.kurangiStok(jumlahPesanan);

            System.out.println("Pesanan berhasil dilakukan.");
            System.out.println("Total harga: Rp" + pesanan.getTotal());

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
