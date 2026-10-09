import java.util.Scanner;

public class IT26102487Lab3Q3 {

    public static void main(String[] args) {

        // Declare and Initialize variables
        int amount = 0;

        int count5000 = 0;
        int count1000 = 0;
        int count500 = 0;
        int count200 = 0;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count2 = 0;
        int count1 = 0;

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Input the rupee amount
        System.out.print("Enter the Rupee amount: ");
        amount = input.nextInt();

        // Calculate the number of 5000 rupee notes
        count5000 = amount / 5000;
        amount = amount % 5000;

        // Calculate the number of 1000 rupee notes
        count1000 = amount / 1000;
        amount = amount % 1000;

        // Calculate the number of 500 rupee notes
        count500 = amount / 500;
        amount = amount % 500;

        // Calculate the number of 200 rupee notes
        count200 = amount / 200;
        amount = amount % 200;

        // Calculate the number of 100 rupee notes
        count100 = amount / 100;
        amount = amount % 100;

        // Calculate the number of 50 rupee notes
        count50 = amount / 50;
        amount = amount % 50;

        // Calculate the number of 20 rupee notes
        count20 = amount / 20;
        amount = amount % 20;

        // Calculate the number of 10 rupee coins
        count10 = amount / 10;
        amount = amount % 10;

        // Calculate the number of 5 rupee coins
        count5 = amount / 5;
        amount = amount % 5;

        // Calculate the number of 2 rupee coins
        count2 = amount / 2;
        amount = amount % 2;

        // Calculate the number of 1 rupee coins
        count1 = amount / 1;
        amount = amount % 1;

        // Print the results
        System.out.println();
        System.out.println("5000 Notes - " + count5000);
        System.out.println("1000 Notes - " + count1000);
        System.out.println("500 Notes - " + count500);
        System.out.println("200 Notes - " + count200);
        System.out.println("100 Notes - " + count100);
        System.out.println("50 Notes - " + count50);
        System.out.println("20 Notes - " + count20);
        System.out.println("10 Coins - " + count10);
        System.out.println("05 Coins - " + count5);
        System.out.println("02 Coins - " + count2);
        System.out.println("01 Coins - " + count1);
    }
}