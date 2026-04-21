# Approach Explanation (Brute Force)

## Idea
Whenever we encounter a zero, we look ahead in the array to find the next non-zero element and swap them.

## Key Concept
We push zeros to the right by swapping them with the next available non-zero element.

## Algorithm Steps
1. Traverse the array from left to right.
2. If nums[i] is 0:
   - Search for the next non-zero element from index i+1.
3. If found:
   - Swap nums[i] and nums[j].
4. Continue this process for all elements.

## Code Explanation
We use two loops:
- Outer loop to detect zeros.
- Inner loop to find the next non-zero element.

When found, we swap them and break the inner loop.

## Example
Input:
nums = [0,1,0,3,12]

Step-by-step:
- Swap 0 and 1 → [1,0,0,3,12]
- Swap 0 and 3 → [1,3,0,0,12]
- Swap 0 and 12 → [1,3,12,0,0]

Output:
[1,3,12,0,0]

## Time Complexity
O(n²)

- For each zero, we may scan the remaining array.

## Space Complexity
O(1)

## Drawback
This approach is inefficient due to nested loops and multiple swaps.

## Key Learning
Brute force helps understand the problem,  
but we can optimize it using the two-pointer technique to achieve O(n) time.
