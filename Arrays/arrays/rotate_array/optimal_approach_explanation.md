# Approach Explanation (Optimal - Reversal Algorithm)

## Idea
We rotate the array in-place using the reversal technique.

## Key Concept
A left rotation by k can be achieved by reversing parts of the array in a specific order.

Steps:
1. Reverse first k elements
2. Reverse remaining n-k elements
3. Reverse entire array

## Algorithm Steps
1. Compute k = k % n to handle large k.
2. Reverse elements from index 0 to k-1.
3. Reverse elements from index k to n-1.
4. Reverse the entire array from index 0 to n-1.

## Code Explanation
Reversing segments rearranges the elements such that the order after final reversal matches the desired rotated array.

The first two reversals prepare the segments, and the final reversal combines them correctly.

## Example
Input:
nums = [1,2,3,4,5,6,7], k = 3

Step 1: Reverse first k elements
[3,2,1,4,5,6,7]

Step 2: Reverse remaining elements
[3,2,1,7,6,5,4]

Step 3: Reverse entire array
[4,5,6,7,1,2,3]

Output:
[4,5,6,7,1,2,3]

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
Reversal algorithm is an efficient way to rotate arrays in-place.  
It avoids extra space and works in linear time.

This pattern is commonly used in array manipulation problems.
