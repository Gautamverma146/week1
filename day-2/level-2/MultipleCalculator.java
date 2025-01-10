import java.util.Scanner;

public class MultipleCalculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Get the input for the number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Loop backward 
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        
    }
}
