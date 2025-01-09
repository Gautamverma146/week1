import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city via which you will travel: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();

        
        double distance1 = 156.6; 
        int time1Hours = 4;       
        int time1Minutes = 4;     

        double distance2 = 211.8; 
        int time2Hours = 4;       
        int time2Minutes = 25;   

        
        double totalDistance = distance1 + distance2;

        
        int totalHours = time1Hours + time2Hours;
        int totalMinutes = time1Minutes + time2Minutes;

        
        if (totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes = totalMinutes % 60;
        }

        // Display the result
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Time: " + totalHours + " hours " + totalMinutes + " minutes");

        // Close the scanner
        scanner.close();
    }
}
