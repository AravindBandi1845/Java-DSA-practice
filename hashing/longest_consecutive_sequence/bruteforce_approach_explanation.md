# Approach Explanation

## Idea
The goal is to find the length of the longest sequence of consecutive numbers in the array.

## Brute Force Idea
For each element in the array, we try to build a consecutive sequence by checking if the next number (current + 1) exists in the array.

We keep increasing the sequence length as long as the next number is found.

## Algorithm Steps
1. If the array is empty, return 0.
2. Traverse each element in the array.
3. For each element, initialize:
   - current = nums[i]
   - streak = 1
4. While (current + 1) exists in the array:
   - Increment current
   - Increment streak
5. Update the longest streak using max function.
6. After checking all elements, return the longest value.

## Code Explanation
For every element, we try to extend the sequence forward by checking if the next number exists.  
This is done using a helper function that scans the array.  
We keep track of the maximum length found.

## Time Complexity
O(n²)  
Because for each element, we may scan the entire array again.

## Space Complexity
O(1)  
No extra space is used.

## Key Learning
This brute force approach is simple but inefficient.  
It helps understand the problem, but repeated searching makes it slow.  
We can optimize it using a HashSet in the next approach.
