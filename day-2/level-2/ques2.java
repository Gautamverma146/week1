import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
//if condition for leap year checking
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year " + year + " IS a Leap Year.");
        } else {
            System.out.println("The year " + year + " is NOT a Leap Year.");
        }

        
    }
}
