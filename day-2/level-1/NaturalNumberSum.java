import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Check if the number is a positive integer (natural number)
        if (number > 0) {
            // Step 3: Calculate the sum of the first 'n' natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the scanner
        scanner.close();
    }
}

