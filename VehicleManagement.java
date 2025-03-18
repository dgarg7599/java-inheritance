// Superclass: Vehicle
class Vehicle {
    int maxSpeed;
    String model;

    // Constructor for Vehicle
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    // Method to refuel a vehicle
    void refuel();
}

// Subclass: ElectricVehicle (inherits from Vehicle)
class ElectricVehicle extends Vehicle {
    // Constructor for ElectricVehicle
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Method specific to ElectricVehicle
    public void charge() {
        System.out.println("Charging the Electric Vehicle.");
    }
}

// Subclass: PetrolVehicle (inherits from Vehicle and implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    
    // Constructor for PetrolVehicle
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implement refuel for PetrolVehicle
    @Override
    public void refuel() {
        System.out.println("Refueling the Petrol Vehicle.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        // Creating instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle electricCar = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle petrolCar = new PetrolVehicle(150, "Honda Civic");

        // Displaying info for both vehicles
        electricCar.displayInfo();
        electricCar.charge();
        
        petrolCar.displayInfo();
        petrolCar.refuel();
    }
}
