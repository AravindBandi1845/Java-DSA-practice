##  Optimal Approach (One Pass)

### Idea
Track the largest and second largest elements in a single traversal.

### Steps
1. Initialize:
   - largest = Integer.MIN_VALUE
   - secondLargest = Integer.MIN_VALUE
2. Traverse the array:
   - If current element > largest:
     - secondLargest = largest
     - largest = current element
   - Else if current element < largest AND current element > secondLargest:
     - secondLargest = current element
3. If secondLargest remains unchanged, return -1.

### Example
Input:
nums = [10, 20, 4, 45, 99]

| Element | Largest | Second Largest |
|--------|--------|----------------|
| 10     | 10     | -∞             |
| 20     | 20     | 10             |
| 4      | 20     | 10             |
| 45     | 45     | 20             |
| 99     | 99     | 45             |

Output:
45

### Time Complexity
O(n)

### Space Complexity
O(1)

### Key Insight
No need to sort. We can find the answer in one pass by maintaining two variables.

---

## Final Comparison

| Approach | Time | Space |
|--------|------|------|
| Brute Force (Sorting) | O(n log n) | O(1) |
| Optimal (One Pass) | O(n) | O(1) |

---

## Key Learning
Using a single pass with two variables is more efficient than sorting.  
This is a common pattern used in many array problems.
