# Approach Explanation (Brute Force - Extra Matrix)

## Idea

Instead of modifying the original matrix directly, create a new matrix of the same size to store the rotated image.

For every element in the original matrix, calculate its new position after a 90° clockwise rotation and place it in the new matrix.

Finally, copy all elements from the new matrix back into the original matrix.

---

## Key Concept

For a matrix of size `n × n`, every element at position:

```
(i, j)
```

moves to:

```
(j, n - 1 - i)
```

This mapping correctly rotates the matrix by **90° clockwise**.

---

## Algorithm Steps

1. Create a new matrix `rotated` of size `n × n`.
2. Traverse every element of the original matrix.
3. For each element `matrix[i][j]`, place it at:
   ```
   rotated[j][n - 1 - i] = matrix[i][j]
   ```
4. Traverse the `rotated` matrix.
5. Copy every element back into the original matrix.
6. The original matrix is now rotated by 90° clockwise.

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

After filling the `rotated` matrix:

```
[
 [7,4,1],
 [8,5,2],
 [9,6,3]
]
```

Copy the elements back into the original matrix.

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

- First traversal fills the new matrix.
- Second traversal copies the elements back.

Overall:

```
O(n²)
```

---

## Space Complexity

**O(n²)**

- An additional `n × n` matrix is used.

---

## Advantages

- Easy to understand and implement.
- Directly follows the rotation mapping.
- Avoids modifying the original matrix while processing.

---

## Drawbacks

- Uses an extra matrix of size `n × n`.
- Does not satisfy the follow-up requirement of performing the rotation in-place.

---

## Key Learning

Using an auxiliary matrix simplifies the rotation process by allowing each element to be placed directly in its rotated position. Although this approach requires extra space, it clearly demonstrates the coordinate transformation used for a 90° clockwise rotation.
