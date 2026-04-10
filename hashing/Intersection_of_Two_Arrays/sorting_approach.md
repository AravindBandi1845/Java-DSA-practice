# Approach Explanation (Sorting + Two Pointers)

## Idea
We sort both arrays and use two pointers to find common elements efficiently.

## Key Concept
After sorting, similar elements come closer.  
We can compare elements using two pointers and move accordingly.

## Algorithm Steps
1. Sort both arrays.
2. Initialize two pointers i and j at 0.
3. Traverse both arrays:
   - If nums1[i] < nums2[j], move i forward.
   - If nums1[i] > nums2[j], move j forward.
   - If equal:
     - Add element to result set.
     - Move both pointers.
4. Convert set to array and return.

## Code Explanation
Sorting helps bring equal elements together.  
Two pointers allow us to traverse both arrays in a single pass.  
We use a HashSet to avoid duplicate elements.

## Time Complexity
O(n log n + m log m)

- Sorting dominates the time

## Space Complexity
O(k)

- k = number of unique intersection elements

## Key Learning
Sorting + two pointers is an efficient technique for array comparison problems.  
However, using HashSet can give better time complexity O(n + m).
