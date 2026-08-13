# Approach Explanation (Brute Force - Three Nested Loops)

## Idea

The brute force approach checks every possible combination of three elements in the array.

We use three nested loops to select three different indices `i`, `j`, and `k`.

For every combination, calculate:

```text
nums[i] + nums[j] + nums[k]
