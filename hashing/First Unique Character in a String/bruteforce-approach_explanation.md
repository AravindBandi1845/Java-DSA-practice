# Approach Explanation

## Idea
The goal is to find the first character in the string that appears only once.

## Brute Force Idea
For every character in the string, we count how many times it appears by comparing it with all other characters.

If a character appears exactly once, we return its index.

## Algorithm Steps
1. Traverse the string using index `i`.
2. For each character `s[i]`, initialize a counter.
3. Traverse the string again using index `j`.
4. If `s[i] == s[j]`, increment the counter.
5. After checking all characters, if the count is equal to 1, return index `i`.
6. If no such character is found, return -1.

## Code Explanation
We use two nested loops.  
The outer loop selects each character, and the inner loop counts how many times that character appears in the string.  
If the count is 1, we return the index of that character.

## Time Complexity
O(n²) because for each character, we traverse the entire string again.

## Space Complexity
O(1) since no extra data structures are used.

## Key Learning
This approach helps in understanding the problem clearly, but it is not efficient for large inputs.  
It can be optimized using HashMap or frequency array.
