package org.example;

public class Car extends Vehicle implements Rentable{
    private int numSeats;
    private String fuelType;

    public Car(String licensePlate, String brand, double rentalPricePerDay, int numSeats, String fuelType) {
        super(licensePlate, brand, rentalPricePerDay);
        this.numSeats = numSeats;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Number of seats is " + numSeats + " and fuel type is " + fuelType);
    }

    public double calculateRentalCost(int days) {
        return days * this.rentalPricePerDay;
    }
}
