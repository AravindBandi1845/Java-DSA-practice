# Optimal Approach

## Idea
We solve this problem using a **Sliding Window technique along with a HashSet**.

## Why HashSet?
A HashSet is a data structure that stores **unique elements** and allows **O(1) average time complexity** for insertion, deletion, and lookup.  
This helps us quickly check whether an element already exists in the current window.

## Sliding Window Concept
The problem requires the index difference between two equal elements to be **less than or equal to k**.

To maintain this constraint, we keep a **sliding window of size k**.  
The window stores the last **k elements** we have seen.

If the current element already exists in the window, it means we found two equal elements whose index difference is **≤ k**, so we return **true**.

If the window size becomes greater than **k**, we remove the element that falls outside the window.

## Algorithm Steps
1. Initialize a **HashSet** called `window`.
2. Traverse the array using a loop.
3. If the current element already exists in the HashSet, return **true**.
4. Otherwise, add the element to the HashSet.
5. If the window size becomes greater than **k**, remove the element `nums[i - k]` from the HashSet.
6. Continue this process until the end of the array.
7. If no valid pair is found, return **false**.

## Code Explanation
We maintain a HashSet that represents the current sliding window.  
While iterating through the array, we check if the current element already exists in the set.  
If it does, it means a duplicate exists within the allowed distance **k**.  
Otherwise, we add the element to the set and adjust the window size if necessary.

## Time Complexity
O(n)  
Each element is added and removed from the HashSet at most once.

## Space Complexity
O(k)  
Because the HashSet stores at most **k elements** at any time.

## Key Learning
This problem helped me understand how **HashSet combined with Sliding Window** can efficiently solve problems that involve checking elements within a limited index range.
