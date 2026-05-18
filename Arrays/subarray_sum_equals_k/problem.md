# Subarray Sum Equals K

## Problem Statement
Given an integer array `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

A subarray is a contiguous non-empty sequence of elements within an array.

---

## Example 1
Input:
nums = [1,1,1]
k = 2

Output:
2

Explanation:
Subarrays with sum = 2:
- [1,1] (index 0 to 1)
- [1,1] (index 1 to 2)

Total = 2

---

## Example 2
Input:
nums = [1,2,3]
k = 3

Output:
2

Explanation:
Subarrays:
- [1,2]
- [3]

Total = 2

---

## Example 3
Input:
nums = [1,-1,0]
k = 0

Output:
3

Explanation:
Subarrays:
- [1,-1]
- [0]
- [1,-1,0]

Total = 3

---

## Constraints
- 1 ≤ nums.length ≤ 2 × 10⁴
- -1000 ≤ nums[i] ≤ 1000
- -10⁷ ≤ k ≤ 10⁷

---

## Notes
- The array may contain negative numbers.
- Sliding window does NOT work for all cases.
- Prefix Sum + HashMap is the optimal approach.
