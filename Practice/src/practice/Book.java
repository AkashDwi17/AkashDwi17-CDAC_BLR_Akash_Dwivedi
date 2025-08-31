//5.	Library Book Management
//Create a class Book with attributes bookId, title, author, and isIssued.
//Use a constructor to initialize values. 
//Write methods to issue a book, return a book, 
//		and display available books.


package practice;

public class Book {
	int bookId; 
	String title; 
	String author; 
	boolean isIssued;
	
	public Book (int bookId, String title, String author, boolean isIssued) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}
}
