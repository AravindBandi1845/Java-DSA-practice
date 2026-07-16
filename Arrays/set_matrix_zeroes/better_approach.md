# Approach Explanation (Better - Auxiliary Arrays)

## Idea

In the brute-force approach, we updated the matrix immediately with a placeholder, which led to repeated traversals. 

To optimize this, we can use two tracking arrays:
1. `rowMarker` of size `m` (to track which rows should become all `0`s)
2. `colMarker` of size `n` (to track which columns should become all `0`s)

By scanning the matrix once, we can mark the respective positions in our tracking arrays. In a second pass, we use these markers to update the original matrix. This works perfectly for all integer values, including negative numbers!

---

## Key Concept

- Initialize `rowMarker` array of size `m` with `0`.
- Initialize `colMarker` array of size `n` with `0`.
- Loop through the matrix. If `matrix[i][j] == 0`:
  - Set `rowMarker[i] = 1`
  - Set `colMarker[j] = 1`
- Loop through the matrix a second time. If `rowMarker[i] == 1` or `colMarker[j] == 1`, set `matrix[i][j] = 0`.

---

## Algorithm Steps

1. Create a `row` array of size `m` and a `col` array of size `n`, both initialized to `0`.
2. Traverse the entire matrix using two nested loops (`i` from `0` to `m-1`, `j` from `0` to `n-1`):
   - If `matrix[i][j]` is `0`, mark `row[i] = 1` and `col[j] = 1`.
3. Traverse the matrix a second time:
   - For every cell `(i, j)`, if `row[i] == 1` OR `col[j] == 1`, set `matrix[i][j] = 0`.
4. The matrix is now updated in-place.

---

## Example

Input:[
[1, 1, 1],
[1, 0, 1],
[1, 1, 1]
]


1. **Step 1: Initialize Markers**
   - `rowMarker` = `[0, 0, 0]`
   - `colMarker` = `[0, 0, 0]`

2. **Step 2: Scan Matrix**
   - At `(1, 1)`, we find a `0`.
   - Update: `rowMarker[1] = 1`, `colMarker[1] = 1`.
   - `rowMarker` becomes `[0, 1, 0]`
   - `colMarker` becomes `[0, 1, 0]`

3. **Step 3: Update Matrix**
   - We check each cell. If its row index has a `1` in `rowMarker` OR its column index has a `1` in `colMarker`, we turn it to `0`.

Output:
[
[1, 0, 1],
[0, 0, 0],
[1, 0, 1]
]


---

## Complexity Analysis

### Time Complexity: **O(m × n)**
- We traverse the matrix exactly twice. 
- First pass: $O(m \times n)$ to populate the marker arrays.
- Second pass: $O(m \times n)$ to update the matrix.
- Total Time: $O(2 \times (m \times n)) = O(m \times n)$.

### Space Complexity: **O(m + n)**
- We use an extra array of size `m` for row tracking and an array of size `n` for column tracking.

---

## Advantages
- **Highly Efficient:** Dramatically faster than the brute-force approach.
- **Safe:** Works for all integer inputs, resolving the negative number limitation of the temporary marker approach.

## Drawbacks
- Uses $O(m + n)$ extra space, which does not satisfy the strict follow-up constraint of **constant extra space O(1)**.
