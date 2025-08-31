package August28;
import java.util.*;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void availableBook() {
        books.add(new Book(101, "DAC", "Snathan", 5, false));
        books.add(new Book(102, "DBDA", "Snathan2", 1, false));
        books.add(new Book(103, "DITS", "Snathan3", 0, false));
    }

    public void issueBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book ID to issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.bookId == id) {
                if (b.noOfBooks > 0 && !b.isIssued) {
                    b.isIssued = true;
                    b.noOfBooks--;
                    System.out.println("Book issued successfully: " + b.title);
                } else {
                    System.out.println("Book not available!");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found!");
    }

    public void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book ID to return: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.bookId == id) {
                if (b.isIssued) {
                    b.isIssued = false;
                    b.noOfBooks++;
                    System.out.println("Book returned successfully: " + b.title);
                } else {
                    System.out.println("This book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found!");
    }

    public void displayBook() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
