import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Initialize arrays for names, ages, and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Step 2: Take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");

            // Input age
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            if (ages[i] <= 0) {
                System.out.println("Invalid age! Please enter a positive value.");
                i--;
                continue;
            }

            // Input height
            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble();
            if (heights[i] <= 0) {
                System.out.println("Invalid height! Please enter a positive value.");
                i--;
            }
        }

        //  Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // S Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

       
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        
    }
}
