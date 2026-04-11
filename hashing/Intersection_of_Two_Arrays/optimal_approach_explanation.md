# Approach Explanation (Using HashSet)

## Idea
We use a HashSet to efficiently find common elements between two arrays.

## Key Concept
HashSet stores unique elements and provides O(1) average time complexity for lookup operations.

## Algorithm Steps
1. Create a HashSet and store all elements of nums1.
2. Create another HashSet to store intersection elements.
3. Traverse nums2:
   - If element exists in the first set, add it to the intersection set.
4. Convert the intersection set into an array and return it.

## Code Explanation
We first store elements of nums1 in a set for fast lookup.  
Then we iterate through nums2 and check if each element exists in the set.  
If it exists, we add it to the result set.  
Finally, we convert the result set into an array.

## Time Complexity
O(n + m)

- n = size of nums1  
- m = size of nums2  

## Space Complexity
O(n)

## Key Learning
Using HashSet helps reduce time complexity significantly compared to brute force.  
It is the most efficient approach for this problem.
