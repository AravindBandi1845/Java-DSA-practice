# Approach Explanation (Brute Force - Using Set)

## Idea
We use a Set to collect all unique elements from both arrays and then sort the result.

## Key Concept
- A Set stores only unique elements.
- By inserting elements from both arrays into a set, duplicates are automatically removed.

## Algorithm Steps
1. Create a HashSet.
2. Insert all elements from the first array.
3. Insert all elements from the second array.
4. Convert the set into an array.
5. Sort the array to maintain increasing order.
6. Return the result.

## Code Explanation
We first add elements from both arrays into the set.  
Since sets do not allow duplicates, only unique elements remain.  
Then, we convert the set to an array and sort it to ensure correct order.

## Example
Input:
arr1 = [1,2,3,4,5]  
arr2 = [1,2,3]

Set:
[1,2,3,4,5]

Output:
[1,2,3,4,5]

## Time Complexity
O(n + m + k log k)

- n = size of arr1  
- m = size of arr2  
- k = size of set  
- Sorting takes O(k log k)

## Space Complexity
O(n + m)

- Extra space used for storing elements in the set

## Drawback
- Uses extra space
- Sorting step adds extra time
- Does not take advantage of sorted arrays

## Key Learning
Using a Set is an easy way to remove duplicates,  
but not the most efficient approach for already sorted arrays.  
A two-pointer technique can solve this more efficiently.
