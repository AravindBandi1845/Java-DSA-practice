# Approach Explanation (Using Set)

## Idea
We use a Set to remove duplicate elements from the array automatically.

## Key Concept
A Set stores only unique elements.  
Using LinkedHashSet helps preserve the original order of elements.

## Algorithm Steps
1. Create a LinkedHashSet.
2. Traverse the array and add each element to the set.
   - Duplicate elements are automatically ignored.
3. Traverse the set and copy elements back into the array.
4. Return the size of the set as the number of unique elements.

## Code Explanation
We iterate through the array and insert elements into the set.  
Since sets do not allow duplicates, only unique elements are stored.  
We then copy these elements back into the original array.

## Example
Input:
nums = [1,1,2]

Set:
[1,2]

Array after update:
[1,2,_]

Output:
2

## Time Complexity
O(n)

## Space Complexity
O(n)

## Drawback
This approach uses extra space, which violates the in-place requirement of the problem.

## Key Learning
Using a Set simplifies duplicate removal but is not optimal for in-place constraints.  
A two-pointer approach can solve this problem with O(1) space.
