import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // Convert to lowercase using ASCII values
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
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

        // Check each character
        for (int i = 0; i < length; i++) {
            String type = checkCharacterType(str.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        int[] result = countVowelsAndConsonants(userInput);

        System.out.println("\nNumber of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        
    }
}
