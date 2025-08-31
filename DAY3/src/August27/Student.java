package August27;

import java.util.*;

public class Student {
    int rollNum;
    String name;
    String cName;
    String sub;
    int marks;

    // Accept Details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your roll no: ");
        rollNum = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your college name: ");
        cName = sc.nextLine();

        System.out.print("Enter your subject: ");
        sub = sc.nextLine();

        System.out.print("Enter your marks: ");
        marks = sc.nextInt();
    }

    // Display Student Info
    public void displayStudentInfo() {
        System.out.println("Roll Number : " + rollNum);
        System.out.println("Name        : " + name);
        System.out.println("College     : " + cName);
        System.out.println("Subject     : " + sub);
        System.out.println("Marks       : " + marks);
    }

    // Find Result
    public void findResult() {
        if (marks >= 40) {
            System.out.println("Result      : Pass ");
        } else {
            System.out.println("Result      : Fail ");
        }
    }
}

