# Approach Explanation (Optimal - Extra Array)

## Idea

Use an auxiliary array to directly place positive and negative numbers in their correct positions.

Maintain two indices:
- `positiveIndex = 0` → Even indices
- `negativeIndex = 1` → Odd indices

Traverse the input array once:
- Place every positive number at the current even index.
- Place every negative number at the current odd index.

Since the array contains an equal number of positive and negative elements, both indices will always remain within bounds.

---

## Key Concept

- Even indices should contain positive numbers.
- Odd indices should contain negative numbers.
- Preserve the relative order of positive numbers.
- Preserve the relative order of negative numbers.
- Direct placement eliminates unnecessary searching or shifting.

---

## Algorithm Steps

1. Create a result array of size `n`.
2. Initialize:
   - `positiveIndex = 0`
   - `negativeIndex = 1`
3. Traverse the input array.
4. For each element:
   - If it is positive:
     - Place it at `result[positiveIndex]`.
     - Increment `positiveIndex` by 2.
   - Otherwise:
     - Place it at `result[negativeIndex]`.
     - Increment `negativeIndex` by 2.
5. Return the result array.

---

## Example

Input:

nums = [3,1,-2,-5,2,-4]

Processing:

Positive numbers:
3 → index 0

1 → index 2

2 → index 4

Negative numbers:

-2 → index 1

-5 → index 3

-4 → index 5

Result:

[3,-2,1,-5,2,-4]

Output:

[3,-2,1,-5,2,-4]

---

## Time Complexity

O(n)

- Only one traversal of the array.

---

## Space Complexity

O(n)

- An auxiliary array of size `n` is used.

---

## Why is this Optimal?

- Every element is processed exactly once.
- No element shifting or repeated searching is required.
- The relative order of positive and negative elements is preserved.
- Under the given constraints, preserving order cannot be achieved in linear time without using additional space.

---

## Key Learning

This problem demonstrates how maintaining separate pointers for different categories of elements enables efficient array rearrangement. The direct placement technique is widely used in array partitioning and rearrangement problems.
