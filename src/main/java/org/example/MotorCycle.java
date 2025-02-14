package org.example;

public class MotorCycle extends Vehicle implements Rentable{
    private int engineCapacity;
    private boolean hasHelmet;

    public MotorCycle(String licensePlate, String brand, double rentalPricePerDay, int engineCapacity, boolean hasHelmet) {
        super(licensePlate, brand, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
        this.hasHelmet = hasHelmet;
    }


    @Override
    public void displayDetails() {
        System.out.println("Motorcycle: ");
        System.out.println("Engine capacity is " + engineCapacity);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalPricePerDay;
    }
}
