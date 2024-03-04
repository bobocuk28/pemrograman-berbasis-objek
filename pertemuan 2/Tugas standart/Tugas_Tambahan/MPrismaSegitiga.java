public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 4);
        PrismaSegitiga prisma = new PrismaSegitiga(segitiga, 5);

        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();

        System.out.println("Informasi Segitiga:");
        System.out.println("Alas Segitiga: " + segitiga.getAlas());
        System.out.println("Tinggi Segitiga: " + segitiga.getTinggi());
        System.out.println();

        System.out.println("Informasi Prisma Segitiga:");
        System.out.println("Tinggi Prisma: " + prisma.getTinggiPrisma());
        System.out.println();

        System.out.println("Volume Prisma Segitiga: " + volume);
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}
