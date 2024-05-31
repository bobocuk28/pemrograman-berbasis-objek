/*
 * Naufal Alwi Ramadhani
 * Sabtu, 25 - 5 - 2024
 * Vehicle.java
 */

 public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
