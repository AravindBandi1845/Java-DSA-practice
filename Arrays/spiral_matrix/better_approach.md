# Approach Explanation (Better - Boundary Traversal)

## Idea

Instead of using an extra `visited` matrix, maintain four boundaries that represent the current layer of the matrix:

- `top`
- `bottom`
- `left`
- `right`

Traverse the matrix layer by layer in spiral order.

After completing one side, update the corresponding boundary and continue until all elements have been visited.

---

## Key Concept

The traversal follows four directions repeatedly:

1. Left → Right along the top row.
2. Top → Bottom along the right column.
3. Right → Left along the bottom row.
4. Bottom → Top along the left column.

After each traversal, shrink the corresponding boundary.

Boundary checks are required before traversing the bottom row and left column to avoid visiting elements multiple times.

---

## Algorithm Steps

1. Initialize:
   - `top = 0`
   - `bottom = m - 1`
   - `left = 0`
   - `right = n - 1`
2. Traverse the top row and increment `top`.
3. Traverse the right column and decrement `right`.
4. If `top <= bottom`, traverse the bottom row and decrement `bottom`.
5. If `left <= right`, traverse the left column and increment `left`.
6. Repeat until all boundaries cross.

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

Traversal:

```
Top Row      : 1 2 3
Right Column : 6 9
Bottom Row   : 8 7
Left Column  : 4
Remaining    : 5
```

Output:

```
[1,2,3,6,9,8,7,4,5]
```

---

## Time Complexity

**O(m × n)**

- Every element is visited exactly once.

---

## Space Complexity

**O(1)**

- Only four boundary variables are used.
- The output list is not counted as extra space.

---

## Advantages

- Eliminates the need for a `visited` matrix.
- Uses constant extra space.
- Efficient and suitable for rectangular matrices.

---

## Drawbacks

- Requires careful boundary updates.
- Missing boundary checks may lead to duplicate traversal.

---

## Key Learning

Instead of tracking visited cells, we can control the traversal using four shrinking boundaries. This allows us to visit every element exactly once while reducing the extra space from **O(m × n)** to **O(1)**.
