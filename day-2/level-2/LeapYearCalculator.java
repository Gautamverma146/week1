import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);

        
    System.out.print("Enter a year (>= 1582): ");
     int year = scanner.nextInt();

      // Check if the year is valid 
       if (year < 1582) {
         System.out.println("Invalid input! The Gregorian calendar started in 1582.");
      } else {
   
      System.out.println("\n--- Using Multiple if-else Statements ---");
      if (year % 4 != 0) {
            System.out.println("The year " + year + " is NOT a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println("The year " + year + " IS a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println("The year " + year + " IS a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }

          
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " IS a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

       
    }
}
