

package thirdtask;
import java.util.Scanner;

public class Library {

	private Book[] books;
    private int numberOfBooks;

    // Constructor
    public Library(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book by ID
    public void removeBook(String bookId) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getBookId().equals(bookId)) {
                for (int j = i; j < numberOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--numberOfBooks] = null;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Method to search a book by ID
    public Book searchBookById(String bookId) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getBookId().equals(bookId)) {
                return books[i];
            }
        }
        return null;
    }

    // Method to display all books
    public void displayBooks() {
        if (numberOfBooks == 0) {
            System.out.println("No books available in the library.");
        } else {
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.println(books[i]);
            }
        }
    }
}