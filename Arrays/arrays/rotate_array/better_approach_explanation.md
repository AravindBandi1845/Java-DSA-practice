# Approach Explanation (Better - Extra Array)

## Idea
We use an additional array to rearrange elements after rotating the array by k positions to the left.

## Key Concept
A left rotation moves the first k elements to the end of the array, while shifting the remaining elements to the front.

Original:
[ first k elements ] [ remaining elements ]

After rotation:
[ remaining elements ] [ first k elements ]

## Algorithm Steps
1. Compute k = k % n to handle large values of k.
2. Create a temporary array of size n.
3. Copy elements from index k to n-1 into the beginning of temp.
4. Copy the first k elements into the end of temp.
5. Copy all elements from temp back to the original array.

## Code Explanation
We divide the array into two parts:
- Elements from k to n-1
- Elements from 0 to k-1

We first copy the second part to the beginning of the temp array,  
then append the first part at the end.  
Finally, we overwrite the original array with the temp array.

## Example
Input:
nums = [1,2,3,4,5,6,7], k = 3

Step 1:
Copy [4,5,6,7] → temp = [4,5,6,7,_,_,_]

Step 2:
Copy [1,2,3] → temp = [4,5,6,7,1,2,3]

Output:
[4,5,6,7,1,2,3]

## Time Complexity
O(n)

## Space Complexity
O(n)

## Key Learning
Using an extra array simplifies the rotation process and improves time complexity compared to brute force.  
However, it is not optimal due to additional space usage.  
The reversal algorithm can achieve the same result in O(1) space.
