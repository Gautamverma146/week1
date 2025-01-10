import java.util.Scanner;

public class StoreAndSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];  
        double total = 0.0;                 
        int index = 0;                      

        System.out.println("Enter up to 10 positive numbers (Enter 0 or a negative number to stop):");

        // Infinite loop to take input until conditions are met
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            // Check for stop conditions: 0 or negative number
            if (input <= 0) {
                System.out.println("Input stopped by user.");
                break;
            }

            // Check if array is full
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total of all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers entered
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display the sum of numbers
        System.out.println("\nSum of entered numbers: " + total);

        
    }
}
