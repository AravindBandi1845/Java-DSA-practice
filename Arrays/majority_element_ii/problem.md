# Majority Element II

## Problem Statement

Given an integer array `nums` of size `n`, return **all elements** that appear **more than ⌊n / 3⌋ times**.

You may return the answer in **any order**.

---

## Example 1

Input:

nums = [3,2,3]

Output:

[3]

---

## Example 2

Input:

nums = [1]

Output:

[1]

---

## Example 3

Input:

nums = [1,2]

Output:

[1,2]

---

## Constraints

- 1 <= nums.length <= 5 × 10⁴
- -10⁹ <= nums[i] <= 10⁹

---

## Follow-up

Can you solve the problem in **linear time** and **O(1)** extra space?

---

## Notes

- There can be **at most two majority elements** that appear more than **⌊n / 3⌋** times.
- The answer may contain **0, 1, or 2** elements.
- Return the elements in any order.

---

## Hints

- Count the frequency of every element.
- Is sorting sufficient?
- Can the Boyer-Moore Voting Algorithm be extended to find two majority elements?
