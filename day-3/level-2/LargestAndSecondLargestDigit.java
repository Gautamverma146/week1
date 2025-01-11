import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      // Take user input
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();

       if (number <= 0) {
          System.out.println("Invalid input! Please enter a positive number.");
            return;
        }

        //  Initialize array 
        int maxDigit = 10;               
        int[] digits = new int[maxDigit];
        int index = 0;

        
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Only first 10 digits are store");
                break;
            }
            digits[index] = number % 10; 
            number /= 10;                 
            index++;
        }

        // Find the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //  Display results
        System.out.print("Digits stored in the array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found.");
        }

        
    }
}
