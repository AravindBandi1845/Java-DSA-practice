# Approach Explanation (Brute Force - Left Rotation by K)

## Idea
We rotate the array one step at a time, and repeat this process k times.

## Key Concept
A single left rotation shifts all elements one position to the left:
- First element moves to the end
- All other elements shift left by one position

## Algorithm Steps
1. Compute k = k % n to handle large values of k.
2. Repeat the following k times:
   - Store the first element.
   - Shift all elements one step to the left.
   - Place the stored element at the end of the array.

## Code Explanation
We use a helper function to perform a single left rotation.  
This function shifts elements and places the first element at the last position.  
We call this function k times to achieve the final result.

## Example
Input:
nums = [1,2,3,4,5], k = 2

Step 1:
[2,3,4,5,1]

Step 2:
[3,4,5,1,2]

Output:
[3,4,5,1,2]

## Time Complexity
O(n * k)

- Each rotation takes O(n)
- Repeated k times

## Space Complexity
O(1)

## Drawback
This approach is inefficient for large values of k.  
It performs unnecessary repeated work.

## Key Learning
Brute force solutions are useful for understanding the problem,  
but optimization is needed for large inputs.
