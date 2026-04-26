# Approach Explanation (Optimal - Two Pointer)

## Idea
We use the two-pointer technique to merge both sorted arrays while avoiding duplicates.

## Key Concept
Since both arrays are already sorted, we can traverse them simultaneously and build the union in sorted order.

## Algorithm Steps
1. Initialize two pointers:
   - i = 0 for arr1
   - j = 0 for arr2
2. Create an empty list to store the result.
3. Compare elements from both arrays:
   - If arr1[i] <= arr2[j]:
     - Add arr1[i] if it's not already added
     - Move pointer i forward
   - Else:
     - Add arr2[j] if it's not already added
     - Move pointer j forward
4. Add remaining elements from arr1 (if any), skipping duplicates.
5. Add remaining elements from arr2 (if any), skipping duplicates.
6. Convert the list to an array and return it.

## Code Explanation
We mimic the merge step of merge sort.  
We ensure that duplicates are not added by checking the last inserted element.

## Example
Input:
arr1 = [1,2,2,3]  
arr2 = [2,3,4]

Step-by-step:
- Compare 1 and 2 → add 1  
- Compare 2 and 2 → add 2  
- Skip duplicate 2  
- Compare 3 and 3 → add 3  
- Add remaining 4  

Output:
[1,2,3,4]

## Time Complexity
O(n + m)

- n = size of arr1  
- m = size of arr2  

## Space Complexity
O(n + m)

- For storing the result

## Advantage
- Efficient for sorted arrays
- Avoids unnecessary operations
- No need for extra data structures like sets

## Key Learning
Two-pointer technique is powerful for merging and comparison problems.  
This pattern is widely used in array and sorting-related problems.
