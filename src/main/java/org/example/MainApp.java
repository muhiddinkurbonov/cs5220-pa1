package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Vehicle[] availableVehicles = new Vehicle[5];
        availableVehicles[0] = new Car("AB12345", "Honda", 45.0, 4, "gasoline");
        availableVehicles[1] = new Car("CD67890", "Tesla",52, 5, "electric");
        availableVehicles[2] = new MotorCycle("IJ1234", "Yamaha", 25.0,  125, true);
        availableVehicles[3] = new Truck("EF12345", "Volvo", 150.0, 20000, 4);
        availableVehicles[4] = new Truck("GH67890", "Scania", 200.0, 25000, 5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to MKVehicles rental!");
            System.out.println("1. View Available Vehicles.");
            System.out.println("2. Rent a Vehicle.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Vehicles: ");
                    break;
                case 2:
                    System.out.println("Enter license plate: ");
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