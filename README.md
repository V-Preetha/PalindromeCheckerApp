================================
PalindromeCheckerApp
USE CASE 7: Deque-Based Optimized Palindrome Checker
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome using a
Deque (Double Ended Queue) by comparing characters from
both front and rear ends efficiently.

GOAL:
Insert characters into Deque  
Remove first and last elements  
Compare both characters  
Print palindrome validation result

IMPLEMENTATION APPROACH:

Store predefined input string.
Create a Deque object.
Insert each character into the deque.
Remove characters using removeFirst().
Remove characters using removeLast().
Compare both characters simultaneously.
Stop execution if mismatch occurs.
Display final palindrome result.

FLOW OF EXECUTION:

Program starts → Input string stored → Deque created →
Characters inserted → Front and rear elements removed →
Characters compared → Boolean result determined →
Output displayed → Program exits

KEY CONCEPTS USED:

Deque (java.util.Deque / ArrayDeque)
Linear data structure allowing insertion and deletion
from both ends.

removeFirst() Operation
Retrieves element from the front.

removeLast() Operation
Retrieves element from the rear.

Bidirectional Traversal
Enables optimized front-to-back comparison.

Optimized Palindrome Logic
Eliminates need for separate Stack or Queue structures.

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)

COMPILATION & EXECUTION:

javac UseCase7PalindromeCheckerApp.java
java UseCase7PalindromeCheckerApp

VERSION:
UC7 – Deque-Based Optimized Validation Version 7.0