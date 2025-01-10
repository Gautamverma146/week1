import java.util.Scanner;

public class SumUntilZeroOrNegativeWhileLoop {
    public static void main(String[] args) {
        // Step 1: Initialize total to 0.0
        double total = 0.0;

        // Step 2: Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Start an infinite loop
        while (true) {
            System.out.print("Enter a positive number (0 or negative number to stop): ");
            double number = scanner.nextDouble();  

            // Step 4: Check if the number is 0 or negative to break the loop
            if (number <= 0) {
			// Exit the loop if the number is 0 or negative
                break;  
            }

            // Step 5: Add the number to the total
            total += number;
        }
		       // Step 6: Display the total sum
        System.out.println("The total sum is: " + total);

        

    }
}
