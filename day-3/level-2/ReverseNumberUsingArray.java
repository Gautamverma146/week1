import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        //  Count the number of digits 
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        //  Store digits in an array
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10; 
            tempNumber /= 10;            
        }

        //  Display the digits in reverse order
        System.out.print("Number Reversed : ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        
    }
}
