package LMS;
import java.util.*;

public class Choice {
	Scanner sc = new Scanner (System.in);
	
	
	Library lib = new Library();
	
	public void runMenu () {
		System.out.println ("");
		
		int choice = 0;
		while (choice != 6) {
		    System.out.println("\n------------ What do you want --------");
		    System.out.println("1. Available Book");
		    System.out.println("2. Add a Book");
		    System.out.println("3. Issue a Book");
		    System.out.println("4. Return a Book");
		    System.out.println("5. Display Books");
		    
		    System.out.println("6. Exit");
		    System.out.print("Enter Your Choice: ");
		    choice = sc.nextInt();

		    switch (choice) {
		    		case 1: lib.availableBook(); break;
		        case 2: lib.addBook(); break;
		        case 3: lib.issueBook(); break;
		        case 4: lib.returnBook(); break;
		        case 5: lib.displayBook(); break;
		       
		        case 6: System.out.println("Exit!"); break;
		        
		        default: System.out.println("Invalid Choice!");
		    }
		}

	}
}
