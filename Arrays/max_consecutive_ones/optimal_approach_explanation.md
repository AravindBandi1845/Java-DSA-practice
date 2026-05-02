# Approach Explanation (Optimal - Sliding Window Style)

## Idea
We treat consecutive 1s as a window.  
When a 0 appears, we reset the window.

## Key Concept
- Use two pointers (left and right)
- Expand window when element is 1
- Reset window when element is 0

## Algorithm Steps
1. Initialize left = 0 and maxLength = 0
2. Traverse array using right pointer:
   - If nums[right] == 0:
     - Move left to right + 1
   - Calculate window length = right - left + 1
   - Update maxLength
3. Return maxLength

## Example
Input:
nums = [1,1,0,1,1,1]

Step-by-step:
right = 0 → window = [1] → length = 1  
right = 1 → window = [1,1] → length = 2  
right = 2 → reset → left = 3  
right = 3 → window = [1] → length = 1  
right = 4 → window = [1,1] → length = 2  
right = 5 → window = [1,1,1] → length = 3  

Output:
3

## Time Complexity
O(n)

## Space Complexity
O(1)

## Advantage
- Single pass
- Clean logic
- Extensible to sliding window problems

## Key Learning
This pattern is a simplified version of sliding window.  
It builds the foundation for more complex window-based problems.
