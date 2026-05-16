# Approach Explanation (Optimal - Prefix Sum + HashMap)

## Idea
We use prefix sums and a HashMap to efficiently find the longest subarray whose sum equals k.

---

## Key Concept

### Prefix Sum
prefixSum = sum of elements from index 0 to current index

If:
currentSum - previousSum = k

Then:
Subarray between those indices has sum = k

---

## Main Observation
If:
prefixSum - k

already exists in the map, then:
- The subarray between those positions sums to k
- We can calculate its length

---

## Algorithm Steps
1. Initialize:
   - sum = 0
   - maxLength = 0
   - HashMap to store prefix sum and first occurrence index
2. Traverse the array:
   - Add current element to sum
3. If sum == k:
   - Update maxLength
4. If (sum - k) exists in map:
   - Calculate subarray length
   - Update maxLength
5. Store prefix sum in map if not already present
6. Return maxLength

---

## Example
Input:
nums = [1,-1,5,-2,3]
k = 3

Step-by-step:

Index 0:
sum = 1

Index 1:
sum = 0

Index 2:
sum = 5

Index 3:
sum = 3
→ sum == k
→ maxLength = 4

Output:
4

---

## Time Complexity
O(n)

- Single traversal

---

## Space Complexity
O(n)

- HashMap stores prefix sums

---

## Advantage
- Works for positive, negative, and zero values
- Most efficient general solution
- Very important interview pattern

---

## Key Learning
Prefix Sum + HashMap is one of the most important techniques in array problems involving:
- subarrays
- sums
- cumulative calculations
