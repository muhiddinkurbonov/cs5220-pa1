
**Objectives:**

Develop a Vehicle Rental System that allows customers to rent different types of vehicles, including cars, motorcycles, and trucks. The system should be designed using object-oriented programming (OOP) principles, with a strong focus on inheritance and polymorphism to efficiently manage vehicle types and rental operations.

---

**Requirements:**

1. **Define an abstract base class `Vehicle` that includes:**
   - **Protected attributes:**
      - `licensePlate`
      - `brand`
      - `rentalPricePerDay`
   - **A constructor** to initialize common attributes.
   - **A getter method** for `rentalPricePerDay`.
   - **An abstract method `displayDetails()`** to be implemented by subclasses.

2. **Create three subclasses (`Car`, `Motorcycle`, and `Truck`) that inherit from `Vehicle`:**
   - Each subclass should have specific attributes:
      - **Car**:
         - `numSeats`
         - `fuelType`
      - **Motorcycle**:
         - `engineCapacity`
         - `hasHelmet`
      - **Truck**:
         - `cargoCapacity`
         - `numAxles`
   - Each subclass should **override `displayDetails()`** to display its specific attributes.

3. **Create an interface `Rentable` that declares:**
   - A method `calculateRentalCost(int days)` that calculates and returns the total rental cost.
   - Each vehicle subclass should **implement this method**.

4. **Manage a fixed number of vehicles using an array (`Vehicle[] availableVehicles`):**
   - The system should store exactly **5 vehicles** at startup.
   - Once a vehicle is rented, set that position in the array to `null`.

5. **Create a `MainApp` class to:**
   - Provide a **menu-driven interface** for users to:
      1. View available vehicles.
      2. Rent a vehicle by selecting its license plate and the number of days.
      3. Display the total rental cost after selection.
   - Ensure that once a vehicle is rented, it is **no longer available for rent**.

---

