# Approach Explanation (Brute Force)

## Idea
We compare each string with every other string to check if they are anagrams and group them together.

## Key Concept
Two strings are anagrams if they have the same frequency of characters.

## Algorithm Steps
1. Create a result list and a visited array.
2. Traverse each string:
   - If already visited, skip it.
3. For each unvisited string:
   - Create a new group.
   - Compute its frequency.
4. Compare it with remaining strings:
   - If frequencies match, add to group and mark visited.
5. Add the group to result.

## Code Explanation
We use a helper function to compute frequency of characters.  
Then we compare frequency arrays using `Arrays.equals()` to check for anagrams.

## Time Complexity
O(n² * k)

## Space Complexity
O(n)

## Key Learning
Comparing every pair is inefficient.  
We can optimize this using a HashMap to group anagrams efficiently.
