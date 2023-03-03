package day08_tasks;

import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String productName = input.nextLine();
        System.out.print("Enter the price: $");
        double price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        double totalCostPrice = price * quantity;
        System.out.println(fullName + "," + " your order for " +
                quantity + " " +productName + "," +
                " has been placed. " + "Your total is $" + totalCostPrice);









    }
}
