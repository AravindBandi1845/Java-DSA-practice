# Best Time to Buy and Sell Stock

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day.

You want to maximize your profit by choosing:
- One day to buy the stock
- A different future day to sell the stock

Return the maximum profit you can achieve.

If no profit can be achieved, return 0.

---

## Example 1

Input:
prices = [7,1,5,3,6,4]

Output:
5

Explanation:
Buy on day 2 (price = 1)
Sell on day 5 (price = 6)

Profit = 6 - 1 = 5

---

## Example 2

Input:
prices = [7,6,4,3,1]

Output:
0

Explanation:
No profitable transaction is possible.

---

## Constraints

- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

---

## Notes

- Only one transaction is allowed.
- Buy must happen before sell.
- Goal: maximize profit.
