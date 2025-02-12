package org.example;

public abstract class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected double rentalPricePerDay;

    protected Vehicle(String licensePlate, String brand, double rentalPricePerDay) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public abstract void displayDetails();
}
