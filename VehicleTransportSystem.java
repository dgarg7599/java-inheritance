// Superclass: Transport
class Transport {
    int maxSpeed;
    String fuelType;

    public Transport(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass: Sedan (Car)
class Sedan extends Transport {
    int seatCapacity;

    public Sedan(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: FreightVehicle (Truck)
class FreightVehicle extends Transport {
    int loadCapacity;

    public FreightVehicle(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass: TwoWheeler (Motorcycle)
class TwoWheeler extends Transport {
    boolean hasSideCar;

    public TwoWheeler(int maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Side Car: " + hasSideCar);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Transport car = new Sedan(180, "Petrol", 5);
        Transport truck = new FreightVehicle(120, "Diesel", 10);
        Transport motorcycle = new TwoWheeler(160, "Petrol", true);

        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
