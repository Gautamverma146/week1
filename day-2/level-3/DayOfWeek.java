import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // Ensure there are exactly 3 arguments (month, day, and year)
     

        System.out.println("enter month");
		
		
        int m = scanner.nextInt(); // month
		  System.out.println("enter day");
        int d = scanner.nextInt(); // day
		  System.out.println("enter year");
        int y = scanner.nextInt(); // year

        // Step 2: Apply the given formulas
         y = y - (14 - m) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
         m = m + 12 * ((14 - m) / 12) - 2;
         d = (d  + x + 31 * m / 12) % 7;

        // Step 3: Print the result
        System.out.println(d);
    }
}
