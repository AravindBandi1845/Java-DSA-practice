# Optimal Approach

## Idea
We solve this problem using a **frequency array** to count how many times each character appears in the string.

## Why Frequency Array?
Since the string contains only lowercase English letters, we can use an array of size 26 to store the frequency of each character.

This is faster than using a HashMap because array access takes constant time and has no hashing overhead.

## Concept
We first count the frequency of all characters.  
Then, we traverse the string again to find the first character whose frequency is equal to 1.

## Algorithm Steps
1. Initialize an integer array `freq` of size 26.
2. Traverse the string and update frequency using:
   `freq[s.charAt(i) - 'a']++`
3. Traverse the string again.
4. For each character, check if its frequency is equal to 1.
5. If yes, return its index.
6. If no such character exists, return -1.

## Code Explanation
The first loop counts how many times each character appears.  
The second loop checks for the first character whose frequency is exactly 1 and returns its index.

## Time Complexity
O(n)  
We traverse the string twice.

## Space Complexity
O(1)  
The frequency array size is fixed (26), so it does not depend on input size.

## Key Learning
Using a frequency array is more efficient than a HashMap when the input is limited to a fixed character set.  
It reduces overhead and improves performance.
