package Inheritance;
import java.util.*;

class Student{
	String name;
	int marks;
	
	public void showDet () {
		System.out.println("Name: " + name + "Marks: " + marks);
	}
}
class GradStd extends Student {
	String spe;
	public GradStd (String spe, String name, int marks) {
		this.spe = spe;
		this.name = name;
		this.marks = marks;
	}
	
	public void checkPass () {
		if (marks >= 50) {
			System.out.println("You Passed !!");
		}else {
			System.out.println("FAILED");
		}
	}
}
public class StudentGradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		GradStd g [] = new GradStd[2];
		
		for (int i=0; i<g.length; i++) {
			g[i] = new GradStd (sc.next(), sc.next(), sc.nextInt());
		}
		for (int i=0; i<g.length; i++) {
			g[i].checkPass();
			g[i].showDet();
		}
	}
}
