============================================================
PalindromeCheckerApp
USE CASE 12: Strategy Pattern for Palindrome Algorithms
============================================================

OBJECTIVE:
To validate a palindrome using dynamically selectable
algorithms implemented through the Strategy Design Pattern.

GOAL:
Define PalindromeStrategy interface  
Implement Stack-based strategy  
Inject algorithm at runtime  
Execute selected palindrome validation

IMPLEMENTATION APPROACH:

Create PalindromeStrategy interface.
Implement StackStrategy class.
Create Context class to hold strategy.
Inject strategy dynamically at runtime.
Execute palindrome validation through context.

FLOW OF EXECUTION:

Program starts → Input string stored →
Strategy object created →
Strategy injected into context →
Selected algorithm executed →
Boolean result returned →
Output displayed → Program exits

KEY CONCEPTS USED:

Interface
Defines contract for interchangeable algorithms.

Polymorphism
Different strategies share common behavior.

Strategy Pattern
Allows runtime algorithm selection.

Encapsulation
Algorithm logic separated into independent classes.

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)

COMPILATION & EXECUTION:

javac UseCase12PalindromeCheckerApp.java
java UseCase12PalindromeCheckerApp

VERSION:
UC12 – Strategy Pattern Validation Version 12.0