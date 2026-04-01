# Find All Anagrams in a String

## Problem Statement
Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`.

You may return the answer in any order.

## Example 1
Input:
s = "cbaebabacd", p = "abc"

Output:
[0,6]

Explanation:
The substring starting at index 0 is "cba", which is an anagram of "abc".  
The substring starting at index 6 is "bac", which is also an anagram.

## Example 2
Input:
s = "abab", p = "ab"

Output:
[0,1,2]

## Constraints
- 1 ≤ s.length, p.length ≤ 3 * 10⁴
- s and p consist of lowercase English letters.
