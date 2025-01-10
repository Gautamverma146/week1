
import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Take salary input from the user
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        // Step 3: Take years of service input from the user
        System.out.print("Enter employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Step 4: Check if years of service is more than 5 years
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = 0.05 * salary;
            System.out.println("The employee is eligible for a bonus of: ₹" + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        
    }
}

