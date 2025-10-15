# Letter Combinations of a Phone Number (LeetCode #17) 

[Link to Problem on LeetCode](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

---

## Problem Statement:

Given a string containing digits from `2-9` inclusive, return **all possible letter combinations** that the number could represent.  
Return the answer in **any order**.

A mapping of digits to letters (like on a traditional telephone keypad) is provided below:  
Note that the digit **'1'** does not map to any letters.

| Digit | Letters |
|:------:|:--------:|
| 2 | a, b, c |
| 3 | d, e, f |
| 4 | g, h, i |
| 5 | j, k, l |
| 6 | m, n, o |
| 7 | p, q, r, s |
| 8 | t, u, v |
| 9 | w, x, y, z |

---

## Examples:

**Example 1:**

Input: digits = "23"

Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]


**Example 2:**

Input: digits = "2"

Output: ["a","b","c"]


**Example 3:**

Input: digits = ""

Output: []


---

## Key Assumptions & Constraints:

* `1 <= digits.length <= 4`
* `digits[i]` is a character in the range `'2'`–`'9'`
* The output can be in **any order**
* Each digit corresponds to **3–4 possible letters**

---

## Approach & Thought Process:

* **Backtracking Approach (DFS):**
  1. Use a mapping of digits to corresponding letters.
  2. For each digit, explore all possible letters using recursion.
  3. When the generated combination length equals `digits.length`, add it to the result list.
  4. Backtrack to explore the next possible character.

* **Why Backtracking Works:**
  * Each digit choice leads to multiple branches.
  * Recursively exploring and backtracking ensures all combinations are generated efficiently.

---

## Time & Space Complexity:

* **Time Complexity:** O(4ⁿ)  
  (Each digit can map to up to 4 letters; n = length of digits.)
* **Space Complexity:** O(n)  
  (Recursion depth proportional to the number of digits.)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

