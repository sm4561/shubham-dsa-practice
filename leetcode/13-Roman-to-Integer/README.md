# Roman to Integer (LeetCode #13) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/roman-to-integer/)

---

## Problem Statement:

Roman numerals are represented by seven different symbols with the following values:

| Symbol | Value |
|:------:|:------:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

For example:

* 2 → `II` (1 + 1)  
* 12 → `XII` (10 + 1 + 1)  
* 27 → `XXVII` (10 + 10 + 5 + 1 + 1)

Roman numerals are **usually written from largest to smallest** from left to right.  
However, there are six **subtractive cases** where a smaller value appears before a larger one:

* `I` can be placed before `V` (5) and `X` (10) → 4, 9  
* `X` can be placed before `L` (50) and `C` (100) → 40, 90  
* `C` can be placed before `D` (500) and `M` (1000) → 400, 900  

Given a **Roman numeral**, convert it to an **integer**.

---

## Examples:

**Example 1:**

Input: s = "III"

Output: 3

Explanation: III = 3


**Example 2:**

Input: s = "LVIII"

Output: 58

Explanation: L = 50, V = 5, III = 3


**Example 3:**

Input: s = "MCMXCIV"

Output: 1994

Explanation:

M = 1000,

CM = 900,

XC = 90,

IV = 4

---

## Key Assumptions & Constraints:

* `1 <= s.length <= 15`  
* `s` contains only characters: `'I', 'V', 'X', 'L', 'C', 'D', 'M'`  
* `s` is guaranteed to be a **valid Roman numeral** in the range `[1, 3999]`.

---

## Approach & Thought Process:

* **Direct Left-to-Right Conversion:**
  * Map each Roman symbol to its integer value.
  * Iterate through the string:
    * If the **current value < next value**, subtract it (for cases like IV, IX, etc.).
    * Otherwise, add it to the result.
  * This handles both additive and subtractive combinations in one pass.

* **Example (MCMXCIV):**
  * M (1000) → add → total = 1000  
  * C (100) < M (1000) → subtract → total = 900  
  * M (1000) → add → total = 1900  
  * X (10) < C (100) → subtract → total = 1890  
  * C (100) → add → total = 1990  
  * I (1) < V (5) → subtract → total = 1994  

---

## Time & Space Complexity:

* **Time Complexity:** O(n) — traverse each character once.  
* **Space Complexity:** O(1) — constant number of symbol mappings.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).
