# 3Sum

## Problem Statement

Given an integer array `nums`, return all the triplets:

`[nums[i], nums[j], nums[k]]`

such that:

- `i != j`
- `i != k`
- `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution must not contain duplicate triplets.

You may return the triplets in any order.

---

## Example 1

Input:

nums = [-1,0,1,2,-1,-4]

Output:

[[-1,-1,2],[-1,0,1]]

Explanation:

The distinct triplets whose sum is `0` are:

- `[-1,-1,2]`
- `[-1,0,1]`

---

## Example 2

Input:

nums = [0,1,1]

Output:

[]

Explanation:

There is no triplet whose sum equals `0`.

---

## Example 3

Input:

nums = [0,0,0]

Output:

[[0,0,0]]

---

## Constraints

- 3 <= nums.length <= 3000
- -10⁵ <= nums[i] <= 10⁵

---

## Notes

- The three elements must come from different indices.
- Duplicate triplets must not be included.
- The order of the triplets in the answer does not matter.
- The order of elements within a triplet does not matter.

---

## Follow-up

Can you solve the problem in `O(n²)` time?

---

## Recommended Progression

### Brute Force
Check every possible combination of three elements.

- Time: `O(n³)`
- Space: `O(1)` excluding the output.

### Better
Use a HashSet to find the third required element efficiently.

- Time: `O(n²)`
- Space: `O(n)`.

### Optimal
Sort the array and use the **two-pointer technique** while skipping duplicates.

- Time: `O(n²)`
- Space: `O(1)` excluding the output.

---

## Key Learning

3Sum is an important problem for understanding:

- Nested loops
- Hashing
- Sorting
- Two pointers
- Duplicate handling
- Optimization from `O(n³)` to `O(n²)`
