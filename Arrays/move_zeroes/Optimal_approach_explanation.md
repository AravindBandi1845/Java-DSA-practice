# Approach Explanation (Optimal - Two Pointer)

## Idea
We use two pointers to move all non-zero elements to the front while maintaining their relative order, and zeros automatically move to the end.

## Key Concept
- One pointer (`i`) tracks the position where the next non-zero element should be placed.
- Another pointer (`j`) traverses the array.

## Algorithm Steps
1. Initialize `i = 0`.
2. Traverse array with `j` from 0 to n-1:
   - If nums[j] is not zero:
     - Swap nums[i] and nums[j]
     - Increment i
3. Continue until end of array.

## Code Explanation
Pointer `j` scans each element.  
Whenever a non-zero element is found, it is placed at index `i`.  
This ensures all non-zero elements are moved forward in order.  
Zeros naturally shift to the end.

## Example
Input:
nums = [0,1,0,3,12]

Step-by-step:

| j | nums[j] | Action | Array |
|---|--------|--------|-------|
| 0 | 0 | skip | [0,1,0,3,12] |
| 1 | 1 | swap(0,1) | [1,0,0,3,12] |
| 2 | 0 | skip | [1,0,0,3,12] |
| 3 | 3 | swap(1,3) | [1,3,0,0,12] |
| 4 | 12 | swap(2,4) | [1,3,12,0,0] |

Output:
[1,3,12,0,0]

## Time Complexity
O(n)

## Space Complexity
O(1)

## Advantage
- In-place solution
- Maintains order of non-zero elements
- Efficient and clean

## Key Learning
Two-pointer technique is very powerful for in-place array manipulation.  
This pattern is widely used in many problems.
