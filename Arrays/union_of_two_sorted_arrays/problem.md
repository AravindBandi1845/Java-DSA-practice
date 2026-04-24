# Union of Two Sorted Arrays

## Problem Statement
Given two sorted arrays `arr1` and `arr2`, find the union of both arrays.

The union should contain all **unique elements** from both arrays in **sorted order**.

## Example 1
Input:
arr1 = [1,2,3,4,5]  
arr2 = [1,2,3]

Output:
[1,2,3,4,5]

---

## Example 2
Input:
arr1 = [1,3,5]  
arr2 = [2,4,6]

Output:
[1,2,3,4,5,6]

---

## Example 3
Input:
arr1 = [1,1,2,3]  
arr2 = [2,2,3,4]

Output:
[1,2,3,4]

---

## Constraints
- 1 ≤ arr1.length, arr2.length ≤ 10⁵
- Arrays are sorted in non-decreasing order

## Notes
- Result must contain only unique elements.
- Maintain sorted order.
- Try to solve using two-pointer approach.
