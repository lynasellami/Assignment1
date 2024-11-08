import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Create new scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter first name and last name
        System.out.print("Please enter your first name: ");
        String firstName = input.next();
        System.out.print("Please enter your last name: ");
        String lastName = input.next();

        // Prompt the user to enter age
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // To consume the leftover newline

        // Prompt the user to enter gender
        System.out.print("Please enter your gender: ");
        String gender = input.nextLine();

        // Prompt the user to enter department
        System.out.print("Please enter your department: ");
        String department = input.nextLine();

        // Prompt the user to enter the value of PI
        System.out.print("Please enter the value of PI: ");
        double pi = input.nextDouble(); input.nextLine();
        input.nextLine();

        // Display the results
        System.out.printf("%-12s: %s %s%n", "Name", firstName, lastName);
        System.out.printf("%-12s: %d%n", "Age", age);
        System.out.printf("%-12s: %s%n", "Gender", gender);
        System.out.printf("%-12s: %s%n", "Department", department);
        System.out.printf("%-12s: %.2f%n", "PI", pi);
    }
}