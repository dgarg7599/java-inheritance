// Base class: Person
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details (general for Person)
    public void displayRole() {
        System.out.println("This is a person.");
    }
}

// Subclass: Teacher (inherits from Person)
class Teacher extends Person {
    String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the constructor of the superclass Person
        this.subject = subject;
    }

    // Override displayRole to specify Teacher's role
    @Override
    public void displayRole() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

// Subclass: Student (inherits from Person)
class Student extends Person {
    String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Call the constructor of the superclass Person
        this.grade = grade;
    }

    // Override displayRole to specify Student's role
    @Override
    public void displayRole() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Subclass: Staff (inherits from Person)
class Staff extends Person {
    String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Call the constructor of the superclass Person
        this.department = department;
    }

    // Override displayRole to specify Staff's role
    @Override
    public void displayRole() {
        System.out.println("Staff: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // Creating instances of each role
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("John", 16, "10th Grade");
        Staff staff = new Staff("Mrs. Lee", 35, "Administration");

        // Displaying the role of each person
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

// .