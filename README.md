Objectives: Develop a Vehicle Rental System that allows customers to rent different
types of vehicles, including cars, motorcycles, and trucks. The system should be designed
using object-oriented programming (OOP) principles, emphasizing inheritance and
polymorphism to efficiently manage vehicle types and rental operations.
Requirements:
1. Define an abstract base class Vehicle that includes:
   a. Protected attributes: licensePlate, brand, rentalPricePerDay
   b. A constructor to initialize common attributes.
   c. A getter method for rentalPricePerDay.
   d. An abstract method displayDetails() to be implemented by subclasses.
2. Create three subclasses (Car, Motorcycle, and Truck) that inherit from Vehicle:
   a. Each subclass should have specific attributes:
   i.
   Car: numSeats, fuelType
   ii.
   iii.
   Motorcycle: engineCapacity, hasHelmet
   Truck: cargoCapacity, numAxles
   b. Each subclass should override displayDetails() to display its attributes.
3. Create an interface Rentable that declares:
   a. A method calculateRentalCost(int days) that calculates and returns the total
   rental cost.
   b. Each vehicle subclass should implement this method.
4. Manage a fixed number of vehicles using an array (Vehicle[] availableVehicles).
   a. The system should store exactly 5 vehicles at startup.
   b. Once a vehicle is rented, set that position in the array to null.
5. Create a MainApp class to:
   a. Provide a menu-driven interface for users to:
   i.
   View available vehicles.
   ii.
   iii.
   Rent a vehicle by selecting its license plate and the number of days.
   Display the total rental cost after selection.
   b. Ensure that once a vehicle is rented, it is no longer available for rent.