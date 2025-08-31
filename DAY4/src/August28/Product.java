//4.	Product Billing System (Array of Objects)
//Create a class Product with attributes productId, 
//productName, price, and quantity. 
//Store multiple product objects in an array. 
//Write a method to calculate the total bill amount for all products.


package August28;
import java.util.*;

public class Product {
	int productId;
	String productName;
	int price;
	int quantity;
	
	public Product (int productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int calBill () {
		return price * quantity;
	}
	
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        // Input for each product
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");

            System.out.print("Product Id: ");
            int productId = sc.nextInt();

            System.out.print("Product Name: ");
            String productName = sc.next();

            System.out.print("Price: ");
            int price = sc.nextInt();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(productId, productName, price, quantity);
        }

        // Calculate total bill
        int totalBill = 0;
        System.out.println("\n--- Bill Details ---");
        for (int i = 0; i < products.length; i++) {
            int productBill = products[i].calBill();
            System.out.println(products[i].productName + " (" + products[i].quantity + " x " + products[i].price + ") = " + productBill);
            totalBill += productBill;
        }


        System.out.println("\nTotal Bill Amount = " + totalBill);

        sc.close();
    }
}