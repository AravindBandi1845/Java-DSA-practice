# Better Approach (Using HashSet)

## Idea
We use a HashSet to store all elements of the array so that we can quickly check whether a number exists or not.

## Why HashSet?
A HashSet allows O(1) average time complexity for search operations.  
This helps us efficiently check if a number is present in the array.

## Concept
We insert all elements into the HashSet.  
Then, starting from 1, we check whether the number exists in the set.

The first number that is not found in the set is the smallest missing positive.

## Algorithm Steps
1. Initialize a HashSet.
2. Traverse the array and insert all elements into the set.
3. Start checking from i = 1.
4. While the set contains i, increment i.
5. Return i as the smallest missing positive number.

## Code Explanation
The first loop adds all elements of the array into the HashSet.  
The while loop checks for the smallest positive integer starting from 1 that is not present in the set.

## Time Complexity
O(n)  
Each element is inserted once, and lookups take constant time.

## Space Complexity
O(n)  
We use a HashSet to store all elements.

## Key Learning
Using a HashSet improves the time complexity compared to brute force.  
However, it uses extra space, so it is not the most optimal solution.
