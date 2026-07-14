# Approach Explanation (Brute Force - Temporary Marker)

## Idea

Whenever a cell containing `0` is found, its entire row and column must eventually become `0`.

However, if we directly replace elements with `0` while traversing the matrix, those newly created zeros will incorrectly affect other rows and columns.

To avoid this, mark all affected non-zero cells with a temporary value (such as `-1`). After processing the entire matrix, convert every temporary marker into `0`.

---

## Key Concept

- Traverse the matrix.
- Whenever a `0` is found:
  - Mark all non-zero elements in its row as `-1`.
  - Mark all non-zero elements in its column as `-1`.
- After the traversal, replace every `-1` with `0`.

---

## Algorithm Steps

1. Traverse every cell of the matrix.
2. If the current cell is `0`:
   - Traverse its row and mark every non-zero element as `-1`.
   - Traverse its column and mark every non-zero element as `-1`.
3. After scanning the complete matrix:
   - Traverse the matrix again.
   - Replace every `-1` with `0`.
4. Return the modified matrix.

---

## Example

Input:

```
[
 [1,1,1],
 [1,0,1],
 [1,1,1]
]
```

After marking:

```
[
 [1,-1,1],
 [-1,0,-1],
 [1,-1,1]
]
```

After converting `-1` to `0`:

```
[
 [1,0,1],
 [0,0,0],
 [1,0,1]
]
```

Output:

```
[
 [1,0,1],
 [0,0,0],
 [1,0,1]
]
```

---

## Time Complexity

**O((m × n) × (m + n))**

- For every zero, its entire row and column may be traversed.

---

## Space Complexity

**O(1)**

- No extra arrays are used.
- Only a temporary marker value is utilized.

---

## Advantage

- Does not require additional row or column arrays.
- Easy to understand.

---

## Drawback

- Inefficient because rows and columns are repeatedly traversed.
- Relies on choosing a temporary marker that does not conflict with valid matrix values.

---

## Key Learning

Directly replacing elements with `0` during traversal leads to incorrect results because newly created zeros influence subsequent processing. Using a temporary marker postpones the actual updates until the entire matrix has been examined.
