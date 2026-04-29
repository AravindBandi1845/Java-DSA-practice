# Approach Explanation (Optimal - XOR)

## Idea
We use the XOR operation to cancel out all numbers that appear in both the expected range and the array, leaving only the missing number.

## Key Concept
XOR has two important properties:
- a ^ a = 0
- a ^ 0 = a

If we XOR all numbers from 0 to n and XOR all elements of the array, the duplicate numbers cancel out, leaving the missing number.

## Algorithm Steps
1. Initialize xor = 0.
2. XOR all numbers from 0 to n.
3. XOR all elements in the array.
4. The final result will be the missing number.

## Optimized Version
We can combine both steps into a single loop:
- Initialize xor = n
- For each index i:
  xor = xor ^ i ^ nums[i]

## Code Explanation
We XOR the index and the value together in one loop.  
All matching numbers cancel out, and only the missing number remains.

## Example
Input:
nums = [3,0,1]

n = 3

XOR process:
(0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1)

Cancel pairs:
0^0 = 0  
1^1 = 0  
3^3 = 0  

Remaining:
2

Output:
2

## Time Complexity
O(n)

## Space Complexity
O(1)

## Advantage
- No overflow issues (unlike sum method)
- Efficient and clean
- Constant space

## Key Learning
XOR is a powerful tool for problems involving missing or duplicate elements.  
This pattern is widely used in bit manipulation problems.
