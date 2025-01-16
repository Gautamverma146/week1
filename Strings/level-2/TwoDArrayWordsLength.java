import java.util.Scanner;

public class TwoDArrayWordsLength {

    // Method to find the length of a string without using length()
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

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int index = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[wordCount] = length;

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

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void display2DArray(String[][] array) {
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : array) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            System.out.printf("%-15s%-10d\n", word, length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();

        String[] words = customSplit(userInput);
        String[][] wordsWithLengths = wordsWithLengths(words);

        display2DArray(wordsWithLengths);
        
    }
}
