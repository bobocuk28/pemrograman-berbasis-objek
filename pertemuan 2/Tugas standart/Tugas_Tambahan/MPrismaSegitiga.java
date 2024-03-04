public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 4);
        PrismaSegitiga prisma = new PrismaSegitiga(segitiga, 5);

        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();

        System.out.println("Volume Prisma Segitiga: " + volume);
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}
