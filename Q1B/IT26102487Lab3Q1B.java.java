import java.util.Scanner;

public class IT26102487Lab3Q1B {

    public static void main(String[] args) {

        // Declare the variables
        double pricePerKg, quantity, totalAmount, discountAmount, finalAmount;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the price per kilogram of rice
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        // Calculate the total amount
        totalAmount = pricePerKg * quantity;
		
		// Calculate the 10% discount
        discountAmount = totalAmount * 0.10;
		
		// Calculate the final amount after discount
        finalAmount = totalAmount - discountAmount;

        // Display the final amount
        System.out.println();
        System.out.println("The total amount with 10% discount is: " + finalAmount);
    }
}