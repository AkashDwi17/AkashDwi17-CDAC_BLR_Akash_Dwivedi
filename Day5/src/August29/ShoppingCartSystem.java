package August29;

import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartManager cm = new CartManager();
        int choice;

        do {
            System.out.println("\n===== Shopping Cart Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Get Total Bill");
            System.out.println("6. View Total Products Added");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Product Quantity: ");
                    int qty = sc.nextInt();
                    cm.addProduct(new Product(id, name, price, qty));
                    break;

                case 2:
                    cm.viewCart();
                    break;

                case 3:
                    System.out.print("Enter Product ID to Update: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter New Price (0 to skip): ");
                    double newPrice = sc.nextDouble();
                    System.out.print("Enter New Quantity (-1 to skip): ");
                    int newQty = sc.nextInt();
                    cm.updateProduct(updateId, newPrice, newQty);
                    break;

                case 4:
                    System.out.print("Enter Product ID to Delete: ");
                    int delId = sc.nextInt();
                    cm.deleteProduct(delId);
                    break;

                case 5:
                    cm.getTotalBill();
                    break;

                case 6:
                    System.out.println(" Total Products Added: " + Product.productCount);
                    break;

                case 7:
                    System.out.println(" Exiting... Thank you!");
                    break;

                default:
                    System.out.println(" Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
