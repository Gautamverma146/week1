import java.util.Scanner;

public class NumberFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Array to store frequency of digits 
        int[] frequency = new int[10];
        
        // Handling negative input
        number = Math.abs(number);
        
        // Counting frequency of each digit
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        
        
        System.out.println("digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }
        
        
    }
}
