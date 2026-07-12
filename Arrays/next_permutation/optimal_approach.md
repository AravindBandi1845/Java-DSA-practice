# Approach Explanation (Optimal - Pivot, Successor & Reverse)

## Idea

Instead of generating all possible permutations, directly find the next lexicographically greater permutation by modifying the array in-place.

The algorithm consists of three steps:

1. Find the pivot (the first decreasing element from the right).
2. Find the successor (the smallest element greater than the pivot on its right).
3. Swap them and reverse the remaining suffix.

This produces the immediate next permutation in lexicographical order.

---

## Key Concept

The array can be divided into two parts:

- Prefix
- Suffix

The suffix is always in descending order.

By swapping the pivot with the next greater element and reversing the suffix, we obtain the smallest permutation greater than the current one.

---

## Algorithm Steps

1. Traverse the array from right to left to find the first index `idx` such that:

   ```
   nums[idx] < nums[idx + 1]
   ```

   This index is called the **pivot**.

2. If no such index exists:

   - The array is the largest possible permutation.
   - Reverse the entire array.
   - Return.

3. Starting from the end of the array, find the first element greater than `nums[idx]`.

4. Swap that element with the pivot.

5. Reverse the subarray from `idx + 1` to the end.

6. The array now represents the next lexicographical permutation.

---

## Example

Input:

```
nums = [1,2,3]
```

### Step 1: Find Pivot

```
1 2 3
  ^
```

Pivot = 2

---

### Step 2: Find Successor

```
3
```

Swap:

```
1 3 2
```

---

### Step 3: Reverse Suffix

Suffix contains only one element.

Final Answer:

```
[1,3,2]
```

---

### Another Example

Input:

```
nums = [1,3,2]
```

Pivot:

```
1 3 2
^
```

Successor:

```
2
```

Swap:

```
2 3 1
```

Reverse suffix:

```
[2,1,3]
```

---

### Descending Order Case

Input:

```
[3,2,1]
```

No pivot exists.

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

- The array is modified in-place without using any extra data structures.

---

## Why is this Optimal?

- Processes the array in linear time.
- Uses constant extra memory.
- Produces the immediate next lexicographical permutation without generating all permutations.

---

## Key Learning

The Pivot → Successor → Reverse technique is a classic algorithm for permutation problems. By identifying the first decreasing element from the right, swapping it with the next greater element, and reversing the suffix, we efficiently compute the next permutation in-place.
