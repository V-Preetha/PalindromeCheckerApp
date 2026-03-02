============================================================
PalindromeCheckerApp
USE CASE 11: Object-Oriented Palindrome Service
============================================================

OBJECTIVE:
To validate whether a given string is a palindrome using
Object-Oriented Programming principles by encapsulating
the validation logic inside a dedicated service class.

GOAL:
Create PalindromeChecker class  
Encapsulate palindrome logic  
Expose checkPalindrome() method  
Invoke service through object creation

IMPLEMENTATION APPROACH:

Create PalindromeChecker service class.
Implement checkPalindrome() method.
Normalize input string.
Compare characters from both ends.
Return validation result.
Call service from main application class.
Display palindrome result.

FLOW OF EXECUTION:

Program starts → Input string stored →
PalindromeChecker object created →
checkPalindrome() method invoked →
String normalized →
Characters compared →
Boolean result returned →
Output displayed → Program exits

KEY CONCEPTS USED:

Encapsulation
Palindrome logic hidden inside service class.

Single Responsibility Principle
Class handles only palindrome validation.

Object-Oriented Design
Logic separated from application execution.

Method Abstraction
Public method exposes validation behavior.

TIME & SPACE COMPLEXITY:

Time Complexity: O (n)
Space Complexity: O (n)

COMPILATION & EXECUTION:

javac PalindromeCheckerApp.java
java PalindromeCheckerApp

VERSION:
UC11 – Object-Oriented Validation Version 11.0