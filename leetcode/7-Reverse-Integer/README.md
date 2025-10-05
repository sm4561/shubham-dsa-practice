# Reverse Integer (LeetCode #7) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/reverse-integer/)

---

## Problem Statement:-

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return `0`.

Assume the environment does not allow storing 64-bit integers.

---

## Key Assumptions:

* Input is always a 32-bit signed integer.
* If overflow occurs, return **0**.
* Negative numbers should also be reversed while keeping the negative sign intact.

---

## Examples:-

**Example 1:**

```
Input: x = 123
Output: 321
```

**Example 2:**

```
Input: x = -123
Output: -321
```

**Example 3:**

```
Input: x = 120
Output: 21
```

---

## My Approach & Thought Process:-

* A naive approach would be to convert the integer to a string, reverse it, and convert back to integer.
  But this risks overflow and isn't efficient.

* Instead, use **Mathematical Reversal**:

  * Pop the last digit using `x % 10`.
  * Push it to the reversed number (`rev = rev * 10 + digit`).
  * Before pushing, check for **overflow**:

    * If `rev > Integer.MAX_VALUE/10` or `rev < Integer.MIN_VALUE/10`, return `0`.

* This ensures correctness without using 64-bit integers.

---

## Time & Space Complexity:

* **Time Complexity:** O(log10(n)) → number of digits in `n`.
* **Space Complexity:** O(1).

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

