# Approach Explanation

##Brute Force Approach (Sorting)

### Idea
Sort the array and pick the second largest distinct element.

### Steps
1. Sort the array in ascending order.
2. The last element is the largest.
3. Traverse from the second last element backwards.
4. Return the first element that is not equal to the largest.

### Example
Input:
nums = [10, 20, 4, 45, 99]

Sorted:
[4, 10, 20, 45, 99]

Largest = 99  
Second Largest = 45

### Time Complexity
O(n log n)

### Space Complexity
O(1)

### Drawback
Sorting the entire array is unnecessary just to find two values.
