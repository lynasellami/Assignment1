import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner mykey = new Scanner(System.in);

        // Prompt the user to enter a 4-digit Octal number
        System.out.print("Please enter a 4-digits Octal number:");
        String myOctalnum = mykey.nextLine();
        mykey.nextLine();

        // Extract each digit as a character from the string
        char firstValue = myOctalnum.charAt(0);
        char secondValue = myOctalnum.charAt(1);
        char thirdValue = myOctalnum.charAt(2);
        char fourthValue = myOctalnum.charAt(3);

        // Convert each character to an integer
        int integerOfFirstValue = (int)firstValue - (int)'0';
        int integerOfSecondValue = (int)secondValue - (int)'0';
        int integerOfThirdValue = (int)thirdValue - (int)'0';
        int integerOfFourthValue = (int)fourthValue - (int)'0';

        // Calculate the decimal value of the octal number
        int decimalNumber = integerOfFirstValue * (int)Math.pow(8, 3) +
                integerOfSecondValue * (int)Math.pow(8, 2) +
                integerOfThirdValue * (int)Math.pow(8, 1) +
                integerOfFourthValue * (int)Math.pow(8, 0);

        // Display the results
        System.out.printf("%-15s : %s%n", "Octal Number", myOctalnum);
        System.out.printf("%-15s : %d%n", "Decimal Number", decimalNumber);
    }
}