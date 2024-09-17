package library;

public class Book {
    // The title of the book
    private String title;
    // The author of the book
    private Author auth;

    // Constructor to initialize a book with a title and an author
    public Book(String title, Author auth) {
        this.title = title;
        this.auth = auth;
    }

    // Getter for the book's title
    public String getTitle() {
        return title;
    }

    // Getter for the author's name
    public String getAuthorName() {
        return auth.getName();
    }

    // Getter for the author's birth year
    public int getAuthorBirthYear() {
        return auth.getBirthYear();
    }

    // String representation of the book
    public String toString() {
        return getTitle() + " written by " + auth.toString(); 
    }
}
