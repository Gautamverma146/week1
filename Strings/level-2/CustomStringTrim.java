import java.util.Scanner;

public class CustomStringTrim {

    // Method to find the start and end indices after trimming leading and trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0, end = 0, length = 0;

        // Find string length without using length()
        try {
            for (int i = 0; ; i++) {
                str.charAt(i);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Length determined
        }

        // Find the first non-space character
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        // Find the last non-space character
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean customCompare(String str1, String str2) {
        int len1 = 0, len2 = 0;

        // Find the lengths of both strings
        try {
            for (int i = 0; ; i++) {
                str1.charAt(i);
                len1++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        try {
            for (int i = 0; ; i++) {
                str2.charAt(i);
                len2++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        // If lengths are different, strings are not equal
        if (len1 != len2) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = sc.nextLine();

        // Find the start and end indices for trimming
        int[] trimIndices = findTrimIndices(userInput);

        // Custom trimming using charAt()
        String customTrimmed = customSubstring(userInput, trimIndices[0], trimIndices[1]);

        // Built-in trim method
        String builtInTrimmed = userInput.trim();

        // Compare custom trimmed string with built-in trimmed string
        boolean isEqual = customCompare(customTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nCustom Trimmed String: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");
        System.out.println("Are both strings equal? " + isEqual);

        
    }
}
