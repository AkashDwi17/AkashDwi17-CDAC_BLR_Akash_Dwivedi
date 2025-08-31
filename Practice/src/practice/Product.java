//4.	Product Billing System (Array of Objects)
//Create a class Product with attributes productId, 
//productName, price, and quantity. 
//Store multiple product objects in an array. 
//Write a method to calculate the total bill amount for all products.

package practice;
import java.util.*;

public class Product {
	int productId;
	String productName;
	int price;
	int quantity;
	
	public Product (int productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName  = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public int calBill () {
		return price * quantity;
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		Product[]p = new Product[4];
		
		for (int i=0; i<p.length; i++) {
			System.out.println("Product Id: ");
			int productId = sc.nextInt();
			
			System.out.println("Product Name: ");
			String productName = sc.next();
			
			System.out.println("Product Price: ");
			int price = sc.nextInt();
			
			System.out.println("Product quantity: ");
			int quantity = sc.nextInt(); 
			
			p[i] = new Product (productId, productName, price, quantity);
		}
		int totalBill = 0;
		for (int i=0; i<p.length; i++) {
			totalBill += p[i].calBill();
		}
		System.out.println ("Total Bill: " + totalBill);
	}
}
