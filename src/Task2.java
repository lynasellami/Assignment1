import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // Create a new scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the original price of the item
        System.out.print("Please enter the item price: ");
        double originalPrice = input.nextDouble();

        // Prompt the user to enter the discount ratio
        System.out.print("Please enter the discount ratio (5 for 5%%): ");
        double discountRatio = input.nextDouble(); input.nextLine();
        input.nextLine();

        // Calculate the discounted price
        double discountAmount = (discountRatio / 100) * originalPrice;
        double priceBeforeTax = originalPrice - discountAmount;

        // Calculate federal tax (5%) and provincial tax (9.975%)
        double federalTax = (5.0 / 100) * priceBeforeTax;
        double provincialTax = (9.975 / 100) * priceBeforeTax;

        // Calculate the final price
        double finalPrice = priceBeforeTax + federalTax + provincialTax;

        // Display the results
        System.out.printf("%-18s: %.2f%n", "Original Price", originalPrice);
        System.out.printf("%-18s: %.2f%%%n", "Discount Ratio", discountRatio);
        System.out.printf("%-18s: %.2f%n", "Price Before Tax", priceBeforeTax);

        System.out.println("------------------------------");

        System.out.printf("%-18s: %.2f%n", "Federal Tax", federalTax);
        System.out.printf("%-18s: %.2f%n", "Provincial Tax", provincialTax);
        System.out.printf("%-18s: %.2f%n", "Final Price", finalPrice);
    }
}