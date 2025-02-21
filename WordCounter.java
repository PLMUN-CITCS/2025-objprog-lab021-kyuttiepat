import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line as a sentence
    }

    // Method to count the number of words in the given sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if the sentence is empty or null
        }
        // Split sentence by spaces using regex to handle multiple spaces
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Main method to run the program
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get user input
        int wordCount = countWords(sentence); // Count the words
        System.out.println("The sentence has " + wordCount + " words."); // Display result
    }
}