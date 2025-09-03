package LMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Book Title: ");
        String title = sc.next();

        System.out.print("Enter Book Author: ");
        String author = sc.next();

        System.out.print("Enter Book Count: ");
        int count = sc.nextInt();

        books.add(new Book(id, title, author, count));
        System.out.println("Book added successfully.");
    }

    public void issueBook() {
        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();

        for (Book book : books) {
            if (book.getBookId() == id) {
                if (book.getCount() > 0) {
                    book.setCount(book.getCount() - 1);
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book not available.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook() {
        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        for (Book book : books) {
            if (book.getBookId() == id) {
                book.setCount(book.getCount() + 1);
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayInfo();
        }
    }
}
