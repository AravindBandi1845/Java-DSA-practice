# Rearrange Array Elements by Sign

## Problem Statement

You are given a 0-indexed integer array `nums` of even length consisting of an equal number of positive and negative integers.

Rearrange the elements so that:

- Every consecutive pair of integers has opposite signs.
- For all integers with the same sign, the order in which they appear in `nums` is preserved.
- The rearranged array begins with a positive integer.

Return the modified array.

---

## Example 1

Input:

nums = [3,1,-2,-5,2,-4]

Output:

[3,-2,1,-5,2,-4]

Explanation:

- The positives are: [3,1,2]
- The negatives are: [-2,-5,-4]
- The order of positive and negative numbers is preserved.
- The array starts with a positive number.

---

## Example 2

Input:

nums = [-1,1]

Output:

[1,-1]

---

## Constraints

- 2 <= nums.length <= 2 × 10⁵
- nums.length is even.
- 1 <= |nums[i]| <= 10⁵
- `nums` consists of an equal number of positive and negative integers.

---

## Notes

- Preserve the relative order of positive numbers.
- Preserve the relative order of negative numbers.
- The output array must start with a positive number.
- An extra array can be used to construct the answer efficiently.
