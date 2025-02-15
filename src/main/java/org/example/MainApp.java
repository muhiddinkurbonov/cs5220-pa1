package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Vehicle[] availableVehicles = new Vehicle[5];
        availableVehicles[0] = new Car("AB12345", "Honda", 45.0, 4, "gasoline");
        availableVehicles[1] = new Car("CD67890", "Tesla",52, 5, "electric");
        availableVehicles[2] = new MotorCycle("IJ1234", "Yamaha", 25.0,  125, true);
        availableVehicles[3] = new Truck("EF12345", "Volvo", 1050.0, 20000, 4);
        availableVehicles[4] = new Truck("GH67890", "Scania", 1500.0, 25000, 5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to MKVehicles rental!");
            System.out.println("1. View Available Vehicles.");
            System.out.println("2. Rent a Vehicle.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Vehicles: ");
                    for(Vehicle vehicle: availableVehicles) {
                        if(vehicle != null) {
                            vehicle.displayDetails();
                            System.out.println("-----------------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter license plate: ");
                    String licensePlate = scanner.next();
                    System.out.println("How many days would you like to rent it? ");
                    int days = scanner.nextInt();
                    for (int i = 0; i < availableVehicles.length; i++) { // loop through the array to find the matching vehicle
                        if(availableVehicles[i] != null && availableVehicles[i].licensePlate.equals(licensePlate)){
                            if(availableVehicles[i] instanceof Rentable) {
                                Rentable rentableVehicle = (Rentable) availableVehicles[i];
                                double totalCost = rentableVehicle.calculateRentalCost(days);
                                System.out.println("Total Rental Cost: $" + totalCost);
                                availableVehicles[i] = null; // Remove the vehicle from the array
                            } else {
                                System.out.println("Sorry! Vehicle cannot be rented.");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 3);
    }
}