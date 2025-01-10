import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking input for the heights of 11 players
        System.out.println("Enter the heights (in cm) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Adding each height to the sum
        }

        // Calculating the mean height
        double meanHeight = sum / heights.length;

        // Displaying the mean height
        System.out.printf("The mean height of the football team is: %.2f cm\n", meanHeight);

        
    }
}
