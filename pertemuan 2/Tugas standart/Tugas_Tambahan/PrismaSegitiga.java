public class PrismaSegitiga {
    private Segitiga segitiga;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga segitiga, double tinggiPrisma) {
        this.segitiga = segitiga;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        return segitiga.hitungLuas() * tinggiPrisma;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = segitiga.hitungLuas();
        double kelilingAlas = segitiga.getAlas() + segitiga.getTinggi() +
                Math.sqrt(segitiga.getAlas() * segitiga.getAlas() +
                segitiga.getTinggi() * segitiga.getTinggi());
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }
}
