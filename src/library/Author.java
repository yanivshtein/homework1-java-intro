package library;

public class Author {
    // The name of the author
    private String name;
    // The birth year of the author
    private int birthYear;

    // Constructor to initialize an author with a name and birth year
    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Getter for the author's name
    public String getName() {
        return name;
    }

    // Getter for the author's birth year
    public int getBirthYear() {
        return birthYear;
    }

    // Method to calculate the author's age in a given year
    public int getAge(int thisYear) {
        return thisYear - birthYear;
    }

    // String representation of the author
    public String toString() {
        return name + "(" + birthYear + ")";
    }
}
