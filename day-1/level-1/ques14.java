import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
		double feetToYards = distanceInFeet / 3;
		 double feetToMiles = distanceInFeet / (1760 * 3);
		  System.out.println("The distance in yards is: " + feetToYards);
        System.out.println("The distance in miles is: " + feetToMiles);
		}
		}
		