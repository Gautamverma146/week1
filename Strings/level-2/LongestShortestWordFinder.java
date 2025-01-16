import java.util.Scanner;

public class LongestShortestWordFinder {

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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordArray) {
        String shortest = wordArray[0][0];
        String longest = wordArray[0][0];
        int minLength = Integer.parseInt(wordArray[0][1]);
        int maxLength = Integer.parseInt(wordArray[0][1]);

        for (int i = 1; i < wordArray.length; i++) {
            int currentLength = Integer.parseInt(wordArray[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                shortest = wordArray[i][0];
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longest = wordArray[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();

        String[] words = customSplit(userInput);
        String[][] wordsWithLengths = wordsWithLengths(words);
        String[] result = findShortestAndLongest(wordsWithLengths);

        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        
    }
}
