# Approach Explanation (Brute Force)

## Idea
Try every possible day as the buying day and every future day as the selling day. For each pair, calculate the profit and keep track of the maximum profit obtained.

---

## Key Concept

- Buy before selling.
- For every buying day, check all possible selling days after it.
- Update the maximum profit whenever a better profit is found.

---

## Algorithm Steps

1. Initialize `maxProfit = 0`.
2. Traverse the array using index `i` as the buying day.
3. For each `i`, traverse from `j = i + 1` to the end as the selling day.
4. Calculate:
   ```
   profit = prices[j] - prices[i]
   ```
5. Update `maxProfit` if the current profit is greater.
6. Return `maxProfit`.

---

## Example

Input:

prices = [7,1,5,3,6,4]

Checking all pairs:

Buy at 7 → Sell at 1,5,3,6,4 → Maximum Profit = 0

Buy at 1 → Sell at 5,3,6,4
- Profit = 4
- Profit = 2
- Profit = 5 ✅
- Profit = 3

Buy at 5 → Sell at 3,6,4
- Profit = -2
- Profit = 1
- Profit = -1

Buy at 3 → Sell at 6,4
- Profit = 3
- Profit = 1

Buy at 6 → Sell at 4
- Profit = -2

Maximum Profit = 5

Output:

5

---

## Time Complexity

O(n²)

- Two nested loops examine every possible buy-sell pair.

---

## Space Complexity

O(1)

- Only a few variables are used.

---

## Drawback

- Inefficient for large arrays because every possible transaction is checked.
- Does not take advantage of previously seen minimum prices.

---

## Key Learning

Brute force guarantees the correct answer by checking every valid transaction, but it is too slow for large inputs. The optimal solution improves this by tracking the minimum buying price seen so far in a single traversal.
