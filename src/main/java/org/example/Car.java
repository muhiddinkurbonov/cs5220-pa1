package org.example;

public class Car extends Vehicle implements Rentable{
    private int numSeats;
    private String fuelType;

    public Car(String licensePlate, String brand, double rentalPricePerDay, int numSeats, String fuelType) {
        super(licensePlate, brand, rentalPricePerDay);
        this.numSeats = numSeats;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: ");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
        System.out.println("Number of Seats: " + numSeats);
        System.out.println("Fuel Type: " + fuelType);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * this.rentalPricePerDay;
    }
}
