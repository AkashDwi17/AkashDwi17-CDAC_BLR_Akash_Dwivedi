//5.	Library Book Management
//Create a class Book with attributes bookId, title, author, and isIssued. 
//Use a constructor to initialize values. 
//Write methods to issue a book, return a book, and display available books.

		
package LMS;

public class Book {
	int bookId; 
	String title; 
	String author; 
	int count = 0;
	boolean isIssued;
	
	public Book (int bookId, String title, String author, int count, boolean isIssued) {
		this.bookId = bookId; 
		this.title = title; 
		this.author = author; 
		this.count = count;
		this.isIssued = isIssued;
	}
}
