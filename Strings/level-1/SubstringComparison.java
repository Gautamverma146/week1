import java.util.Scanner;

public class SubstringComparison {

    // Method to Create a substring using charAt()
    public static String createSubstringWithCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    //  Compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //  Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the string: ");
        String text = sc.next();

        System.out.println("Enter the start index: ");
        int start = sc.nextInt();

        System.out.println("Enter the end index: ");
        int end = sc.nextInt();

        
        String substringUsingCharAt = createSubstringWithCharAt(text, start, end);

        // Using built-in substring() method
        String substringUsingBuiltIn = text.substring(start, end);

        // Comparing both substrings using Method 2
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Displaying results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in method: " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
