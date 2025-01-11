import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_EMPLOYEES = 10;

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[NUM_EMPLOYEES];
        int[] yearsOfService = new int[NUM_EMPLOYEES];
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];

        // Variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Step 1: Input salary and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Input salary with validation
            System.out.print("Enter salary: ");
            double empSalary = scanner.nextDouble();
            if (empSalary <= 0) {
                System.out.println("Invalid salary! Please enter a positive number.");
                i--;  // Re-enter the data for the current employee
                continue;
            }

            // Input years of service with validation
            System.out.print("Enter years of service: ");
            int serviceYears = scanner.nextInt();
            if (serviceYears < 0) {
                System.out.println("Invalid years of service! Please enter a non-negative number.");
                i--;  // Re-enter the data for the current employee
                continue;
            }

            salary[i] = empSalary;
            yearsOfService[i] = serviceYears;
        }

        // Step 2: Calculate bonus and new salary
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Display each employee's old salary, bonus, and new salary
        System.out.println("\n--- Employee Salary and Bonus Details ---");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d:\n", i + 1);
            System.out.printf("Old Salary: %.2f\n", salary[i]);
            System.out.printf("Bonus: %.2f\n", bonus[i]);
            System.out.printf("New Salary: %.2f\n\n", newSalary[i]);
        }

        // Step 4: Display total bonus payout, total old salary, and total new salary
        System.out.println("--- Company Summary ---");
        System.out.printf("Total Old Salary of all employees: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary of all employees: %.2f\n", totalNewSalary);

        scanner.close();
    }
}
