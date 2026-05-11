# Longest Subarray with Sum K

## Problem Statement
Given an array of integers `nums` and an integer `k`, return the length of the longest subarray whose sum is equal to `k`.

The array may contain:
- Positive numbers
- Negative numbers
- Zeroes

---

## Example 1
Input:
nums = [1,2,3,1,1,1,1]
k = 3

Output:
3

Explanation:
Subarrays with sum = 3:
- [1,2]
- [3]
- [1,1,1]

Longest length = 3

---

## Example 2
Input:
nums = [1,-1,5,-2,3]
k = 3

Output:
4

Explanation:
Subarray:
[1,-1,5,-2] → sum = 3

Length = 4

---

## Example 3
Input:
nums = [-2,-1,2,1]
k = 1

Output:
2

Explanation:
Subarray:
[-1,2] → sum = 1

Length = 2

---

## Constraints
- 1 ≤ nums.length ≤ 10⁵
- -10⁴ ≤ nums[i] ≤ 10⁴
- -10⁹ ≤ k ≤ 10⁹

---

## Notes
- Try brute force first.
- Can you solve it in O(n)?
- Sliding window works only for positive numbers.
- Prefix sum + HashMap works for all integers.
