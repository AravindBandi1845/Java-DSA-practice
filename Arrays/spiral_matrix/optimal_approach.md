# Approach Explanation (Optimal - Four Boundary Traversal)

## Idea

The optimal solution traverses the matrix layer by layer using four boundaries instead of maintaining a separate `visited` matrix.

The four boundaries are:

- `top`
- `bottom`
- `left`
- `right`

After traversing one side of the current layer, the corresponding boundary is updated. This process continues until all elements have been visited.

Since every element is visited exactly once and no additional matrix is used, this is the most efficient solution.

---

## Key Concept

The traversal follows a clockwise spiral:

1. Traverse the top row from left to right.
2. Traverse the right column from top to bottom.
3. Traverse the bottom row from right to left.
4. Traverse the left column from bottom to top.

After completing each direction, shrink the corresponding boundary.

Continue until:

```
top > bottom
```

or

```
left > right
```

---

## Algorithm Steps

1. Initialize:
   - `top = 0`
   - `bottom = m - 1`
   - `left = 0`
   - `right = n - 1`

2. While `top <= bottom` and `left <= right`:
   - Traverse the top row.
   - Increment `top`.
   - Traverse the right column.
   - Decrement `right`.
   - If `top <= bottom`, traverse the bottom row.
   - Decrement `bottom`.
   - If `left <= right`, traverse the left column.
   - Increment `left`.

3. Repeat until all boundaries cross.

4. Return the spiral order list.

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

### Step 1

Traverse Top:

```
1 2 3
```

### Step 2

Traverse Right:

```
6 9
```

### Step 3

Traverse Bottom:

```
8 7
```

### Step 4

Traverse Left:

```
4
```

Remaining element:

```
5
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
- The output list is not considered extra space.

---

## Advantages

- Visits every element exactly once.
- Uses constant extra space.
- Works for both square and rectangular matrices.
- Simple and efficient boundary-based traversal.

---

## Drawbacks

- Requires careful boundary updates.
- Missing boundary checks may cause duplicate traversal or index errors.

---

## Why is this Optimal?

- No additional `visited` matrix is required.
- Every cell is processed exactly once.
- Uses only constant extra space.
- This is the standard interview solution for Spiral Matrix.

---

## Key Learning

Instead of tracking visited cells, we can shrink four boundaries after completing each side of the current layer. This allows us to traverse the matrix in spiral order efficiently using **O(m × n)** time and **O(1)** extra space.
