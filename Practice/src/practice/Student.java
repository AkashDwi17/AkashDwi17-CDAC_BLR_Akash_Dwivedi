//3.	Student Result Calculation (Array of Objects)
//Create a class Student with attributes rollNo, name, 
//and marks in 3 subjects. Use a constructor to initialize values. 
//Store multiple student objects in an array and 
//calculate average marks and grade for each student.


package practice;
import java.util.*;


public class Student {
	int rollNum;
	String name;
	int marks[];
	
	public Student (int rollNum, String name, int marks[]) {
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}
	
	public int calAvg () {
		int sum = 0;
		for (int i=0; i<marks.length; i++) {
			sum += marks[i];
		}
		int ans = sum / marks.length;
		//System.out.print("Total Avg: " + ans);
		return ans;
	}
	
	public void calGrade () {
//		Scanner sc = new Scanner (System.in);
//		System.out.print("Enter Your Marks: ");
//		int score = sc.nextInt();
		
		int score = calAvg ();
		System.out.println("AVERAGE MARKS: "+score);
		
		if (score >= 90) {
			System.out.println ("Grade A");
		}
		else if (score >=70 && score <= 89) {
			System.out.println ("Grade B");
		}
		else if (score >=40 && score <= 69) {
			System.out.println ("Grade C");
		}else {
			System.out.println("Failed");
		}
		
	}
	
	public void displayInfo () {
		System.out.println(rollNum);
		System.out.println(name);
		
		for (int i=0; i<marks.length; i++) {
			System.out.println("Marks: " + marks[i]);
		}
	}
	
	
	// Main
	
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number Of Student");
		int n = sc.nextInt();
		Student [] s = new Student[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Roll Num: ");
			int rollNum =sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			int marks[] = new int [3];
			System.out.print("Marks: ");
			for (int j=0; j<3; j++) {
				marks[j] = sc.nextInt();
			}
			s[i] = new Student(rollNum, name, marks);
		}
		
		for (int i = 0; i < s.length; i++) {
		    s[i].displayInfo();   
		    s[i].calAvg();        
		    s[i].calGrade();     
		}

		
	}
}
