# Approach Explanation (Optimal - Extended Boyer-Moore Voting Algorithm)

## Idea

An element must appear more than `n / 3` times to be considered a majority element.

There can be at most **two** such elements.

Why?

If three different elements each appeared more than `n / 3` times, their total frequency would be greater than `n`, which is impossible.

Therefore, we only need to maintain two possible candidates and their counts.

---

## Key Concept

Use the Extended Boyer-Moore Voting Algorithm with:

- `candidate1` and `count1`
- `candidate2` and `count2`

### During the first pass:

- If the current number equals `candidate1`, increment `count1`.
- Else if it equals `candidate2`, increment `count2`.
- Else if `count1 == 0`, make it `candidate1`.
- Else if `count2 == 0`, make it `candidate2`.
- Otherwise, decrement both counts.

This eliminates groups of three different elements.

However, the remaining candidates are only **potential candidates**, so their actual frequencies must be verified.

---

## Algorithm Steps

### Step 1: Find Two Candidates

Traverse the array and maintain two candidates and their counts.

For every element:

1. If it equals `candidate1`, increment `count1`.
2. Else if it equals `candidate2`, increment `count2`.
3. Else if `count1 == 0`, assign it to `candidate1` and set `count1 = 1`.
4. Else if `count2 == 0`, assign it to `candidate2` and set `count2 = 1`.
5. Otherwise, decrement both `count1` and `count2`.

---

### Step 2: Verify Candidates

The voting process only identifies possible candidates.

Traverse the array again and count the actual occurrences of:

- `candidate1`
- `candidate2`

Add a candidate to the result if its frequency is greater than `n / 3`.

---

## Example

Input:

```text
nums = [3,2,3]
