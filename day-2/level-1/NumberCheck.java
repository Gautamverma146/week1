
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Step 1: Get input for the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        // Step 2: Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // Close the scanner
        scanner.close();
    }
}

