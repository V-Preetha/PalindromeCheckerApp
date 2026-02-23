/**
 * ==========================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome by pushing characters
 * into a stack and popping them to compare in reverse order.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops characters in reverse order
 * - Compares with original string
 * - Displays the validation result
 *
 * This demonstrates LIFO-based reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";   // Hardcoded string

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}