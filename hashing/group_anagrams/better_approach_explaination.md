# Approach Explanation (Using Sorting as Key)

## Idea
We group strings by converting each string into a sorted form and using it as a key in a HashMap.

## Key Concept
All anagrams will have the same sorted representation.

Example:
- "eat", "tea", "ate" → "aet"

## Algorithm Steps
1. Create a HashMap<String, List<String>>.
2. Traverse each string in the array:
   - Convert the string to a character array.
   - Sort the character array.
   - Convert it back to a string (sorted key).
3. Use the sorted string as a key:
   - If key is not present, create a new list.
   - Add the original string to the list.
4. Return all values of the HashMap.

## Code Explanation
We convert each string into a sorted form.  
Since all anagrams share the same sorted order, they will map to the same key in the HashMap.  
This allows us to group them efficiently.

## Time Complexity
O(n * k log k)

- n = number of strings  
- k = length of each string  
- Sorting takes O(k log k)

## Space Complexity
O(n * k)

## Key Learning
Sorting is a simple and intuitive way to group anagrams.  
However, it is not the most optimal approach due to sorting overhead.  
Using a frequency-based key can improve performance.
