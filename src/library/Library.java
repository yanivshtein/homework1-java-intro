package library;

public class Library {
    // Array to store books in the library
    private Book[] arr;

    // Constructor to initialize the library with a specified size
    public Library(int size) {
        this.arr = new Book[size];
    }

    // Method to add a book to the library at a specified position
    public void setBook(int bookNum, String title, Author auth) {
        Book book = new Book(title, auth);
        this.arr[bookNum] = book;
    }

    // Method to retrieve a book from the library by its position
    public Book getBook(int bookNum) {
    	if(this.arr[bookNum] != null)
    		return this.arr[bookNum];
    	return null;
    }
}
