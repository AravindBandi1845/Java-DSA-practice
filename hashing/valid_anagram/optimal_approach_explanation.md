# Optimal Approach (Using Single Frequency Array)

## Idea
We use a single frequency array to track character counts for both strings simultaneously.

## Key Concept
If two strings are anagrams, they must have the same characters with the same frequency.

Instead of using two arrays, we can optimize by:
- Incrementing count for string `s`
- Decrementing count for string `t`

## Algorithm Steps
1. If lengths of both strings are not equal, return false.
2. Initialize an array `counter` of size 26.
3. Traverse both strings in a single loop:
   - Increment count for characters in `s`
   - Decrement count for characters in `t`
4. After traversal, check the array:
   - If any value is not zero, return false
5. If all values are zero, return true

## Code Explanation
We use one loop to process both strings at the same time.  
Each character from `s` increases the count, and each character from `t` decreases it.  
If both strings are anagrams, all counts will cancel out to zero.

## Time Complexity
O(n)

## Space Complexity
O(1)  
(only one fixed-size array of 26 characters)

## Key Learning
Using a single frequency array is more efficient than using two arrays.  
It reduces space usage and simplifies the logic while maintaining optimal performance.
