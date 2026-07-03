# Approach Explanation (Better - Extra Array)

## Idea

Create a new array of the same size as the input array.

Maintain two pointers:
- `positiveIndex = 0` for even positions
- `negativeIndex = 1` for odd positions

Traverse the original array once:
- If the current element is positive, place it at `positiveIndex` and move `positiveIndex` by 2.
- If the current element is negative, place it at `negativeIndex` and move `negativeIndex` by 2.

Since the input contains an equal number of positive and negative integers, every position will be filled correctly.

---

## Key Concept

- Even indices should contain positive numbers.
- Odd indices should contain negative numbers.
- Two pointers help place elements directly into their correct positions.
- The relative order of positive and negative elements is preserved.

---

## Algorithm Steps

1. Create a result array of size `n`.
2. Initialize:
   - `positiveIndex = 0`
   - `negativeIndex = 1`
3. Traverse the input array.
4. If the current element is positive:
   - Store it at `result[positiveIndex]`.
   - Increment `positiveIndex` by 2.
5. Otherwise:
   - Store it at `result[negativeIndex]`.
   - Increment `negativeIndex` by 2.
6. Return the result array.

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

---

## Time Complexity

O(n)

- Single traversal of the array.

---

## Space Complexity

O(n)

- Extra array is used to store the rearranged elements.

---

## Advantage

- Efficient linear-time solution.
- Preserves the relative order of positive and negative numbers.
- Easy to implement.

---

## Drawback

- Requires an additional array of size `n`.

---

## Key Learning

Using separate pointers for even and odd indices allows direct placement of elements in a single pass. This technique is useful when the output array can be constructed independently of the input array.
