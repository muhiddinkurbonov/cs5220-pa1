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
    public void displayDetails() {
        System.out.println("Truck:");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
        System.out.println("Cargo Capacity: " + cargoCapacity + "kg");
        System.out.println("Number of Axles: " + numAxles);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalPricePerDay;
    }
}
