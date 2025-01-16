import java.util.*;

public class VowelConsonantIdentifier {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);  // Convert to lowercase
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to analyze each character and store its type in a 2D array
    public static String[][] analyzeCharacters(String str) {
        int length = 0;

        // Find string length without using length()
        try {
            for (int i = 0; ; i++) {
                str.charAt(i);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Length found
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterAnalysis(String[][] analysis) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : analysis) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        String[][] analysisResult = analyzeCharacters(userInput);

        System.out.println("\nCharacter Analysis:");
        displayCharacterAnalysis(analysisResult);

        
    }
}
