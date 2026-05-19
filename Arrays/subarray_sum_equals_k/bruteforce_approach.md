# Approach Explanation (Brute Force)

## Idea
Generate all possible subarrays and calculate their sums.  
Whenever the sum equals k, increment the count.

---

## Key Concept
A subarray is a contiguous sequence of elements.  
We use:
- One loop for starting index
- Another loop for ending index

---

## Algorithm Steps
1. Initialize count = 0
2. Traverse array using index i:
   - Initialize sum = 0
3. Traverse from j = i to n-1:
   - Add nums[j] to sum
   - If sum == k:
     - Increment count
4. Return count

---

## Example
Input:
nums = [1,1,1]
k = 2

Subarrays:
[1]  
[1,1] → sum = 2 → count++  
[1,1,1]  

[1]  
[1,1] → sum = 2 → count++  

[1]

Total Count = 2

Output:
2

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
Brute force helps understand subarray generation and cumulative sums,  
but optimized solutions use Prefix Sum + HashMap.
