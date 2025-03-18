// Superclass: Person
class Person {
    String name;
    int id;

    // Constructor for Person
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface: Worker
interface Worker {
    // Method that must be implemented by any class that implements Worker
    void performDuties();
}

// Subclass: Chef (inherits from Person and implements Worker)
class Chef extends Person implements Worker {

    // Constructor for Chef
    public Chef(String name, int id) {
        super(name, id);
    }

    // Implement performDuties for Chef
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking the food.");
    }
}

// Subclass: Waiter (inherits from Person and implements Worker)
class Waiter extends Person implements Worker {

    // Constructor for Waiter
    public Waiter(String name, int id) {
        super(name, id);
    }

    // Implement performDuties for Waiter
    @Override
    public void performDuties() {
        System.out.println(name + " is serving the food.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 102);

        // Calling performDuties method on both
        chef.performDuties();
        waiter.performDuties();
    }
}
