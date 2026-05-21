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

This avoids repeated addition operations.

---

## Algorithm Steps
1. Create a prefix sum array.
2. Traverse all possible subarrays:
   - Compute subarray sum using prefix sums
3. If sum == k:
   - Increment count
4. Return count

---

## Example
Input:
nums = [1,1,1]
k = 2

Prefix Sum:
[1,2,3]

Subarrays:
[1,1] → sum = 2  
[1,1] → sum = 2

Total Count = 2

Output:
2

---

## Time Complexity
O(n²)

- Still requires nested loops

---

## Space Complexity
O(n)

- Extra prefix sum array used

---

## Advantage
- Faster sum calculation
- Introduces prefix sum technique

---

## Drawback
- Still quadratic time
- Not fully optimized

---

## Key Learning
Prefix sums reduce repeated computations and form the foundation for the optimal HashMap solution.
