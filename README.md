============================================================
PalindromeCheckerApp
USE CASE 9: Recursive Palindrome Checker
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome using
recursion by comparing characters from outer positions
moving toward the center.

GOAL:
Compare first and last characters recursively  
Move indices inward using recursive calls  
Terminate using base condition  
Print palindrome validation result

IMPLEMENTATION APPROACH:

Store predefined input string.
Call recursive method with start and end indices.
Compare characters at both ends.
Return false immediately if mismatch occurs.
Continue recursive comparison inward.
Stop recursion when indices meet or cross.
Display final palindrome result.

FLOW OF EXECUTION:

Program starts → Input string stored →
Recursive method invoked →
Outer characters compared →
Recursive calls move inward →
Base condition reached →
Boolean result determined →
Output displayed → Program exits

KEY CONCEPTS USED:

Recursion
Method calls itself to solve smaller subproblems.

Base Condition
Stops recursion to prevent infinite execution.

Call Stack
Stores recursive function calls automatically.

Divide and Conquer Logic
Breaks palindrome validation into smaller comparisons.

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n) (recursive call stack)

COMPILATION & EXECUTION:

javac UseCase9PalindromeCheckerApp.java
java UseCase9PalindromeCheckerApp

VERSION:
UC9 – Recursive Validation Version 9.0