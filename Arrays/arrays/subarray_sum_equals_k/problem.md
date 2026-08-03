# Subarray Sum Equals K

## Problem Statement

Given an array of integers `nums` and an integer `k`, return the **total number of continuous subarrays** whose sum equals `k`.

A subarray is a contiguous non-empty sequence of elements within an array.

---

## Example 1

Input:

nums = [1,1,1]
k = 2

Output:

2

Explanation:

The subarrays with sum equal to `2` are:

- [1,1] (indices 0 to 1)
- [1,1] (indices 1 to 2)

Hence, the answer is `2`.

---

## Example 2

Input:

nums = [1,2,3]
k = 3

Output:

2

Explanation:

The subarrays with sum equal to `3` are:

- [1,2]
- [3]

Hence, the answer is `2`.

---

## Constraints

- 1 <= nums.length <= 2 × 10⁴
- -1000 <= nums[i] <= 1000
- -10⁷ <= k <= 10⁷

---

## Notes

- A subarray must contain **contiguous** elements.
- The array may contain **positive, negative, and zero** values.
- Return the **count** of all valid subarrays, not the subarrays themselves.

---

## Hints

- A brute-force solution checks every possible subarray.
- Can prefix sums help avoid recomputing sums?
- How can a HashMap be used to count prefix sums efficiently?
