# Next Permutation

## Problem Statement

A permutation of an array of integers is an arrangement of its elements into a sequence.

The next permutation of an array is the lexicographically next greater permutation of its integers.

If such an arrangement is not possible, rearrange the array into the lowest possible order (i.e., sorted in ascending order).

The replacement must be done in-place and use only constant extra memory.

---

## Example 1

Input:

nums = [1,2,3]

Output:

[1,3,2]

Explanation:

The next lexicographically greater permutation after [1,2,3] is [1,3,2].

---

## Example 2

Input:

nums = [3,2,1]

Output:

[1,2,3]

Explanation:

The array is in descending order, so no greater permutation exists.
Reverse the entire array to obtain the smallest permutation.

---

## Example 3

Input:

nums = [1,1,5]

Output:

[1,5,1]

---

## Constraints

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 100

---

## Notes

- Modify the array in-place.
- Use only constant extra space.
- If no next permutation exists, return the smallest permutation.
