# Approach Explanation (Brute Force)

## Idea
We repeatedly replace the number with the sum of the squares of its digits.

## Concept
If the number becomes 1, it is a happy number.  
To avoid infinite loops, we limit the number of iterations.

## Algorithm Steps
1. Initialize a counter (attempts).
2. While the number is not 1 and attempts are less than a limit:
   - Replace number with sum of squares of digits.
3. If number becomes 1, return true.
4. Otherwise, return false.

## Code Explanation
We repeatedly compute the sum of squares using a helper function.  
The loop stops either when we reach 1 or exceed a fixed number of attempts.

## Time Complexity
Not well-defined (depends on iteration limit)

## Space Complexity
O(1)

## Key Learning
This approach does not properly detect cycles.  
A better solution uses a HashSet or slow-fast pointers to detect loops.
