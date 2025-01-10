import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        // Get input  number and power
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize result to 1
        int result = 1;

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println("The result of " + number + " raised to the power of " + power + " is: " + result);
        
       
    }
}
