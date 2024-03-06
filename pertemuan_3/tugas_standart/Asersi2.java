class Lingkaran {
    private double jarijari;
    
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert(jarijari > 0): "jari jari tidak boleh negatif";
        Lingkaran lingkaran1 = new Lingkaran(jarijari);
        double kelilingLingkaran = lingkaran1.hitungKeliling();
        System.out.println("keliling lingkaran = "  + kelilingLingkaran);
    }
    /*pada inisialisasi kita memasukkan angka 0 tetapi pada bagian assert
    kita menyatakan kondisi dimana jari jari > 0 yang menyebabkan kegagalan.
}
