import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Step 1: Initialize total to 0.0
        double total = 0.0;

        // Step 2: Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Variable to store the user input
        double number;

        // Step 4: Use a while loop to keep asking for input until 0 is entered
        do {
            System.out.print("Enter a number (0 to stop): ");
			// Get user input
            number = scanner.nextDouble();  

            // Step 5: Add the number to the total if it's not 0
            if (number != 0) {
                total += number;
            }

        } while (number != 0);  

        // Step 6: Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}
