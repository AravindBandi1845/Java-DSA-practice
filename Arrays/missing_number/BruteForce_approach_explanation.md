# Approach Explanation (Sorting)

## Idea
We sort the array and then check for the missing number by identifying where the sequence breaks.

## Key Concept
In a correctly ordered array from 0 to n, each element should follow:
nums[i] = nums[i-1] + 1

If this condition fails, the missing number lies between those two elements.

## Algorithm Steps
1. Sort the array.
2. If the first element is not 0, return 0.
3. Traverse the array from index 1 to n-1:
   - If nums[i] != nums[i-1] + 1:
     - Return nums[i-1] + 1
4. If no missing number is found in between:
   - Return last element + 1

## Code Explanation
After sorting, we compare each element with its previous element.  
If a gap is found, we return the missing number.  
If no gap exists, the missing number must be at the end.

## Example
Input:
nums = [3,0,1]

Sorted:
[0,1,3]

Check:
1 → OK  
3 ≠ 1 + 1 → missing = 2

Output:
2

## Time Complexity
O(n log n)

- Sorting dominates the time complexity

## Space Complexity
O(1)

## Drawback
Sorting takes extra time and is not necessary for this problem.

## Key Learning
Sorting helps identify patterns easily,  
but optimal solutions can solve this problem in linear time without sorting.
