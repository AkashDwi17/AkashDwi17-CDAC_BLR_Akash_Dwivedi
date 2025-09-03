package VehicleSpeedCalculation;
import java.util.*;

class Vehicle{
	String brand;
	int maxSpeed;
	
	public Vehicle (String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	public void showTopSpeed () {
		System.out.println("Max Speed: " + maxSpeed);
	}
	
}

class Car extends Vehicle{
	public Car (String brand, int maxSpeed) {
		super (brand, maxSpeed);
	}
	@Override
	public void showTopSpeed () {
		System.out.println("Car: " + brand + "  " + maxSpeed);
	}
}

class Bike extends Vehicle{
	public Bike (String brand, int maxSpeed) {
		super (brand, maxSpeed);
	}
	@Override 
	public void showTopSpeed () {
		System.out.println("Bike: " + brand + "  " + maxSpeed);
	}
}

class Truck extends Vehicle{
	public Truck (String brand, int maxSpeed) {
		super (brand, maxSpeed);
	}
	@Override 
	public void showTopSpeed () {
		System.out.println("Truck: " + brand + "  " + maxSpeed);
	}
}

public class VehicleSpeedCalculation {
	public static void main(String[] args) {
		Vehicle car = new Car ("BMW", 2150);
		Vehicle bike = new Bike ("Yahama", 180);
		Vehicle truck = new Truck ("Volvo", 1230);
		
		car.showTopSpeed();
		bike.showTopSpeed();
		truck.showTopSpeed();
	}
}
