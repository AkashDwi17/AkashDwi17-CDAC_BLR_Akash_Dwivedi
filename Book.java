package AkashDac;

public class Book {
	int id;
	String name;
	float price;
	int quantity;
	
	public Book (int id, String name, float price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void printBook () {
		System.out.println("Id: " + id + " " + "Name: " + name + " " + "Price: " + price + " " + "Quantity: " + quantity);
	}
}
