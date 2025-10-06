# String to Integer (atoi) (LeetCode #8) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/string-to-integer-atoi/)

---

## Problem Statement:-

Implement the `myAtoi(string s)` function, which converts a string into a 32-bit signed integer, following these rules:

1. **Whitespace:** Ignore any leading whitespace (`" "`).
2. **Signedness:** Check if the next character is `'-'` or `'+'`. Default to positive if neither is present.
3. **Conversion:** Read digits until a non-digit character or end of string is reached. Ignore leading zeros.

   * If no digits are read → return `0`.
4. **Rounding:** Clamp the result into the **32-bit signed integer range**:

   * Range = `[-2^31, 2^31 - 1]`
   * If out of bounds, return `-2^31` or `2^31 - 1`.

---

## Key Assumptions:

* Input may contain whitespace, signs, digits, and extra characters.
* Ignore everything after the first non-digit character once parsing starts.
* Input length: `0 <= s.length <= 200`.

---

## Examples:-

**Example 1:**

```
Input: s = "42"
Output: 42
```

**Example 2:**

```
Input: s = "   -042"
Output: -42
```

**Example 3:**

```
Input: s = "1337c0d3"
Output: 1337
```

**Example 4:**

```
Input: s = "0-1"
Output: 0
```

**Example 5:**

```
Input: s = "words and 987"
Output: 0
```

---

## My Approach & Thought Process:-

* **Step 1:** Trim leading whitespaces.
* **Step 2:** Check if next character is `'+'` or `'-'`. Store the sign.
* **Step 3:** Traverse digits and build the number using `num = num * 10 + digit`.
* **Step 4:** Before adding each digit, check for **overflow**:

  * If `num > Integer.MAX_VALUE / 10`, or
  * If `num == Integer.MAX_VALUE / 10` and digit > 7 (for positive) / 8 (for negative).
  * Return clamped values accordingly.
* **Step 5:** Apply the sign and return the final result.

---

## Time & Space Complexity:

* **Time Complexity:** O(n), where `n` = length of input string.
* **Space Complexity:** O(1).

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

