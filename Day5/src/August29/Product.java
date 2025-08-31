package August29;

import java.util.Scanner;

//  Product class
class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Static variable to track total products
    static int productCount = 0;

    // Constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        productCount++;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println(productId + " | " + productName + " | " + price + " | " + quantity);
    }
}

// CartManager class
class CartManager {
    Product[] cart = new Product[10]; // Array of Products
    int size = 0; // To track number of items in cart

    // Add product
    public void addProduct(Product p) {
        if (size < 10) {
            cart[size] = p;
            size++;
            System.out.println(" Product added successfully.");
        } else {
            System.out.println(" Cart is full! Cannot add more than 10 products.");
        }
    }

    // View all products
    public void viewCart() {
        if (size == 0) {
            System.out.println("Cart is empty!");
            return;
        }
        System.out.println("\n--- Cart Items ---");
        System.out.println("ID | Name | Price | Quantity");
        for (int i = 0; i < size; i++) {
            cart[i].displayProduct();
        }
    }

    // Update product using productId
    public void updateProduct(int id, double newPrice, int newQuantity) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (cart[i].productId == id) {
                if (newPrice > 0) cart[i].price = newPrice;
                if (newQuantity >= 0) cart[i].quantity = newQuantity;
                System.out.println(" Product updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println(" Product not found!");
    }

    // Delete product using productId
    public void deleteProduct(int id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (cart[i].productId == id) {
                // Shift left
                for (int j = i; j < size - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[size - 1] = null; // Last element empty
                size--;
                Product.productCount--; // Decrease count
                System.out.println(" Product deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println(" Product not found!");
    }

    // Calculate total bill
    public void getTotalBill() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += cart[i].price * cart[i].quantity;
        }
        System.out.println(" Total Bill = " + total);
    }
}

