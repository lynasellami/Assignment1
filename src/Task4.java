import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        // Create a new scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the initial balance
        System.out.print("Please enter the initial balance: $");
        double initialBalance = input.nextDouble();

        // Prompt the user to enter the annual interest rate
        System.out.print("Please enter the annual interest rate (2 for 2%%): ");
        double annualInterestRate = input.nextDouble();

        // Prompt the user to enter the number of years
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int years = input.nextInt(); input.nextLine();
        input.nextLine();

        // Calculate the balance after the specified number of years
        double finalBalance = initialBalance * Math.pow(1 + (annualInterestRate / 100), years);

        // Display the results
        System.out.printf("%-22s : %10.2f%n", "Initial Balance", initialBalance);
        System.out.printf("%-22s : %9.2f%%%n", "Annual Interest Rate", annualInterestRate); // Adjusted for alignment
        System.out.printf("%-22s : %10d%n", "Saving Years", years);

        System.out.println("------------------------------");

        System.out.printf("%-22s : %10.2f%n", "Balance After " + years + " Years", finalBalance);
    }
}