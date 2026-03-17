# Approach Explanation

## Idea
The goal of the problem is to find two numbers in the array whose sum is equal to the target value and return their indices.

## Brute Force Idea
The simplest approach is to check every possible pair of elements in the array.  
For each element, we compare it with all the remaining elements to see if their sum equals the target.

## Algorithm Steps
1. Traverse the array using index `i`.
2. For each element `nums[i]`, iterate through the remaining elements using index `j`.
3. Check if `nums[i] + nums[j] == target`.
4. If the condition is satisfied, return the indices `[i, j]`.
5. If no pair satisfies the condition after checking all pairs, return an empty array.

## Code Explanation
Two nested loops are used to generate all possible pairs of elements in the array.  
For each pair, we check whether their sum equals the target.  
Once a valid pair is found, their indices are returned.

## Time Complexity
O(n²) because every element is compared with the remaining elements.

## Space Complexity
O(1) since no additional data structures are used.

## Key Learning
This brute force solution helps in understanding the problem clearly before moving to the optimal HashMap-based solution.
