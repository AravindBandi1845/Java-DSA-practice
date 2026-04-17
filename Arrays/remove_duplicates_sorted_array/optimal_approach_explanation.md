# Approach Explanation (Optimal - Two Pointer)

## Idea
Since the array is already sorted, duplicate elements will be adjacent.  
We use two pointers to overwrite duplicates and keep only unique elements.

## Key Concept
Use one pointer to track position of unique elements and another to traverse the array.

## Algorithm Steps
1. Initialize a pointer `i = 0` (points to last unique element).
2. Traverse array using pointer `j` from 1 to n-1:
   - If nums[j] != nums[i]:
     - Increment i
     - Assign nums[i] = nums[j]
3. Return i + 1 (count of unique elements).

## Code Explanation
Pointer `i` keeps track of where the next unique element should be placed.  
Pointer `j` scans the array.  
Whenever a new unique element is found, it is placed at index `i + 1`.

## Example
Input:
nums = [0,0,1,1,1,2,2,3,3,4]

Step-by-step:

| j | nums[j] | nums[i] | Action |
|---|--------|--------|--------|
| 1 | 0 | 0 | skip |
| 2 | 1 | 0 | i=1 → nums[1]=1 |
| 3 | 1 | 1 | skip |
| 5 | 2 | 1 | i=2 → nums[2]=2 |
| 7 | 3 | 2 | i=3 → nums[3]=3 |
| 9 | 4 | 3 | i=4 → nums[4]=4 |

Final array:
[0,1,2,3,4,...]

Output:
5

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
Two-pointer technique helps solve in-place array problems efficiently.  
This pattern is widely used in many array and string problems.
