# Approach Explanation (Better - Compaction Technique)

## Idea
We move all non-zero elements to the front of the array and then fill the remaining positions with zeros.

## Key Concept
Instead of swapping repeatedly, we overwrite elements efficiently by tracking the position of the next non-zero element.

## Algorithm Steps
1. Initialize a pointer `lastNonZeroIndex = 0`.
2. Traverse the array:
   - If nums[i] is not zero:
     - Place it at nums[lastNonZeroIndex]
     - Increment lastNonZeroIndex
3. After placing all non-zero elements:
   - Fill remaining positions from lastNonZeroIndex to end with 0.

## Code Explanation
We use one pointer to track where the next non-zero element should be placed.  
All non-zero elements are shifted forward in a single pass.  
Then, we fill the rest of the array with zeros.

## Example
Input:
nums = [0,1,0,3,12]

Step 1 (move non-zero elements):
[1,3,12,_,_]

Step 2 (fill zeros):
[1,3,12,0,0]

Output:
[1,3,12,0,0]

## Time Complexity
O(n)

## Space Complexity
O(1)

## Advantage
- No nested loops
- Fewer operations than brute force
- Cleaner and faster

## Drawback
- May overwrite elements unnecessarily (extra writes)

## Key Learning
This is a stepping stone to the optimal two-pointer solution.  
It demonstrates how to efficiently shift elements in-place.
