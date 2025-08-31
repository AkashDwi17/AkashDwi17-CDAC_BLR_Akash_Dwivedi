package August28;
import java.util.*;

public class Employee {
	int empId;
	String name;
	int basicSalary; 
	
	public Employee (int empId, String name, int basicSalary) {
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public double calcGrossSal() {
        double hra = 0.20 * basicSalary;  
	    double da = 0.10 * basicSalary;   
        return basicSalary + hra + da;
    }
	
	public void display () {
		System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calcGrossSal());
	}
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int empId = sc.nextInt();
		String name = sc.next();
		int basicSalary = sc.nextInt();
		
		Employee e = new Employee (empId, name, basicSalary);
		
		e.display();
		
		sc.close();
	}
}

