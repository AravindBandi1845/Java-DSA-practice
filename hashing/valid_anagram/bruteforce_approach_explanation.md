# Approach Explanation (Sorting)

## Idea
We convert both strings into character arrays, sort them, and then compare the sorted arrays.

## Why Sorting Works
If two strings are anagrams, they will have the same characters in the same order after sorting.

## Algorithm Steps
1. If lengths are not equal, return false.
2. Convert both strings to character arrays.
3. Sort both arrays.
4. Compare both arrays.
5. If equal, return true; otherwise, return false.

## Code Explanation
Sorting rearranges characters in a consistent order.  
If both sorted arrays match, it means both strings contain the same characters with the same frequency.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

## Key Learning
Sorting provides a simple way to solve anagram problems but is not optimal.  
A frequency array approach improves the time complexity to O(n).
