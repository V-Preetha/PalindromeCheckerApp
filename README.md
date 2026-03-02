============================================================
PalindromeCheckerApp
USE CASE 8: Linked List Based Palindrome Checker
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome using a
LinkedList data structure by comparing elements from both ends.

GOAL:
Insert characters into LinkedList  
Remove first and last elements  
Compare both characters  
Print palindrome validation result

IMPLEMENTATION APPROACH:

Store predefined input string.
Create a LinkedList object.
Insert each character into the list.
Remove characters using removeFirst().
Remove characters using removeLast().
Compare both characters simultaneously.
Stop execution if mismatch occurs.
Display final palindrome result.

FLOW OF EXECUTION:

Program starts → Input string stored → LinkedList created →
Characters inserted → First and last elements removed →
Characters compared → Boolean result determined →
Output displayed → Program exits

KEY CONCEPTS USED:

LinkedList (java.util.LinkedList)
Dynamic linear data structure supporting efficient
insertion and deletion operations.

removeFirst() Operation
Retrieves element from the beginning of the list.

removeLast() Operation
Retrieves element from the end of the list.

Bidirectional Comparison
Allows symmetric palindrome validation.

Data Structure Utilization
Demonstrates double-ended operations using LinkedList.

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)

COMPILATION & EXECUTION:

javac UseCase8PalindromeCheckerApp.java
java UseCase8PalindromeCheckerApp

VERSION:
UC8 – LinkedList-Based Validation Version 8.0
