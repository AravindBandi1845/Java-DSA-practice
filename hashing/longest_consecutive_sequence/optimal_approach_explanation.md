# Optimal Approach (Using HashSet)

## Idea
We use a HashSet to store all elements and efficiently check the presence of consecutive numbers.

## Key Insight
We only start counting a sequence when the current number is the **start of a sequence**, i.e., when (num - 1) is not present in the set.

## Why This Works
If a number has a previous number in the set, it means it is part of an existing sequence, so we skip it to avoid duplicate work.

## Algorithm Steps
1. If the array is empty, return 0.
2. Insert all elements into a HashSet.
3. Traverse each element in the set.
4. For each number:
   - Check if (num - 1) is not present.
   - If not present, it is the start of a sequence.
5. Count the length of the sequence by checking (num + 1), (num + 2), etc.
6. Update the longest sequence length.
7. Return the longest value.

## Code Explanation
We first store all elements in a HashSet for fast lookup.  
Then, we iterate through the set and only start counting when we find the beginning of a sequence.  
This avoids repeated counting and ensures linear time complexity.

## Time Complexity
O(n)  
Each element is processed at most once.

## Space Complexity
O(n)  
We store elements in a HashSet.

## Key Learning
Avoid unnecessary work by identifying the starting point of a sequence.  
This optimization reduces time complexity from O(n²) or O(n log n) to O(n).
