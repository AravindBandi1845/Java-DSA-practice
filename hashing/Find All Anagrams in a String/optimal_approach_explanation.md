# Optimal Approach (Sliding Window + Frequency Array)

## Idea
We use a sliding window of size equal to string `p` and maintain a frequency array for the current window.

## Key Concept
Instead of recomputing frequency for every substring, we update the window dynamically by:
- Adding the new character
- Removing the old character

## Algorithm Steps
1. If length of s is less than p, return empty list.
2. Create two frequency arrays:
   - `pcount` for string p
   - `wcount` for current window in s
3. Fill `pcount` using characters of p.
4. Traverse string s:
   - Add current character to `wcount`
   - If window size exceeds n, remove the leftmost character
   - If window size equals n:
     - Compare `pcount` and `wcount`
     - If equal, add starting index to result

## Code Explanation
We maintain a sliding window of size `n`.  
At each step, we update the frequency array by adding the current character and removing the character that goes out of the window.  
This avoids recomputing frequencies from scratch.

## Time Complexity
O(m)

## Space Complexity
O(1)

## Key Learning
Sliding window helps optimize problems involving fixed-size substrings.  
By updating the window incrementally, we reduce time complexity significantly from O(n²) to O(n).
