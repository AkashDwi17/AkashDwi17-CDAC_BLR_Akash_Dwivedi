package Inheritance;
import java.util.*;
class Employee{
	String name;
	int salary;
	
	public void displayDet() {
		System.out.println("name of emp is :"+ name +" salary is: "+ salary );
	}
}

class Manager extends Employee{
	 int teamSize;
	
	public Manager(String n,int s,int t) {
		this.name = n;
		this.salary = s;
		this.teamSize = t;
	}
	
	public int calBonus() {
		int bonus = teamSize*10;
		return bonus;
	}
}
public class EmployeeManagement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Manager[] m = new Manager[2];
	for(int i=0;i<m.length;i++) {
		m[i] = new Manager(sc.next(),sc.nextInt(),sc.nextInt());
	}
	
	for(int i=0;i<m.length;i++) {
		m[i].displayDet();
		System.out.println("congrats!! u got bonus of :"+m[i].calBonus());
	}
}
}
