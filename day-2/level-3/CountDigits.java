import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize the count variable to 0
        int count = 0;

        // Step 3: Use a loop to count the number of digits
        while (number != 0) {
            // Step 4: Remove the last digit by integer division
            number /= 10;

            // Step 5: Increase count by 1 in each iteration
            count++;
        }

        // Step 6: Display the count
        System.out.println("Number of digits: " + count);

        
    }
}
