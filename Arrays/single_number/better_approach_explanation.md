# Approach Explanation (Better - HashMap)

## Idea
We use a HashMap to store the frequency of each element.  
The number with frequency 1 is the single number.

---

## Key Concept
- Store each number and its count in a HashMap.
- Traverse the map to find the element that appears only once.

---

## Algorithm Steps
1. Create a HashMap<Integer, Integer>.
2. Traverse the array:
   - Increment frequency for each number.
3. Traverse the map entries:
   - If frequency == 1:
     - Return that number.

---

## Example
Input:
nums = [4,1,2,1,2]

Frequency Map:
4 → 1  
1 → 2  
2 → 2  

Single Number:
4

Output:
4

---

## Time Complexity
O(n)

- One traversal for storing frequencies
- One traversal for checking frequencies

---

## Space Complexity
O(n)

- Extra HashMap used

---

## Advantage
- Faster than brute force
- Easy to understand

---

## Drawback
- Uses extra space
- Not the most optimal solution

---

## Key Learning
Hashing is very useful for frequency-based problems.  
Many array problems become easier using HashMap or HashSet.
