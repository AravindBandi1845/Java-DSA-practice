# Approach Explanation (Brute Force - Generate All Permutations)

## Idea

Generate every possible permutation of the given array using recursion and backtracking.

After generating all permutations:
- Sort them in lexicographical order.
- Find the current permutation.
- Replace it with the next permutation.
- If the current permutation is the last one, replace it with the first permutation.

---

## Key Concept

- Every arrangement of the array is generated.
- Sorting ensures the permutations are in lexicographical order.
- The next permutation is simply the next element in the sorted list.

---

## Algorithm Steps

1. Generate all possible permutations using recursion.
2. Store every permutation in a list.
3. Sort the list lexicographically.
4. Convert the current array into a list.
5. Traverse the sorted permutations:
   - If the current permutation is found:
     - Copy the next permutation into the original array.
     - If it is the last permutation, copy the first permutation.
6. Return the modified array.

---

## Example

Input:

nums = [1,2,3]

Generated permutations:

[1,2,3]

[1,3,2]

[2,1,3]

[2,3,1]

[3,1,2]

[3,2,1]

Current permutation:

[1,2,3]

Next permutation:

[1,3,2]

Output:

[1,3,2]

---

## Time Complexity

O(n! × n)

- Generating all permutations takes O(n!).
- Copying each permutation requires O(n).
- Sorting all permutations further increases the running time.

---

## Space Complexity

O(n! × n)

- Stores every possible permutation.

---

## Advantage

- Easy to understand.
- Clearly demonstrates the concept of lexicographical ordering.

---

## Drawback

- Extremely inefficient.
- Not suitable for large inputs.
- Exponential time and space complexity.

---

## Key Learning

Generating all permutations is useful for understanding the problem, but it is impractical for interview-sized inputs. The optimal solution avoids generating all permutations by directly finding the next lexicographical arrangement in linear time.
