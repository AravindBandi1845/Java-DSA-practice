# Left Rotate Array by K Places

## Problem Statement
Given an integer array `nums` and an integer `k`, rotate the array to the left by `k` steps.

## Example 1
Input:
nums = [1,2,3,4,5,6,7], k = 3

Output:
[4,5,6,7,1,2,3]

## Example 2
Input:
nums = [1,2,3], k = 4

Output:
[2,3,1]

Explanation:
k = 4 → k % n = 1  
So rotate left by 1 → [2,3,1]

## Constraints
- 1 ≤ nums.length ≤ 10⁵
- -10⁴ ≤ nums[i] ≤ 10⁴
- 0 ≤ k ≤ 10⁵

## Notes
- Rotation should be done in-place if possible.
- Left rotation means shifting elements to the left and moving front elements to the end.
