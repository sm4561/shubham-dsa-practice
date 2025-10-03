# Longest Palindromic Substring (LeetCode #5) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)

---

## Problem Statement

Given a string `s`, return the longest palindromic substring in `s`.

---

## Examples

**Example 1:**

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
```

**Example 2:**

```
Input: s = "cbbd"
Output: "bb"
```

---

## Constraints

* `1 <= s.length <= 1000`
* `s` consists of only digits and English letters.

---

## My Approach & Thought Process 🧠

This is a **classic palindrome problem**.
Key observation: A palindrome mirrors around its center.

### Approaches:

1. **Brute Force (O(n³)):**

   * Generate all substrings and check if each is a palindrome.
   * Too slow for `n = 1000`.

2. **Dynamic Programming (O(n²)):**

   * Use a DP table where `dp[i][j] = true` if substring `s[i..j]` is a palindrome.
   * Expand by checking neighbors.
   * Space-intensive for large `n`.

3. **Expand Around Center (O(n²) Time, O(1) Space) ✅**

   * For each index, expand outward considering it as:

     * **Odd length center** (single character center).
     * **Even length center** (two-character center).
   * Track the longest palindrome found.
   * Works efficiently for `n <= 1000`.

---

## Time & Space Complexity

* **Time Complexity:** O(n²)
* **Space Complexity:** O(1)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

