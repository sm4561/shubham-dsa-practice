# Palindrome Number (LeetCode #9) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/palindrome-number/)

---

## Problem Statement:-

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A **palindrome number** reads the same forward and backward.

---

## Key Assumptions:

* Negative integers are **not** palindromes (the minus sign makes them asymmetric).
* If a number ends with `0` but is not `0`, it cannot be a palindrome (e.g., `10` → `false`).
* Constraints: `-2^31 <= x <= 2^31 - 1`.

---

## Examples:-

**Example 1:**

```
Input: x = 121
Output: true
```

**Example 2:**

```
Input: x = -121
Output: false
```

**Example 3:**

```
Input: x = 10
Output: false
```

---

## My Approach & Thought Process:-

* **Brute-force idea (not ideal):** Convert the integer to a string, reverse the string, then compare.

  * Works but uses extra space and does not follow the follow-up requirement.
* **Better approach (preferred — no string conversion):**

  * Immediately return `false` for negative numbers.
  * Reverse **half** of the integer using arithmetic:

    * Repeatedly pop the last digit (`digit = x % 10`) and push it into a `reversedHalf` (`reversedHalf = reversedHalf * 10 + digit`).
    * Stop when `reversedHalf >= x` (we have processed half or more of the digits).
    * For even-length numbers: `x == reversedHalf`.
    * For odd-length numbers: `x == reversedHalf / 10` (middle digit ignored).
  * Reversing only half avoids overflow and uses constant extra space.
* This meets the follow-up requirement and is efficient.

---

## Time & Space Complexity:

* **Time Complexity:** O(log₁₀(n)) — we process about half the digits (n = numeric value magnitude).
* **Space Complexity:** O(1) — only a few integer variables used.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

