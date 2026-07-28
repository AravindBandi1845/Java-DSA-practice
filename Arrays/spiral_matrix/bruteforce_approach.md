# Approach Explanation (Brute Force - Visited Matrix Simulation)

## Idea

Instead of managing the matrix boundaries directly, simulate the traversal in four directions:

- Right
- Down
- Left
- Up

Maintain a separate `visited` matrix to ensure each cell is visited exactly once.

Whenever the next position is either outside the matrix or already visited, change the direction clockwise.

---

## Key Concept

- Create a `visited` matrix of the same dimensions as the input matrix.
- Define four movement directions:
  - Right `(0, 1)`
  - Down `(1, 0)`
  - Left `(0, -1)`
  - Up `(-1, 0)`
- Start from the top-left cell `(0, 0)`.
- Visit each cell once.
- Change direction whenever the next move becomes invalid.

---

## Algorithm Steps

1. Create a boolean `visited` matrix of size `m × n`.
2. Store the four movement directions.
3. Start from cell `(0, 0)` facing right.
4. Repeat `m × n` times:
   - Add the current element to the answer.
   - Mark the current cell as visited.
   - Compute the next cell.
   - If the next cell is outside the matrix or already visited:
     - Rotate to the next direction.
     - Recalculate the next cell.
   - Move to the next cell.
5. Return the answer list.

---

## Example

Input:

```
[
 [1,2,3],
 [4,5,6],
 [7,8,9]
]
```

Traversal Order:

```
Right  → 1 2 3
Down   → 6 9
Left   → 8 7
Up     → 4
Right  → 5
```

Output:

```
[1,2,3,6,9,8,7,4,5]
```

---

## Time Complexity

**O(m × n)**

- Every cell is visited exactly once.

---

## Space Complexity

**O(m × n)**

- Extra space is required for the `visited` matrix.

---

## Advantages

- Easy to visualize and implement.
- Clearly separates movement logic from traversal.
- Works for any rectangular matrix.

---

## Drawbacks

- Requires an additional `visited` matrix.
- Does not satisfy the constant-space optimization possible using boundary traversal.

---

## Key Learning

Instead of controlling traversal with matrix boundaries, we can simulate movement using four directions and a `visited` matrix. This approach is intuitive but uses additional memory, motivating the more space-efficient boundary-based solution.
