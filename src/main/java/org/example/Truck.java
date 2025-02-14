package org.example;

public class Truck extends Vehicle implements Rentable{

    private int cargoCapacity;
    private int numAxles;

    public Truck(String licensePlate, String brand, double rentalPricePerDay, int cargoCapacity, int numAxles) {
        super(licensePlate, brand, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
        this.numAxles = numAxles;
    }

    @Override
    public double calculateRentalCost(int days) {
        return 0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck:");
        System.out.println("Cargo capacity: " + cargoCapacity);
        System.out.println("Number of axles: " + numAxles);
    }
}
