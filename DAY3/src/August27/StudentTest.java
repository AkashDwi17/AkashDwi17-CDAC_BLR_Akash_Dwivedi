package August27;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];  // create array of 5 students

        // Input details for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            students[i] = new Student();   // works fine without explicit constructor
            students[i].acceptDetails();
        }
        
        // Display details & result
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n--- Student " + (i + 1) + " Information ---");
            students[i].displayStudentInfo();
            students[i].findResult();
        }
    }
}

