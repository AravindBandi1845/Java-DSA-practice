# Approach Explanation (Better - HashSet)

## Idea

In the brute force approach, we use three nested loops to check every possible triplet, resulting in `O(n³)` time.

We can improve this by fixing one element and using a **HashSet** to find the other two elements efficiently.

For every fixed element `nums[i]`, we need to find two elements whose sum is:

```text
target = -nums[i]
