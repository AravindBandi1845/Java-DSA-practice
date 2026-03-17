# Optimal Approach

## Idea
We solve this problem using a **HashMap** to store elements and their indices while traversing the array.

## Why HashMap?
A HashMap allows us to store elements with their indices and perform **fast lookups (O(1))**.  
This helps us quickly check if the required complement exists.

## Concept
Instead of checking all pairs, we calculate the **required value** for each element:

required = target - nums[i]

If this required value already exists in the HashMap, we have found our answer.

## Algorithm Steps
1. Initialize a HashMap to store (number → index).
2. Traverse the array.
3. For each element, calculate `required = target - nums[i]`.
4. Check if the required value exists in the HashMap.
5. If yes, return the indices.
6. Otherwise, store the current element and its index in the HashMap.
7. Continue until the solution is found.

## Code Explanation
While iterating through the array, we check if the complement of the current element is already present in the HashMap.  
If it is present, we return the stored index and current index.  
Otherwise, we store the current element in the map for future reference.

## Time Complexity
O(n)  
Each element is processed only once.

## Space Complexity
O(n)  
Because we store elements in the HashMap.

## Key Learning
Using a HashMap helps reduce time complexity from O(n²) to O(n) by avoiding unnecessary comparisons.
