// Base class: Worker
class Worker {
    String name;
    int id;
    double salary;

    public Worker(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// Subclass: TeamLeader (Manager)
class TeamLeader extends Worker {
    int teamSize;

    public TeamLeader(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: SoftwareEngineer (Developer)
class SoftwareEngineer extends Worker {
    String programmingLanguage;

    public SoftwareEngineer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass: Trainee (Intern)
class Trainee extends Worker {
    String university;

    public Trainee(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        TeamLeader teamManager = new TeamLeader("Alice", 1, 75000, 10);
        SoftwareEngineer softwareDeveloper = new SoftwareEngineer("Bob", 2, 50000, "Java");
        Trainee internStudent = new Trainee("Charlie", 3, 15000, "MIT");

        teamManager.displayDetails();
        softwareDeveloper.displayDetails();
        internStudent.displayDetails();
    }
}
