# Check if Array is Sorted and Rotated

## Problem Statement
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of times (including zero). Otherwise, return false.

There may be duplicates in the array.

## Example 1
Input:
nums = [3,4,5,1,2]

Output:
true

Explanation:
Original sorted array = [1,2,3,4,5]  
Rotated 3 times → [3,4,5,1,2]

---

## Example 2
Input:
nums = [2,1,3,4]

Output:
false

---

## Example 3
Input:
nums = [1,2,3]

Output:
true

---

## Constraints
- 1 ≤ nums.length ≤ 100
- 1 ≤ nums[i] ≤ 100

## Notes
- Rotation means shifting elements from front to back.
- Array can be rotated 0 times (already sorted).
