/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Compares execution time of different
 * palindrome validation approaches.
 */

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama"
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        System.out.println("Input : " + input);
        System.out.println("\n--- Performance Comparison ---");

        // Stack Method
        long start = System.nanoTime();
        boolean stackResult = stackCheck(input);
        long end = System.nanoTime();
        System.out.println("Stack Method      : "
                + stackResult + " | Time = "
                + (end - start) + " ns");

        // Deque Method
        start = System.nanoTime();
        boolean dequeResult = dequeCheck(input);
        end = System.nanoTime();
        System.out.println("Deque Method      : "
                + dequeResult + " | Time = "
                + (end - start) + " ns");

        // Direct Comparison Method
        start = System.nanoTime();
        boolean directResult = directCheck(input);
        end = System.nanoTime();
        System.out.println("Direct Comparison : "
                + directResult + " | Time = "
                + (end - start) + " ns");
    }


    /*==========================================================
        STACK APPROACH
    ==========================================================*/
    public static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }


    /*==========================================================
        DEQUE APPROACH
    ==========================================================*/
    public static boolean dequeCheck(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst()
                    .equals(deque.removeLast()))
                return false;
        }
        return true;
    }


    /*==========================================================
        DIRECT TWO-POINTER APPROACH
    ==========================================================*/
    public static boolean directCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start)
                    != input.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}