# Regular Expression Matching (LeetCode #10) 🟣

[Link to Problem on LeetCode](https://leetcode.com/problems/regular-expression-matching/)

---

## Problem Statement:

Given an input string `s` and a pattern `p`, implement regular expression matching with support for `.` and `*` where:

* `.` Matches any single character.  
* `*` Matches zero or more of the **preceding element**.  

The matching should cover the **entire input string** (not partial).

---

## Examples:

**Example 1:**

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".


**Example 2:**

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, repeating 'a' once becomes "aa".

**Example 3:**

Input: s = "ab", p = "."
Output: true
Explanation: "." means zero or more (*) of any character (.).

---

## Key Assumptions & Constraints:

* `1 <= s.length <= 20`  
* `1 <= p.length <= 20`  
* `s` contains only lowercase English letters.  
* `p` contains only lowercase English letters, `.`, and `*`.  
* Every `*` in `p` is guaranteed to follow a valid character.  
* Matching must cover the **entire string**.  

---

## Approach & Thought Process:

* **Recursive / Backtracking Approach (Brute-force):**
  * Base case: If pattern is empty, string must also be empty.  
  * Check if first characters match or if pattern starts with `.`.  
  * If next character in pattern is `*`, there are **two choices**:
    1. Treat `*` as 0 occurrence → skip current char and `*` in pattern.  
    2. Treat `*` as 1+ occurrence → move in string only if first characters match.
  * Else → move to next character in both string and pattern if first characters match.  

* **Dynamic Programming (Optimal, Recommended):**
  * Use a 2D boolean table `dp[i][j]` where `i` represents string `s` up to `i-1` and `j` represents pattern `p` up to `j-1`.  
  * Base case: `dp[0][0] = true` → empty string matches empty pattern.  
  * Fill the table considering:
    * Exact matches or `.` match.  
    * `*` matches 0 occurrence (`dp[i][j-2]`) or ≥1 occurrence (`dp[i-1][j]`).  
  * Final answer: `dp[s.length()][p.length()]`.

* **Why DP works:**  
  Avoids exponential recursion by storing overlapping subproblem results. Time complexity is manageable for `s.length, p.length ≤ 20`.

---

## Time & Space Complexity:

* **Time Complexity:** O(m * n) → m = `s.length`, n = `p.length`  
* **Space Complexity:** O(m * n) → DP table of size `(m+1) x (n+1)`  

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

