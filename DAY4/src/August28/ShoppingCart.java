//6.	Online Shopping Cart (Business Logic Example)
//Create a class CartItem with attributes itemId, itemName, price, quantity.
//Use constructors for initialization. 
//Create another class ShoppingCart that holds multiple CartItem objects
//and write a method to calculate the final payable amount 
//including discount if total exceeds a limit.

package August28;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<CartItem> cartItems = new ArrayList<>();

    // Add item to cart
    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    // Display items
    public void displayCart() {
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : cartItems) {
            System.out.println(item.itemName + " (" + item.quantity + " x " + item.price + ") = " + item.getItemTotal());
        }
    }

    // Calculate final amount with discount logic
    public void finalAmount() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getItemTotal();
        }

        double discount = 0;
        if (total > 5000) {  // Suppose discount applies if total > 5000
            discount = total * 0.10;  // 10% discount
            total -= discount;
        }

        System.out.println("\nFinal Payable Amount: " + total);
        if (discount > 0) {
            System.out.println("Discount Applied: " + discount);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to cart
        cart.addItem(new CartItem(101, "Laptop", 40000, 1));
        cart.addItem(new CartItem(102, "Mouse", 500, 2));
        cart.addItem(new CartItem(103, "Keyboard", 1500, 1));

        cart.displayCart(); // Show items
        cart.finalAmount(); // Show final payable amount
    }
}

