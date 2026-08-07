# Approach Explanation (Better - HashMap Frequency Counting)

## Idea

Instead of counting the frequency of every element repeatedly, use a **HashMap** to store the frequency of each element while traversing the array only once.

After building the frequency map, traverse the map and collect all elements whose frequency is greater than **⌊n / 3⌋**.

This eliminates redundant counting and improves the time complexity to linear time.

---

## Key Concept

- Create a `HashMap<Integer, Integer>` to store the frequency of each element.
- Traverse the array once and update the frequency of every element.
- Traverse the HashMap entries.
- If an element's frequency is greater than **⌊n / 3⌋**, add it to the answer list.

---

## Algorithm Steps

1. Create an empty HashMap.
2. Traverse the array.
3. For every element:
   - Increase its frequency in the HashMap.
4. Create an empty result list.
5. Traverse all entries of the HashMap.
6. If an element's frequency is greater than `n / 3`, add it to the result.
7. Return the result.

---

## Example

Input:

```
nums = [3,2,3]
```

Frequency Map:

```
3 → 2
2 → 1
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

Frequency Map:

```
1 → 1
2 → 1
```

Since:

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

**O(n)**

- One traversal to build the frequency map.
- One traversal of the HashMap to find majority elements.

Overall:

```
O(n)
```

---

## Space Complexity

**O(n)**

- The HashMap stores the frequency of each distinct element.

---

## Advantages

- Eliminates repeated frequency counting.
- Efficient linear-time solution.
- Simple and easy to implement.

---

## Drawbacks

- Uses extra space proportional to the number of distinct elements.
- Does not satisfy the follow-up requirement of **O(1)** extra space.

---

## Key Learning

Using a HashMap allows us to compute the frequency of every element in a single traversal, reducing the time complexity from **O(n²)** to **O(n)**. This serves as a stepping stone to the **Extended Boyer-Moore Voting Algorithm**, which further optimizes the space complexity to **O(1)**.
