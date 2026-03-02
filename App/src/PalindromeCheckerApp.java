import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Validates palindrome using LinkedList by comparing
 * elements from both ends.
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8
     */
    public static void main(String[] args) {

        // Define input string
        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last  = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}