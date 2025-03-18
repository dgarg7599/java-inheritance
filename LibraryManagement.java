// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor for Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    // Constructor for Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);  // Call the constructor of the superclass Book
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo() to include author details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Display Book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object, which also includes the book details
        Author author = new Author("Java Programming", 2021, "John Doe", "A seasoned programmer and author.");
        
        // Display both Book and Author details
        author.displayInfo();
    }
}
