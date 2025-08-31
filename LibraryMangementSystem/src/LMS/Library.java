//Library Book Management
//Create a class Book with attributes bookId, title, author, and isIssued. 
//Use a constructor to initialize values. 
//Write methods to issue a book, return a book, and display available books.

package LMS;
import java.util.*;

public class Library {
	
	ArrayList <Book> list = new ArrayList();
	Scanner sc = new Scanner (System.in);
	
	
	public void availableBook() {
	    if (list.isEmpty()) {  // add only once
	        list.add(new Book(101, "Book1", "Author1", 4, false));
	        list.add(new Book(102, "Book2", "Author2", 1, false));
	        list.add(new Book(103, "Book3", "Author3", 5, false));
	    }
	}

	
	public void addBook () {

		System.out.print("Enter Book Id: ");
		int id = sc.nextInt();
		
		sc.nextLine();  // consume leftover newline
		System.out.print("Enter Book Title: ");
		String tit = sc.nextLine();

		System.out.print("Enter Book Author: ");
		String auth = sc.nextLine();
		
		
		int count = 1;
		
		boolean isIssued = false;
		
		list.add(new Book (id, tit, auth, count, false));
		
		System.out.println (tit + "Book Added Suscessfully");
	}

	
	public void issueBook () {
		System.out.print("Enter Book Id: ");
		int id = sc.nextInt ();
		
		boolean found = false;
		for (Book b : list) {
		    if (b.bookId == id) {
		        found = true;
		        if (b.count > 0) {
		            System.out.println("Book Issued Successfully!");
		            b.count--;
		        } else {
		            System.out.println("Insufficient copies of this Book.");
		        }
		        break; // stop after finding the book
		    }
		}
		if (!found) {
		    System.out.println("Invalid Book Id.");
		}

	}
	
	
	public void returnBook () {
		System.out.println("Enter the Id and book name of book which you want to return");
		System.out.print("Enter Book Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Book Author: ");
		String auth = sc.next();
		
		boolean found = false;
		for (Book b : list) {
		    if (b.bookId == id && b.author.equals(auth)) {
		        b.count++;
		        System.out.println("Book Returned Successfully!");
		        found = true;
		        break;
		    }
		}
		if (!found) {
		    System.out.println("Invalid Book Details. This book was not issued by the Librarian.");
		}

		
	}
	
	public void displayBook () {
		for (int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			System.out.println("Id: " + b.bookId + 
	                   " | Title: " + b.title + 
	                   " | Author: " + b.author + 
	                   " | Count: " + b.count);

		
		}
	}
	
	
}
