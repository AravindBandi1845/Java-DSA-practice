# Approach Explanation (Better - Track Minimum Price)

## Idea

Instead of checking every possible buying and selling pair, we keep track of the minimum stock price encountered so far.

For each day's price:
- Assume it is the selling price.
- Calculate the profit using the minimum buying price seen previously.
- Update the maximum profit if the current profit is larger.

---

## Key Concept

At every step, we need two values:

- **Minimum Price So Far** → Best day to buy.
- **Maximum Profit So Far** → Best profit obtained.

This avoids checking every pair of days.

---

## Algorithm Steps

1. Initialize:
   - `minPrice = prices[0]`
   - `maxProfit = 0`
2. Traverse the array from the second day.
3. If the current price is smaller than `minPrice`, update `minPrice`.
4. Otherwise:
   - Calculate:
     ```
     profit = currentPrice - minPrice
     ```
   - Update `maxProfit` if needed.
5. Return `maxProfit`.

---

## Example

Input:

prices = [7,1,5,3,6,4]

Processing:

Day 1:
minPrice = 7

Day 2:
minPrice = 1

Day 3:
profit = 5 - 1 = 4
maxProfit = 4

Day 4:
profit = 3 - 1 = 2

Day 5:
profit = 6 - 1 = 5
maxProfit = 5

Day 6:
profit = 4 - 1 = 3

Output:

5

---

## Time Complexity

O(n)

- Single traversal of the array.

---

## Space Complexity

O(1)

- Only two variables are used.

---

## Advantage

- Much faster than brute force.
- Does not require extra space.
- Processes the array in one pass.

---

## Key Learning

Tracking the minimum value seen so far is a common optimization pattern in array problems. It allows us to determine the best possible profit at each step without comparing every pair of days.
