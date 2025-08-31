//5.	Library Book Management
//Create a class Book with attributes bookId, title, author, and isIssued.
//Use a constructor to initialize values. 
//Write methods to issue a book, return a book, 
//		and display available books.

package practice;
import java.util.*;


public class Library {
	
	int book [] = new int[10];
	Scanner sc = new Scanner (System.in);
	
	public void availableBook() {
        books(new Book(101, "DAC", "Snathan", 5, false));
        books.add(new Book(102, "DBDA", "Snathan2", 1, false));
        books.add(new Book(103, "DITS", "Snathan3", 0, false));
    }
	
	public void addBook() {
		
		
		
		
	}
}
