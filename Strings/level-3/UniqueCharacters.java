import java.util.Scanner;

public class UniqueCharacters {
//method for finding length of string
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
			//handling Exception 
        } catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception Handled");
            return length;
        }
    }
//method for frinding Unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        displayUniqueCharacters(uniqueChars);

        
    }
}
