# Approach Explanation (Brute Force - Count Frequency for Every Element)

## Idea

The simplest approach is to consider every element as a potential majority element and count how many times it appears in the array.

If its frequency is greater than **⌊n / 3⌋**, add it to the answer list.

To avoid adding duplicate majority elements, check whether the element is already present in the result before inserting it.

---

## Key Concept

- Traverse every element in the array.
- For each element, traverse the array again to count its occurrences.
- If its frequency is greater than **⌊n / 3⌋**, add it to the result (only if it is not already present).
- Continue until every element has been processed.

---

## Algorithm Steps

1. Create an empty list `result`.
2. Traverse the array using index `i`.
3. Initialize a counter to `0`.
4. Traverse the array again using index `j`.
5. If `nums[j] == nums[i]`, increment the counter.
6. After counting, if:
   - `count > n / 3`
   - and the element is not already in `result`,
     add it to the list.
7. Return the result.

---

## Example

Input:

```
nums = [3,2,3]
```

Frequency Count:

```
3 → 2 times
2 → 1 time
```

Since:

```
n = 3
⌊n/3⌋ = 1
```

Only `3` appears more than `1` time.

Output:

```
[3]
```

---

## Another Example

Input:

```
nums = [1,2]
```

```
n = 2
⌊n/3⌋ = 0
```

Both elements appear more than `0` times.

Output:

```
[1,2]
```

---

## Time Complexity

**O(n²)**

- For every element, the entire array is traversed to count its frequency.

---

## Space Complexity

**O(1)**

- Ignoring the output list, only a few variables are used.

---

## Advantages

- Very easy to understand and implement.
- Does not require any additional data structures.

---

## Drawbacks

- Repeatedly counts the same elements.
- Inefficient for large arrays due to quadratic time complexity.

---

## Key Learning

The brute force approach checks every element independently by counting its occurrences in the entire array. Although simple, it performs many redundant computations, motivating the use of a HashMap and the Boyer-Moore Voting Algorithm for more efficient solutions.
