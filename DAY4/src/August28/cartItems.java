//6.	Online Shopping Cart (Business Logic Example)
//Create a class CartItem with attributes itemId, itemName, price, quantity.
//Use constructors for initialization. 
//Create another class ShoppingCart that holds multiple CartItem objects
//and write a method to calculate the final payable amount 
//including discount if total exceeds a limit.




package August28;
import java.util.*;

// ✅ Class to represent a single item in cart
class CartItem {
    int itemId;
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total price for this item
    public double getItemTotal() {
        return price * quantity;
    }
}


