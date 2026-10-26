
import java.util.Scanner;

public class supermarketproject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, item, quantity;
        double price, total = 0;

        do {
            System.out.println("\n===== SUPERMARKET =====");
            System.out.println("1. Fruits");
            System.out.println("2. Snacks");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n1. Apple - Rs.100");
                    System.out.println("2. Banana - Rs.50");
                    System.out.print("Select fruit: ");
                    item = sc.nextInt();

                    switch (item) {
                        case 1:
                            price = 100;
                            break;

                        case 2:
                            price = 50;
                            break;

                        default:
                            System.out.println("Invalid fruit!");
                            continue;
                    }

                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();

                    if (quantity <= 0) {
                        System.out.println("Invalid quantity!");
                        continue;
                    }

                    total = total + price * quantity;
                    System.out.println("Fruit added successfully!");
                    break;

                case 2:
                    System.out.println("\n1. Biscuit - Rs.20");
                    System.out.println("2. Chips - Rs.30");
                    System.out.print("Select snack: ");
                    item = sc.nextInt();

                    switch (item) {
                        case 1:
                            price = 20;
                            break;

                        case 2:
                            price = 30;
                            break;

                        default:
                            System.out.println("Invalid snack!");
                            continue;
                    }

                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();

                    if (quantity <= 0) {
                        System.out.println("Invalid quantity!");
                        continue;
                    }

                    total = total + price * quantity;
                    System.out.println("Snack added successfully!");
                    break;

                case 3:
                    System.out.println("\n===== FINAL BILL =====");
                    System.out.println("Total Amount: Rs." + total);
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
