// Base class: Course
class Course {
    String courseName;
    int duration;

    // Constructor for Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse (inherits from Course)
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor for OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);  // Call the constructor of the superclass Course
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override displayCourseDetails() to include online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();  // Display basic course details
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (inherits from OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor for PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);  // Call the constructor of OnlineCourse
        this.fee = fee;
        this.discount = discount;
    }

    // Override displayCourseDetails() to include paid course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();  // Display details from OnlineCourse
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Creating an instance of PaidOnlineCourse
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 12, "Udemy", true, 100.00, 20.0);

        // Displaying the course details
        paidCourse.displayCourseDetails();
    }
}
