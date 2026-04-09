# Approach Explanation (Brute Force)

## Idea
We compare each element of the first array with every element of the second array to find common elements.

## Key Concept
If an element appears in both arrays, it belongs to the intersection.  
We also ensure that duplicate elements are not added multiple times.

## Algorithm Steps
1. Create an empty list to store the result.
2. Traverse each element in nums1:
   - For each element, traverse nums2.
3. If a match is found:
   - Check if the element is already present in the result list.
   - If not, add it to the list.
4. Convert the list to an array and return it.

## Code Explanation
We use two nested loops to compare elements from both arrays.  
Whenever a match is found, we check for duplicates using `list.contains()` before adding it to the result.

## Time Complexity
O(n * m * k)

- n = size of nums1  
- m = size of nums2  
- k = size of result list (due to contains check)

## Space Complexity
O(k)

## Key Learning
Brute force approach is simple but inefficient.  
Using HashSet can optimize the solution to O(n + m).
