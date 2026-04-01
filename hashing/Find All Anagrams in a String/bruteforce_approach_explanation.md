# Approach Explanation (Brute Force)

## Idea
We check every substring of length equal to string `p` and verify if it is an anagram.

## Key Concept
If two strings have the same frequency of characters, they are anagrams.

## Algorithm Steps
1. If length of s is less than p, return empty list.
2. Compute frequency array for string p.
3. For each index i from 0 to (m - n):
   - Create a new frequency array for the substring of s.
   - Count characters for substring s[i...i+n-1].
   - Compare both frequency arrays.
4. If equal, add index to result list.

## Code Explanation
For every possible window, we build a fresh frequency array and compare it with p's frequency.  
If both match, the substring is an anagram.

## Time Complexity
O((m - n) * n)

## Space Complexity
O(1)

## Key Learning
Recomputing frequency for every window is inefficient.  
We can optimize this using a sliding window technique.
