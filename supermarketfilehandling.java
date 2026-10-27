
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class supermarketfilehandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, item, quantity;
        double price, total = 0;
        String productName = "";
        String bill = "";

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
                            productName = "Apple";
                            break;

                        case 2:
                            price = 50;
                            productName = "Banana";
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

                    bill += productName + " x " + quantity
                            + " = Rs." + (price * quantity) + "\n";

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
                            productName = "Biscuit";
                            break;

                        case 2:
                            price = 30;
                            productName = "Chips";
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

                    bill += productName + " x " + quantity
                            + " = Rs." + (price * quantity) + "\n";

                    System.out.println("Snack added successfully!");
                    break;

                case 3:
                    System.out.println("\n===== FINAL BILL =====");
                    System.out.print(bill);
                    System.out.println("Total Amount: Rs." + total);

                    try {
                        FileWriter writer = new FileWriter("bill.txt");

                        writer.write("===== SUPERMARKET BILL =====\n");
                        writer.write(bill);
                        writer.write("Total Amount: Rs." + total + "\n");

                        writer.close();

                        System.out.println("\nBill saved successfully!");

                        System.out.println("\n===== BILL FROM FILE =====");

                        BufferedReader reader = new BufferedReader(
                                new FileReader("bill.txt"));

                        String line;

                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }

                        reader.close();

                    } catch (IOException e) {
                        System.out.println("File error: " + e.getMessage());
                    }

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