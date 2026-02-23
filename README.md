============================================================
PalindromeCheckerApp
============================================================

USE CASE 4:
Character Array Based Palindrome Check

OBJECTIVE:
To validate whether a given string is a palindrome by
converting the string into a character array and
applying the two-pointer comparison technique.

------------------------------------------------------------

GOAL:
Convert string to char[]
Use two-pointer approach
Compare start and end characters

------------------------------------------------------------

IMPLEMENTATION APPROACH:

- Store predefined string.
- Convert string to character array using toCharArray().
- Initialize two pointers:
  start → beginning of array
  end   → last index of array
- Compare characters at start and end.
- Move pointers inward after each comparison.
- Stop early if mismatch occurs.
- Display validation result.

------------------------------------------------------------

FLOW OF EXECUTION:

Program starts
→ Hardcoded string is stored
→ String converted to char[]
→ Start and end pointers initialized
→ Characters compared using while loop
→ Boolean result determined
→ Output displayed
→ Program exits

------------------------------------------------------------

KEY CONCEPTS USED:

1. Character Array (char[])
   Primitive array storing individual characters.

2. Array Indexing
   Access elements using index positions (0 to n-1).

3. Two-Pointer Technique
   One pointer from beginning and one from end.
   Reduces unnecessary comparisons.

4. Efficient Early Termination
   Loop breaks immediately on mismatch.

5. Time Complexity Awareness
   Avoids repeated object creation.

------------------------------------------------------------

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)  (due to char array creation)

------------------------------------------------------------

COMPILATION & EXECUTION:

javac PalindromeCheckerApp.java
java PalindromeCheckerApp

------------------------------------------------------------

VERSION:
UC4 – Character Array Based Validation
Version 4.0