import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Loop 
        for (int i = number - 1; i >= 1; i--) {
            // Check if 'i' is a factor of the number
            if (number % i == 0) {
                greatestFactor = i;  
                break;               
            }
        }

        // Output: 
        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        scanner.close();
    }
}
