import java.util.Scanner;

public class StringCharacterComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] characterWithoutToArray(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);  
        }
        return charArray;
    }

    // Method to compare two character arrays and return a boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;  
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string: ");
        String text = scanner.next();

        // Calling the user-defined method to get characters
        char[] customCharArray = characterWithoutToArray(text);

        // Calling the built-in toCharArray() method
        char[] builtInCharArray = text.toCharArray();

        // Comparing the two arrays using the compareCharArrays method
        boolean areArraysEqual = compareCharArrays(customCharArray, builtInCharArray);

        // Displaying the result
        System.out.println("Characters from user-defined method: ");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Characters from built-in toCharArray() method: ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Are both character arrays equal? " + areArraysEqual);
    }
}
