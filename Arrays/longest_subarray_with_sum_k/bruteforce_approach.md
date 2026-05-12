# Approach Explanation (Brute Force)

## Idea
Generate all possible subarrays and calculate their sums.  
Whenever the sum equals k, update the maximum length.

---

## Key Concept
A subarray is a contiguous part of the array.  
We use two loops:
- One loop for starting index
- Another loop for ending index

---

## Algorithm Steps
1. Initialize maxLength = 0
2. Traverse array using index i:
   - Initialize sum = 0
3. Traverse from j = i to n-1:
   - Add nums[j] to sum
   - If sum == k:
     - Update maxLength

---

## Example
Input:
nums = [1,-1,5,-2,3]
k = 3

Subarrays:
[1,-1,5,-2] → sum = 3 → length = 4  
[3] → sum = 3 → length = 1

Maximum Length = 4

Output:
4

---

## Time Complexity
O(n²)

- Outer loop × inner loop

---

## Space Complexity
O(1)

---

## Drawback
- Inefficient for large arrays
- Repeated sum calculations

---

## Key Learning
Brute force helps understand subarray generation,  
but optimized solutions use prefix sums and hashing.
