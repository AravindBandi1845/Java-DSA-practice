# Better Approach (Using HashSet for Cycle Detection)

## Idea
We use a HashSet to detect cycles while repeatedly computing the sum of squares of digits.

## Key Concept
If a number is happy, it will eventually reach 1.  
If it is not happy, it will enter a cycle.

## Algorithm Steps
1. Initialize a HashSet to store visited numbers.
2. While the number is not 1 and not already in the set:
   - Add the number to the set.
   - Replace it with the sum of squares of its digits.
3. If number becomes 1, return true.
4. If a cycle is detected, return false.

## Code Explanation
We keep track of all previously seen numbers.  
If we encounter the same number again, it means we are in a loop.  
If we reach 1, the number is happy.

## Time Complexity
O(log n)

## Space Complexity
O(log n)

## Key Learning
Using a HashSet helps detect cycles efficiently.  
This is a common pattern for problems involving repeated transformations.
