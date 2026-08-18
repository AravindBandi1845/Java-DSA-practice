# Approach Explanation (Optimal - Sorting + Two Pointers)

## Idea

The brute force approach uses three nested loops, resulting in `O(n³)` time.

The better approach uses a HashSet and reduces the time complexity to `O(n²)`, but it requires extra space.

We can optimize the solution further by **sorting the array** and using the **two-pointer technique**.

After sorting, fix one element and use two pointers to find the remaining two elements whose sum makes the total equal to `0`.

---

## Key Concept

Sort the array first.

For every index `i`:

- Treat `nums[i]` as the first element.
- Set:
  - `left = i + 1`
  - `right = n - 1`
- Calculate:
  ```text
  sum = nums[i] + nums[left] + nums[right]
