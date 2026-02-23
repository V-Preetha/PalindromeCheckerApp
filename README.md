============================================================
PalindromeCheckerApp
============================================================

USE CASE 5:
Stack-Based Palindrome Checker

OBJECTIVE:
To validate whether a given string is a palindrome by
using a Stack data structure to reverse characters
based on LIFO (Last In First Out) principle.

------------------------------------------------------------

GOAL:
Push characters into stack
Pop characters in reverse order
Compare with original string
Print validation result

------------------------------------------------------------

IMPLEMENTATION APPROACH:

- Store predefined string.
- Create a Stack<Character> object.
- Push each character of the string into the stack.
- Pop characters one by one.
- Compare popped character with original string.
- Stop immediately if mismatch occurs.
- Display final result.

------------------------------------------------------------

FLOW OF EXECUTION:

Program starts
→ Hardcoded string is stored
→ Stack is created
→ Characters pushed into stack
→ Characters popped in reverse order
→ Compared with original string
→ Boolean result determined
→ Output displayed
→ Program exits

------------------------------------------------------------

KEY CONCEPTS USED:

1. Stack (java.util.Stack)
   Linear data structure following LIFO principle.

2. Push Operation
   Adds elements to the top of the stack.

3. Pop Operation
   Removes elements from the top (reverse order retrieval).

4. Reversal Logic
   Stack automatically reverses insertion order.

5. Data Structure Utilization
   Demonstrates structured approach instead of index-based logic.

------------------------------------------------------------

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)  (extra stack storage)

------------------------------------------------------------

COMPILATION & EXECUTION:

javac PalindromeCheckerApp.java
java PalindromeCheckerApp

------------------------------------------------------------

VERSION:
UC5 – Stack-Based Validation
Version 5.0