============================================================
PalindromeCheckerApp
USE CASE 6: Queue + Stack Based Palindrome Checker
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome using both
Queue and Stack data structures demonstrating FIFO and LIFO behavior.

GOAL:
Enqueue characters into Queue  
Push characters into Stack  
Compare dequeue and pop results  
Print palindrome validation result  

IMPLEMENTATION APPROACH:

Store predefined input string.
Create Queue and Stack objects.
Insert each character into both structures.
Remove characters using dequeue (Queue).
Remove characters using pop (Stack).
Compare both outputs simultaneously.
Stop execution if mismatch occurs.
Display final palindrome result.

FLOW OF EXECUTION:

Program starts → Input string stored → Queue & Stack created →
Characters inserted → Queue dequeues from front →
Stack pops from rear → Characters compared →
Boolean result determined → Output displayed → Program exits

KEY CONCEPTS USED:

Queue (java.util.Queue / LinkedList)
Linear data structure following FIFO principle.

Stack (java.util.Stack)
Linear data structure following LIFO principle.

Enqueue & Dequeue Operations
Maintain insertion-order processing.

Push & Pop Operations
Provide reverse-order retrieval.

Symmetric Comparison
Combines FIFO and LIFO behaviors for palindrome validation.

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)

COMPILATION & EXECUTION:

javac PalindromeCheckerApp.java
java PalindromeCheckerApp

VERSION:
UC6 – Queue + Stack Validation Version 6.0
