/**
 * ============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Demonstrates dynamic selection of palindrome
 * validation algorithms using Strategy Design Pattern.
 */


/*============================================================
    INTERFACE - PalindromeStrategy
============================================================*/
interface PalindromeStrategy {

    boolean check(String input);
}


/*============================================================
    CLASS - StackStrategy
============================================================*/
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack
     */
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/*============================================================
    CONTEXT CLASS
============================================================*/
class PalindromeContext {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}


/*============================================================
    APPLICATION CLASS
============================================================*/
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Create context
        PalindromeContext context = new PalindromeContext();

        // Inject Stack strategy dynamically
        context.setStrategy(new StackStrategy());

        boolean result = context.execute(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}