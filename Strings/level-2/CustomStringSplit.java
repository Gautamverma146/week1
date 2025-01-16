import java.util.Scanner;

public class CustomStringSplit {

    // Method to find the length of the string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            for (int i = 0; ; i++) {
                str.charAt(i);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String str) {
        int length = findLength(str);
        int wordCount = 1;

        // Count spaces to determine word count
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store start and end indexes of words
        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int index = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[wordCount] = length;

        // Extract words using indexes
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Display array elements
    public static void displayArray(String[] arr) {
        for (String word : arr) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();

        // Using custom split method
        String[] customSplitResult = customSplit(userInput);

        // Using built-in split() method
        String[] builtInSplitResult = userInput.split(" ");

        // Comparing results
        boolean isEqual = compareArrays(customSplitResult, builtInSplitResult);

        // Display results
        System.out.println("\nWords from custom split method:");
        displayArray(customSplitResult);

        System.out.println("\nWords from built-in split() method:");
        displayArray(builtInSplitResult);

        System.out.println("\nDo both methods produce the same result? " + isEqual);

        
    }
}
