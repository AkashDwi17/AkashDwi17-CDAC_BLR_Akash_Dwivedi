package Inheritance;

import java.util.*;

class Vehicle{
	String brand;
	int fuel;
	
	public int refuel (int lit) {
		return (fuel + lit);
	}
}

class Car extends Vehicle{
	int milage;
	public Car (int milage, String brand, int fuel) {
		this.milage = milage;
		this.brand = brand;
		this.fuel = fuel;
	}
	public int calTraDist() {
		return fuel * milage;
	}
	
}

public class VehicleSys {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Car c [] = new Car[2];
		
		for (int i=0; i<c.length; i++) {
			c [i] = new Car(sc.nextInt(), sc.next(), sc.nextInt());
		}
		for (int i=0; i<c.length; i++) {
			System.out.println("Enter Fuel in L: ");
			int lit = sc.nextInt ();
			
			System.out.println (c[i].refuel(lit));
			
			System.out.println("Cal Travel Dist");
			System.out.println(c[i].calTraDist());
		}
	}
}
