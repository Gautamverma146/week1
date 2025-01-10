import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get the input for the number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Loop to find factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

       
    }
}
