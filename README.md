============================================================
PalindromeCheckerApp
USE CASE 10: Normalized Palindrome Validation
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome by
ignoring spaces, symbols, and character case through
string normalization.

GOAL:
Normalize input string  
Remove spaces and special characters  
Convert characters to lowercase  
Compare symmetric characters  
Print palindrome validation result

IMPLEMENTATION APPROACH:

Store predefined input string.
Normalize string using preprocessing.
Remove non-alphanumeric characters.
Convert entire string to lowercase.
Compare characters from both ends.
Stop execution if mismatch occurs.
Display final palindrome result.

FLOW OF EXECUTION:

Program starts → Input string stored →
String normalized →
Spaces and symbols removed →
Converted to lowercase →
Characters compared symmetrically →
Boolean result determined →
Output displayed → Program exits

KEY CONCEPTS USED:

String Preprocessing
Transforms input before logical validation.

Regular Expressions (Regex)
Used to remove unwanted characters.

Case Normalization
Ensures case-insensitive comparison.

Symmetric Character Comparison
Validates palindrome logically rather than format-wise.

TIME & SPACE COMPLEXITY:

Time Complexity: O(n)
Space Complexity: O(n)

COMPILATION & EXECUTION:

javac UseCase10PalindromeCheckerApp.java
java UseCase10PalindromeCheckerApp

VERSION:
UC10 – Normalized Validation Version 10.0