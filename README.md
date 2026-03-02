============================================================
PalindromeCheckerApp
USE CASE 13: Performance Comparison
============================================================

OBJECTIVE:
To compare execution performance of different palindrome
validation algorithms using runtime measurement.

GOAL:
Execute multiple palindrome algorithms
Measure execution time
Display performance comparison results

IMPLEMENTATION APPROACH:

Normalize input string.
Execute Stack-based palindrome check.
Execute Deque-based palindrome check.
Execute Direct comparison approach.
Capture execution time using System.nanoTime().
Display validation result with execution duration.

FLOW OF EXECUTION:

Program starts → Input normalized →
Algorithm 1 executed →
Execution time captured →
Algorithm 2 executed →
Execution time captured →
Algorithm 3 executed →
Results displayed → Program exits

KEY CONCEPTS USED:

System.nanoTime()
Provides high-resolution execution timing.

Algorithm Comparison
Evaluates efficiency of different approaches.

Performance Analysis
Helps identify optimal algorithm.

TIME COMPLEXITY:

All Methods: O(n)
Performance differs due to overhead.

COMPILATION & EXECUTION:

javac UseCase13PalindromeCheckerApp.java
java UseCase13PalindromeCheckerApp

VERSION:
UC13 – Performance Comparison Version 13.0