# Approach Explanation (Using Priority Queue / Min Heap)

## Idea
We use a min heap (priority queue) to keep track of the top k frequent elements.

## Key Concept
Instead of sorting all elements, we maintain a heap of size k.  
The heap always stores the k most frequent elements.

## Algorithm Steps
1. Create a HashMap to store frequency of each element.
2. Create a min heap based on frequency.
3. Traverse the map entries:
   - Add each entry to the heap.
   - If heap size exceeds k, remove the element with smallest frequency.
4. After processing all elements, the heap contains top k frequent elements.
5. Extract elements from the heap and store them in result array.

## Code Explanation
We first count frequencies using a HashMap.  
Then we use a PriorityQueue where elements are ordered by frequency.  
Whenever heap size exceeds k, we remove the least frequent element.  
This ensures that only the k most frequent elements remain in the heap.

## Time Complexity
O(n log k)

- n = number of elements  
- Heap operations take log k time  

## Space Complexity
O(n)

## Key Learning
Using a min heap helps avoid sorting the entire dataset.  
This approach is efficient when k is much smaller than n.
