# Approach Explanation (Optimal - Pivot, Successor & Reverse)

## Idea

Instead of generating all permutations, directly compute the next lexicographically greater permutation.

The algorithm works in three steps:

1. Find the first index from the right where the sequence starts decreasing (pivot).
2. Find the smallest element greater than the pivot on its right side and swap them.
3. Reverse the suffix after the pivot to obtain the smallest possible arrangement.

This guarantees the immediate next lexicographical permutation.

---

## Key Concept

- The suffix after the pivot is always in descending order.
- Swapping the pivot with the next larger element creates a larger permutation.
- Reversing the suffix converts it into ascending order, producing the smallest possible permutation greater than the current one.

---

## Algorithm Steps

1. Traverse from right to left to find the first index `i` such that:

   ```
   nums[i] < nums[i + 1]
   ```

   This index is called the **pivot**.

2. If no pivot exists:

   - The array is in descending order.
   - Reverse the entire array.
   - Return.

3. Traverse from the end of the array to find the first element greater than `nums[pivot]`.

4. Swap the pivot with that element.

5. Reverse the subarray from `pivot + 1` to the end.

6. The array now represents the next lexicographical permutation.

---

## Example

Input:

```
nums = [1,2,3]
```

### Step 1

Pivot:

```
1 2 3
    ^
```

(index = 1)

### Step 2

Find the next greater element from the right:

```
3
```

Swap:

```
1 3 2
```

### Step 3

Reverse the suffix after the pivot.

The suffix contains only one element, so the array remains:

```
[1,3,2]
```

Output:

```
[1,3,2]
```

---

### Another Example

Input:

```
nums = [3,2,1]
```

No pivot exists because the array is completely decreasing.

Reverse the entire array:

```
[1,2,3]
```

---

## Time Complexity

**O(n)**

- Finding the pivot → O(n)
- Finding the successor → O(n)
- Reversing the suffix → O(n)

Overall:

```
O(n)
```

---

## Space Complexity

**O(1)**

- The rearrangement is performed in-place.

---

## Why is this Optimal?

- Generates the next permutation without enumerating all possibilities.
- Uses only constant extra space.
- Performs a single traversal and one reversal.
- Meets all problem constraints.

---

## Key Learning

The Next Permutation algorithm relies on the observation that the suffix after the pivot is already in descending order. By swapping the pivot with the next larger element and reversing the suffix, we obtain the smallest lexicographically greater permutation in linear time.
