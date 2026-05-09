# Approach Explanation (Optimal - XOR)

## Idea
We use the XOR operation to cancel out duplicate numbers.  
The remaining value will be the single number.

---

## Key Concept
XOR has two important properties:

- a ^ a = 0
- a ^ 0 = a

Since every element appears twice except one:
- Duplicate numbers cancel each other
- The single number remains

---

## Algorithm Steps
1. Initialize xor = 0
2. Traverse the array:
   - xor = xor ^ nums[i]
3. Return xor

---

## Example
Input:
nums = [4,1,2,1,2]

XOR Process:
0 ^ 4 = 4  
4 ^ 1 = 5  
5 ^ 2 = 7  
7 ^ 1 = 6  
6 ^ 2 = 4

Output:
4

---

## Code Explanation
Each duplicate pair cancels out because:
a ^ a = 0

Finally, only the unique element remains.

---

## Time Complexity
O(n)

- Single traversal

---

## Space Complexity
O(1)

- No extra space used

---

## Advantage
- Most optimal solution
- Constant extra space
- Very efficient

---

## Key Learning
XOR is extremely useful in problems involving duplicates, missing elements, or unique values.  
This is one of the most important bit manipulation patterns.
