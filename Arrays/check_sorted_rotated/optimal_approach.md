# Approach Explanation (Optimal - Circular Drop)

## Idea
A sorted and rotated array can have at most one place where the order breaks.

## Key Concept
In a non-decreasing sorted array:
nums[i] <= nums[i+1]

If the array is rotated, there will be at most one position where:
nums[i] > nums[i+1]

We count such "drops".

## Algorithm Steps
1. Initialize count = 0.
2. Traverse the array from i = 0 to n-1:
   - Compare nums[i] with nums[(i + 1) % n]
3. If nums[i] > nums[(i + 1) % n], increment count.
4. If count becomes greater than 1, return false.
5. Otherwise, return true.

## Code Explanation
We use modulo (i + 1) % n to handle the circular nature of the array.  
This ensures the last element is compared with the first element.

## Example 1
Input:
nums = [3,4,5,1,2]

Comparisons:
3 < 4 ✔  
4 < 5 ✔  
5 > 1 ❌ (1 drop)  
1 < 2 ✔  
2 < 3 ✔ (circular check)

Count = 1 → Valid → return true

## Example 2
Input:
nums = [2,1,3,4]

Comparisons:
2 > 1 ❌ (1 drop)  
1 < 3 ✔  
3 < 4 ✔  
4 > 2 ❌ (2nd drop)

Count = 2 → Invalid → return false

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
A rotated sorted array has at most one drop in order.  
Using circular comparison simplifies the problem and avoids extra work like sorting.
