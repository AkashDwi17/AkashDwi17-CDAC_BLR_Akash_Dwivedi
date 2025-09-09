package AkashDac;
import java.util.*;

public class ProductInventryManagement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		Library lib = new Library();
		
		while (true) {
			System.out.println("1. Add Book");
			System.out.println("2. Display Book");
			System.out.println("3. Update Book");
			System.out.println("4. Delete Book");
			System.out.println("5. Exit");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: lib.addBook(); break;
			case 2: lib.displayBook(); break;
			case 3: lib.updateBook(); break;
			case 4: lib.deleteBook(); break;
			default : System.out.println("Select Valid Options");
			case 5: return;
			
			}
			
		}
	}
	
	
}
