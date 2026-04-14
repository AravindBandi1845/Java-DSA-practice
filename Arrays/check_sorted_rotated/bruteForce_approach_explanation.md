# Approach Explanation (Brute Force - Sorting + Rotation Check)

## Idea
We sort the given array to get the original sorted version, then check if the given array matches any rotation of the sorted array.

## Key Concept
If an array is sorted and rotated, it must be equal to some rotation of the sorted version of itself.

## Algorithm Steps
1. Clone the original array.
2. Sort the cloned array.
3. Try all possible rotations of the sorted array:
   - For each rotation, compare it with the original array.
4. If any rotation matches, return true.
5. If no match is found, return false.

## Code Explanation
We first create a sorted version of the array.  
Then for each possible rotation index `i`, we compare elements:
- `nums[j]` with `sorted[(i + j) % n]`

If all elements match for any rotation, the array is valid.

## Example
Input:
nums = [3,4,5,1,2]

Sorted:
[1,2,3,4,5]

Rotation check:
- Rotate by 3 → [3,4,5,1,2] → matches → return true

## Time Complexity
O(n²)

- n rotations  
- Each rotation requires O(n) comparison  

## Space Complexity
O(n)

- For storing sorted array

## Drawback
This approach is inefficient because it checks all possible rotations.

## Key Learning
We can optimize this problem by directly counting the number of breaks in sorted order, reducing complexity to O(n).
