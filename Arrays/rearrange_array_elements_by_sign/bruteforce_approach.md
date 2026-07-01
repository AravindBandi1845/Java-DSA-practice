# Approach Explanation (Brute Force - Right Rotation)

## Idea

Traverse the array from left to right.

At each index:
- If the element already has the correct sign, continue.
- Otherwise, search for the next element having the required sign.
- Once found, right rotate the subarray so that the required element comes to the current position.

This preserves the relative order of the remaining elements.

---

## Key Concept

- Even indices should contain positive numbers.
- Odd indices should contain negative numbers.
- Whenever an element is misplaced, find the next suitable element and bring it forward using right rotation.

---

## Algorithm Steps

1. Traverse the array from index `0` to `n - 1`.
2. For each index:
   - If the sign is correct, continue.
   - Otherwise, search for the next element with the required sign.
3. If such an element exists:
   - Right rotate the subarray from the current index to that element.
4. Continue until the end of the array.
5. Return the modified array.

---

## Example

Input:

nums = [3,1,-2,-5,2,-4]

Processing:

Index 0 → Positive ✔

Index 1 → Positive ✘
Need a negative number.

Next negative = -2

Right Rotate:

[3,-2,1,-5,2,-4]

Remaining indices already satisfy the condition.

Output:

[3,-2,1,-5,2,-4]

---

## Time Complexity

O(n²)

- Searching for the next required element takes O(n).
- Right rotation may also take O(n).
- In the worst case, this is repeated for multiple indices.

---

## Space Complexity

O(1)

- No extra array is used.

---

## Advantage

- Rearranges the array in-place.
- Preserves the relative order of positive and negative elements.

---

## Drawback

- Inefficient for large arrays due to repeated searching and rotations.

---

## Key Learning

Right rotation is useful when elements must be repositioned while maintaining the order of the remaining elements. However, repeated rotations increase the overall time complexity, making this approach less efficient than using an auxiliary array.
