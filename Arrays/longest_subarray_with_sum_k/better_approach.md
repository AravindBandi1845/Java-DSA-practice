# Approach Explanation (Better - Prefix Sum Array)

## Idea
Instead of recalculating subarray sums repeatedly,  
we precompute prefix sums to calculate subarray sums efficiently.

---

## Key Concept
Prefix Sum:
prefix[i] = sum of elements from index 0 to i

Subarray sum from i to j:
sum = prefix[j] - prefix[i - 1]

This avoids recalculating sums for every subarray.

---

## Algorithm Steps
1. Create a prefix sum array.
2. Traverse all possible subarrays:
   - Compute subarray sum using prefix sums
3. If sum == k:
   - Update maximum length

---

## Example
Input:
nums = [1,-1,5,-2,3]
k = 3

Prefix Sum:
[1,0,5,3,6]

Subarray:
[1,-1,5,-2]

Sum:
prefix[3] = 3

Length = 4

Output:
4

---

## Time Complexity
O(n²)

- Two nested loops still required

---

## Space Complexity
O(n)

- Extra prefix sum array used

---

## Advantage
- Faster subarray sum calculation
- Introduces prefix sum concept

---

## Drawback
- Still quadratic time
- Not fully optimized

---

## Key Learning
Prefix sums help avoid repeated calculations and form the foundation for optimized HashMap solutions.
