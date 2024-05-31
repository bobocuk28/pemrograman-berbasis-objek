/*
 * Naufal Alwi Ramadhani
 * Sabtu, 25 - 5 - 2024
 * ProgramMedium.java
 */
import java.util.ArrayList;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck(10);
        System.out.println(truck);
        SeaPlane splane = new SeaPlane(15);
        System.out.println(splane);
        Helicopter copter = new Helicopter(12);
        System.out.println(copter);
        System.out.println("#########################################");

        ArrayList<Truck> armadaTruck = new ArrayList<>();
        ArrayList<SeaPlane> armadaSeaPlane = new ArrayList<>();
        ArrayList<Helicopter> armadaHelicopter = new ArrayList<>();

        // Menambahkan kendaraan ke kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(splane);
        System.out.println("jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("jumlah Armada Helicopter: " + armadaHelicopter.size());
        System.out.println("#########################################");

        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahUnitKendaraan(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahUnitKendaraan(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahUnitKendaraan(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}
