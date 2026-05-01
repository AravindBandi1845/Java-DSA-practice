# Approach Explanation

##Brute Force (Nested Loop)

### Idea
For every index, count how many consecutive 1's start from that position.

### Algorithm Steps
1. Traverse the array using index i.
2. For each i, start another loop from j = i.
3. Count consecutive 1's until a 0 is found.
4. Track the maximum count.

### Example
nums = [1,1,0,1]

i = 0 → count = 2  
i = 1 → count = 1  
i = 2 → count = 0  
i = 3 → count = 1  

Max = 2

### Time Complexity
O(n²)

### Space Complexity
O(1)

### Drawback
- Recomputes the same sequences multiple times  
- Inefficient for large arrays  

- No unnecessary computations

---

## Key Learning
This problem introduces the "streak counting" pattern.  
It is commonly used in problems involving consecutive elements in arrays.
