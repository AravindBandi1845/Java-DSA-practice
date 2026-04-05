# Optimal Approach (Using Frequency Count as Key)

## Idea
We group strings by generating a unique key based on the frequency of characters in each string.

## Key Concept
All anagrams have the same character frequency.  
So instead of sorting, we build a frequency array and convert it into a string key.

## Algorithm Steps
1. If input is empty, return an empty list.
2. Create a HashMap<String, List<String>>.
3. For each string:
   - Create a frequency array of size 26.
   - Count occurrences of each character.
4. Build a key string using StringBuilder:
   - Append '#' followed by each count.
5. Use this key in the HashMap:
   - If key not present, create a new list.
   - Add the string to the corresponding list.
6. Return all grouped values.

## Code Explanation
For each string, we calculate the frequency of characters.  
Then we convert this frequency into a unique string format like "#1#0#2...".  

All anagrams produce the same key, so they are grouped together in the HashMap.

## Time Complexity
O(n * k)

- n = number of strings  
- k = length of each string  

## Space Complexity
O(n * k)

## Key Learning
Using frequency as a key avoids sorting and improves performance.  
This approach is optimal because it reduces time complexity compared to sorting-based solutions.
