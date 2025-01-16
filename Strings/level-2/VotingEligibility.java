import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for 'n' students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;  // Generates age between 10 and 99
        }

        return ages;
    }

    // Method to check if each student can vote and return results in a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s%-15s\n", "Age", "Voting Status");
        System.out.println("-----------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random ages for students
        int[] studentAges = generateRandomAges(n);

        // Check voting eligibility
        String[][] eligibilityResult = checkVotingEligibility(studentAges);

        // Display the results
        System.out.println("\nVoting Eligibility of Students:");
        displayResults(eligibilityResult);

        
    }
}
