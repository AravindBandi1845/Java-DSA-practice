# Approach Explanation

## Idea
We solve this problem by first sorting the array and then checking for consecutive elements by comparing adjacent values.

## Logic Used
After sorting, all numbers are arranged in increasing order.  
This makes it easy to detect consecutive sequences by checking if the current element is exactly 1 greater than the previous element.

## Handling Duplicates
If two adjacent elements are equal, we simply skip them using `continue`, because duplicates do not affect the length of the consecutive sequence.

## Algorithm Steps
1. If the array is empty, return 0.
2. Sort the array using `Arrays.sort(nums)`.
3. Initialize:
   - `longest = 1`
   - `currentStreak = 1`
4. Traverse the array from index 1:
   - If `nums[i] == nums[i - 1] + 1`, increment `currentStreak`.
   - If `nums[i] == nums[i - 1]`, skip the element (duplicate).
   - Otherwise:
     - Update `longest = max(longest, currentStreak)`
     - Reset `currentStreak = 1`
5. After the loop, return `max(longest, currentStreak)`.

## Code Explanation
We first sort the array so that consecutive numbers come next to each other.  
Then we iterate through the array and maintain a streak counter to track consecutive elements.  
Duplicates are ignored, and whenever the sequence breaks, we update the longest streak found so far.

## Time Complexity
O(n log n)  
Sorting takes the majority of time.

## Space Complexity
O(1)  
No extra space is used apart from variables.

## Key Learning
Sorting helps simplify the problem, but it increases time complexity.  
This approach is better than brute force but not optimal.  
We can further optimize it using a HashSet to achieve O(n) time.
