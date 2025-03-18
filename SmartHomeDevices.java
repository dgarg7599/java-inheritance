// Superclass: Device
class Device {
    String deviceId;
    String status;

    // Constructor for Device
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor for Thermostat
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);  // Call the constructor of the superclass Device
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus() to include thermostat details
    @Override
    public void displayStatus() {
        super.displayStatus();  // Display basic device details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create a Thermostat object, which also includes the device details
        Thermostat thermostat = new Thermostat("T123", "Active", 22);

        // Display both device and thermostat details
        thermostat.displayStatus();
    }
}
