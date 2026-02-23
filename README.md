============================================================
PalindromeCheckerApp
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome using
a reverse-based transformation approach, while reinforcing
core Java programming fundamentals.

------------------------------------------------------------

USE CASE 3:
Palindrome Check Using String Reverse

GOAL:
Check whether a string is a palindrome by reversing it
and comparing it with the original value.

------------------------------------------------------------

IMPLEMENTATION APPROACH:

- Store a predefined string.
- Iterate from the last character to the first.
- Build a reversed string using concatenation.
- Compare original and reversed strings using equals().
- Display the validation result.

------------------------------------------------------------

FLOW OF EXECUTION:

Program starts
→ Hardcoded string is stored
→ Loop iterates in reverse order
→ Reversed string is constructed
→ Original and reversed strings are compared
→ Result is printed on console
→ Program exits

------------------------------------------------------------

KEY CONCEPTS USED:

1. for Loop  
   Iterates from last index to first index.

2. String Immutability  
   Strings cannot be modified after creation.
   Each concatenation creates a new object.

3. String Concatenation (+)  
   Used to construct reversed string character by character.

4. equals() Method  
   Compares actual content of String objects.

5. Boolean Flag Logic  
   Stores palindrome validation result.

------------------------------------------------------------

TIME & SPACE COMPLEXITY:

Time Complexity: O(n²)  
(due to repeated string concatenation)

Space Complexity: O(n)  
(extra memory for reversed string)

------------------------------------------------------------

COMPILATION & EXECUTION:

Since the same project is being used:

javac UseCase3PalindromeCheckerApp.java
java UseCase3PalindromeCheckerApp

------------------------------------------------------------

VERSION:
UC3 – Transformation-Based Palindrome Validation
Version 3.0