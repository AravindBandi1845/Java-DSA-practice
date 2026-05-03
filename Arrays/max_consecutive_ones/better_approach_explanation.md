# Approach Explanation (better- Streak Counting)

## Idea
We count consecutive 1's while traversing the array and keep track of the maximum streak.

## Key Concept
- Maintain a running count of consecutive 1's.
- Reset the count when a 0 is encountered.
- Track the maximum count seen so far.

## Algorithm Steps
1. Initialize:
   - currCount = 0
   - maxCount = 0
2. Traverse the array:
   - If nums[i] == 1:
     - Increment currCount
   - Else:
     - Update maxCount = max(maxCount, currCount)
     - Reset currCount = 0
3. After traversal:
   - Return max(maxCount, currCount)

## Code Explanation
We increase the count when we see a 1.  
When a 0 appears, it breaks the streak, so we update the maximum and reset the count.  
A final comparison ensures the last streak is considered.

## Example
Input:
nums = [1,1,0,1,1,1]

Step-by-step:
count → 1 → 2 → reset → 1 → 2 → 3  
max = 3

Output:
3

## Time Complexity
O(n)

## Space Complexity
O(1)

## Advantage
- Simple and clean logic
- Single pass solution
- No extra space required

## Key Learning
This problem introduces the "streak counting" pattern,  
which is useful in many problems involving consecutive elements.
