# Approach Explanation

## Idea
The goal is to find the smallest positive integer that is missing from the array.

## Brute Force Idea
We start checking from 1 and see whether it exists in the array.  
If it does not exist, then it is the answer.

## Algorithm Steps
1. Start from number 1.
2. For each number, check if it exists in the array.
3. If found, move to the next number.
4. If not found, return that number.
5. Continue this process up to n + 1.

## Code Explanation
We use an outer loop to iterate through numbers starting from 1.  
For each number, we use an inner loop to check if it exists in the array.  
If the number is not found, we return it as the smallest missing positive.

## Time Complexity
O(n²) because for each number we scan the entire array.

## Space Complexity
O(1) since no extra data structures are used.

## Key Learning
This brute force approach is simple but inefficient.  
It helps in understanding the problem before moving to optimized solutions.
