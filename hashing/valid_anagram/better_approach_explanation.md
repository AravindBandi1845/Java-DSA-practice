# Approach Explanation (Using Two Frequency Arrays)

## Idea
We use two separate frequency arrays to count the occurrences of characters in both strings and then compare them.

## Why This Works
If two strings are anagrams, they must have the same characters with the same frequency.

By counting characters separately and comparing, we can verify this condition.

## Algorithm Steps
1. If lengths of both strings are not equal, return false.
2. Initialize two arrays `arr1` and `arr2` of size 26.
3. Traverse string `s` and increment counts in `arr1`.
4. Traverse string `t` and increment counts in `arr2`.
5. Compare both arrays:
   - If any index has different values, return false.
6. If all values match, return true.

## Code Explanation
We count the frequency of each character in both strings separately.  
Then we compare both frequency arrays index by index.  
If all counts are equal, both strings are anagrams.

## Time Complexity
O(n)

## Space Complexity
O(1)  
(only two arrays of fixed size 26)

## Key Learning
Using two frequency arrays is a clear and understandable approach.  
However, it can be optimized further by using a single array to reduce redundancy.
