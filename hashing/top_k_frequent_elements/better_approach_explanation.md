# Approach Explanation (Sorting Based)

## Idea
We count the frequency of each element and then sort them based on frequency.

## Key Concept
Elements with higher frequency should come first.

## Algorithm Steps
1. Create a HashMap to store frequency of elements.
2. Convert map entries into a list.
3. Sort the list based on frequency.
4. Pick the top k elements from the sorted list.
5. Return the result.

## Code Explanation
We first count how many times each number appears.  
Then we sort the entries based on frequency and pick the most frequent elements.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

## Key Learning
Sorting works but is inefficient.  
We can optimize using a Heap or Bucket Sort to reduce time complexity.
