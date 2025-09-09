package AkashDac;
import java.util.*;

public class Library {
	ArrayList <Book> list = new ArrayList<>();
	Scanner sc = new Scanner (System.in);
	// Add Book
	
	public void addBook () {
		System.out.print("Enter Book-Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Book-Name: ");
		String name = sc.next();
		
		System.out.print("Enter Book-Price: ");
		float price = sc.nextFloat();
		
		System.out.print("Enter Book-Quantity: ");
		int quantity = sc.nextInt();
		
		Book b = new Book (id, name, price, quantity);
		
		list.add(b);
		System.out.println("Book Added Suscessfully");
	}
	
	public void displayBook () {
		for (Book b : list) {
			b.printBook();
			
		}
	}
	
	// update
	public void updateBook () {
		System.out.print("Enter Book-Id to update book price: ");
		int id = sc.nextInt();
		
		for (Book b : list) {
			if (id == b.id) {
				System.out.println("Enter updated book price: ");
				float price = sc.nextFloat();
				b.price = price;
				System.out.println("Price Updated Suscessfully");
			}
		}
	}
	// Delete
	
	public void deleteBook () {
		System.out.print("Enter Book-Id to delete book: ");
		int id = sc.nextInt();
		sc.hasNextLine();
		for (int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			if (b.id == id) {
				list.remove (b);
				System.out.println("Book Deleted From the System");
			}
		}
	}
}
