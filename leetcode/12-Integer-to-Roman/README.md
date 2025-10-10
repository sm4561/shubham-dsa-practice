# Integer to Roman (LeetCode #12) 🟡

[Link to Problem on LeetCode](https://leetcode.com/problems/integer-to-roman/)

---

## Problem Statement:

Seven different symbols represent Roman numerals with the following values:

| Symbol | Value |
|:------:|:------:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Roman numerals are formed by appending the conversions of **decimal place values** from highest to lowest.

Converting a decimal place value into a Roman numeral follows these **rules**:

1. If the value **does not start with 4 or 9**, select the symbol of the maximal value that can be subtracted, append that symbol, subtract its value, and continue.
2. If the value **starts with 4 or 9**, use the **subtractive form**, representing one symbol subtracted from the following symbol:
   * 4 → IV  
   * 9 → IX  
   * 40 → XL  
   * 90 → XC  
   * 400 → CD  
   * 900 → CM
3. Only powers of 10 (`I`, `X`, `C`, `M`) can be repeated up to 3 times.
4. Symbols representing 5s (`V`, `L`, `D`) are **never repeated**.

---

## Examples:

**Example 1:**

Input: num = 3749
Output: "MMMDCCXLIX"
Explanation:
3000 = MMM (M + M + M)

700 = DCC (D + C + C)

40 = XL (10 less than 50)

9 = IX (1 less than 10)


**Example 2:**

Input: num = 58
Output: "LVIII"
Explanation:
50 = L
8 = VIII


**Example 3:**

Input: num = 1994
Output: "MCMXCIV"
Explanation:
1000 = M
900 = CM
90 = XC
4 = IV


---

## Key Assumptions & Constraints:

* `1 <= num <= 3999`  
* Only standard Roman numeral symbols (`I, V, X, L, C, D, M`) are used.  
* Subtractive combinations appear only for `4` and `9` values of each decimal place.

---

## Approach & Thought Process:

* **Direct Mapping Approach (Greedy Method):**
  * Create arrays for Roman numeral symbols and their corresponding integer values.
  * Iterate from **largest to smallest value**:
    * While `num >= value[i]`, append the corresponding Roman symbol and subtract the value.
  * Continue until `num` becomes `0`.

* **Why Greedy Works:**
  * Roman numerals are **additive and subtractive** in nature.
  * Always taking the largest possible Roman value ensures minimal and valid numeral formation.

---

## Time & Space Complexity:

* **Time Complexity:** O(1)  
  (Because the number of Roman symbols is fixed, and `num` ≤ 3999.)
* **Space Complexity:** O(1)  
  (Uses only constant-size arrays and a string builder.)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

