# Approach Explanation (Better - Layer by Layer Rotation)

## Idea

Instead of using an extra matrix, rotate the image one layer at a time.

Each layer is treated like a square boundary. For every position in the current layer, perform a four-way cyclic swap among the top, left, bottom, and right elements.

This rotates the matrix in-place without requiring an additional matrix.

---

## Key Concept

The matrix consists of multiple square layers.

For each layer:

- Save the top element.
- Move the left element to the top.
- Move the bottom element to the left.
- Move the right element to the bottom.
- Place the saved top element on the right.

Repeat this process for every element of every layer.

---

## Algorithm Steps

1. Traverse each layer from the outermost layer to the innermost.
2. For every element in the current layer:
   - Store the top element.
   - Move left → top.
   - Move bottom → left.
   - Move right → bottom.
   - Move stored top → right.
3. Continue until every layer has been rotated.

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

After rotating the outer layer:

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

- Every element is moved exactly once.

---

## Space Complexity

**O(1)**

- Rotation is performed in-place.

---

## Advantages

- No extra matrix is required.
- Performs the rotation directly in-place.

---

## Drawbacks

- The implementation is more complex because it involves multiple index calculations and four-way swaps.
- Less intuitive than the transpose-and-reverse method.

---

## Key Learning

A matrix can be rotated by processing one square layer at a time. Each rotation consists of a four-way cyclic swap, allowing the image to be rotated in-place with constant extra space.
