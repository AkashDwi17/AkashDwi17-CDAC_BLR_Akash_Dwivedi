package Sept3;
import java.util.*;

class Employee{
	String name;
	int basicSalry;
	
	public Employee (String n, int b) {
		this.name = n;
		this.basicSalry = b;
	}
	
	public int calSal () {
		return basicSalry;
	}
}

class Manager extends Employee{
	
	public Manager (String n, int b) {
		super (n, b);
	}
	
	@Override
	public int calSal () {
		System.out.print("20 %: ");
		return  20 + basicSalry;
	}
}

class SoftEng extends Employee {
	public SoftEng (String n, int b) {
		super (n,b);
	}
	@Override
	public int calSal () {
		System.out.print("40 %: ");
		return  40 + basicSalry;
	}
}
public class EmployeeSalSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Name: ");
		String n = sc.next();
		System.out.print("Enter Basic Salry: ");
		int b = sc.nextInt();
		Employee m = new Manager( n, b);
		
		Employee e = new SoftEng(n, b);
		System.out.println("Manager Salry: "+ m.calSal ());
		
		System.out.print("Software Engineer Salry: " + e.calSal());
	}
}
