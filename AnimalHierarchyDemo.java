// Superclass: LivingCreature
class LivingCreature {
    String name;
    int age;

    public LivingCreature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method that can be overridden in subclasses
    public void makeSound() {
        System.out.println("Living creature makes a sound");
    }
}

// Subclass: Canine (Dog)
class Canine extends LivingCreature {
    public Canine(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass: Feline (Cat)
class Feline extends LivingCreature {
    public Feline(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Subclass: AvianCreature (Bird)
class AvianCreature extends LivingCreature {
    public AvianCreature(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}

public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        LivingCreature dog = new Canine("Rex", 3);
        LivingCreature cat = new Feline("Whiskers", 2);
        LivingCreature bird = new AvianCreature("Tweety", 1);

        dog.makeSound();  // Output: Bark
        cat.makeSound();  // Output: Meow
        bird.makeSound(); // Output: Chirp
    }
}
