# Approach Explanation (Optimal - Transpose & Reverse)

## Idea

Instead of using an extra matrix or rotating each layer individually, we can rotate the matrix in-place using two simple operations:

1. Transpose the matrix.
2. Reverse every row.

The transpose converts rows into columns, and reversing each row completes the 90° clockwise rotation.

---

## Key Concept

### Step 1: Transpose

Swap every element above the main diagonal with its corresponding element below the diagonal.

For every:

```
(i, j)
```

swap with

```
(j, i)
```

This converts rows into columns.

---

### Step 2: Reverse Every Row

Reverse each row of the transposed matrix.

This shifts the elements into their correct positions for a 90° clockwise rotation.

---

## Algorithm Steps

1. Traverse the upper triangular part of the matrix.
2. Swap `matrix[i][j]` with `matrix[j][i]`.
3. Traverse every row.
4. Reverse each row using two pointers.
5. The matrix is now rotated by 90° clockwise.

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

### After Transpose

```
[
 [1,4,7],
 [2,5,8],
 [3,6,9]
]
```

### After Reversing Every Row

```
[
 [7,4,1],
 [8,5,2],
 [9,6,3]
]
```

Output:

```
[
 [7,4,1],
 [8,5,2],
 [9,6,3]
]
```

---

## Time Complexity

**O(n²)**

- Transposing the matrix takes **O(n²)**.
- Reversing all rows also takes **O(n²)**.

Overall:

```
O(n²)
```

---

## Space Complexity

**O(1)**

- The matrix is modified in-place.
- No additional matrix or auxiliary data structures are used.

---

## Advantages

- Uses constant extra space.
- Simple and elegant implementation.
- Easier to understand and implement than the layer-by-layer rotation approach.
- Satisfies the follow-up requirement of performing the rotation in-place.

---

## Drawbacks

- Applicable specifically to square matrices (`n × n`).

---

## Key Learning

A 90° clockwise rotation can be achieved by combining two simple matrix operations: **transpose** and **reverse each row**. This technique avoids extra space while keeping the implementation clean and efficient, making it the preferred solution in coding interviews.
