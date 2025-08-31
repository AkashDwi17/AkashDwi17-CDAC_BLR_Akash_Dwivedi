//3.	Student Result Calculation (Array of Objects)
//Create a class Student with attributes rollNo, name, and marks in 3 subjects.
//Use a constructor to initialize values. Store multiple student objects 
//in an array and calculate average marks and grade for each student.


package August28;
import java.util.*;

public class Student {
    int rollNo;
    String name;
    int[] marks;   // marks in 3 subjects

    // Constructor
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length; // average
    }

    // Method to display grade based on average
    public void displayGrade() {
        double avg = calculateAverage();
        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        
//        for (int i = 0; i<marks.length; i++) {
//        	System.out.print(marks[i]);
//        }
        
        
        System.out.println();
        displayGrade();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n]; // array of objects

        // Take input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(rollNo, name, marks);
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (Student s : students) {
            s.displayInfo();
        }
    }
}
