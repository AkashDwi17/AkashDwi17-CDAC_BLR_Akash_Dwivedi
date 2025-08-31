package August28;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.availableBook();   // Add books initially

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: lib.displayBook();  break;
                case 2: lib.issueBook();   break;
                case 3: lib.returnBook(); break;
                case 4: System.out.println("Exiting... Thank you!"); break;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}




