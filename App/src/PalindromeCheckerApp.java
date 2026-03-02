/**
 * ============================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Demonstrates palindrome validation using
 * encapsulation and object-oriented principles.
 */

/*------------------------------------------------------------
   Palindrome Service Class
------------------------------------------------------------*/
class PalindromeChecker {

    /**
     * Checks whether given string is palindrome
     * @param input String to validate
     * @return true if palindrome
     */
    public boolean checkPalindrome(String input) {

        // Normalize input
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters
        while (start < end) {

            if (normalized.charAt(start)
                    != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


/*------------------------------------------------------------
   Application Class
------------------------------------------------------------*/
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11
     */
    public static void main(String[] args) {

        String input = "Racecar";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Invoke service method
        boolean result = checker.checkPalindrome(input);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}