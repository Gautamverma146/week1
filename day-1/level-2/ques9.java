import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        
        double perimeter = side1 + side2 + side3; // in meters

        
        double targetDistance = 5000; // 5 km in meters

        
        double rounds = targetDistance / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

        
        scanner.close();
    }
}
