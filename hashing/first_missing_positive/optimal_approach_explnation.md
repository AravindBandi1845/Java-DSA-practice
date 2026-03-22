# Optimal Approach

## Idea
We use the concept of placing each number at its correct index position in the array.

For a number x, its correct position should be at index (x - 1).

## Why This Works
If all numbers from 1 to n are present, then every number will be placed at its correct index.

If a number is missing, there will be a mismatch between index and value.

## Concept
We rearrange the array such that:
- If nums[i] = x, then it should be placed at index x - 1.

We keep swapping elements until every valid number is placed in its correct position.

## Algorithm Steps
1. Traverse the array.
2. While the current element is:
   - positive
   - less than or equal to n
   - not already in the correct position
   swap it with the element at its correct index.
3. After rearrangement, traverse the array again.
4. If nums[i] != i + 1, return i + 1.
5. If all elements are correct, return n + 1.

## Code Explanation
The first loop places each element at its correct position using swapping.  
The second loop checks for the first index where the value does not match the expected value.

## Time Complexity
O(n)  
Each element is moved at most once.

## Space Complexity
O(1)  
No extra space is used, only in-place modifications.

## Key Learning
This problem teaches how to use array indices to represent values and solve problems in constant space.  
It is a very important pattern in DSA.
