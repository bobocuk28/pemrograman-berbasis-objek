/*
 * Naufal Alwi Ramadhani
 * Sabtu, 25 - 5 - 2024
 * ArmadaKendaraan.java
 */
import java.util.ArrayList;
import java.util.Collection;
public class ArmadaKendaraan {
    private Collection<Vehicle> allArmada = new ArrayList<>();

    public void tambahUnitKendaraan(Collection<? extends Vehicle> armada) {
        allArmada.addAll(armada);
    }

    public Collection<Vehicle> getAllArmada() {
        return allArmada;
    }
}
