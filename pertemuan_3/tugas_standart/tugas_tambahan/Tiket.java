public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

        // Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0 : "Jumlah pemesanan harus lebih dari 0";

        // Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int eWalletIndex) {
        // Memeriksa apakah index e-wallet yang dipilih valid
        assert eWalletIndex >= 1 && eWalletIndex <= 4 : "Pilihan e-wallet tidak valid";

        // Assertion untuk memastikan e-wallet yang dipilih valid
        assert !getEWallet(eWalletIndex).isEmpty() : "Pilihan e-wallet tidak valid";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(eWalletIndex));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "DANA";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}
