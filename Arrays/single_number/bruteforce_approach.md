# Approach Explanation (Brute Force)

## Idea
For each element, count how many times it appears in the array.  
The element that appears only once is the answer.

---

## Algorithm Steps
1. Traverse the array using index i.
2. For each element nums[i]:
   - Initialize count = 0
   - Traverse the entire array again
   - Count occurrences of nums[i]
3. If count == 1, return nums[i].

---

## Example
Input:
nums = [4,1,2,1,2]

Process:
- 4 → appears 1 time → answer found

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
- Very slow for large inputs
- Repeated comparisons

---

## Key Learning
Brute force helps understand frequency checking,  
but better solutions use hashing or XOR.
