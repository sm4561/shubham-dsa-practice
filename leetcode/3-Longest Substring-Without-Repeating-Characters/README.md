# Longest Substring Without Repeating Characters (LeetCode #3) ✅
[Link to Problem on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Problem Statement:-
Given a string `s`, find the length of the longest substring without duplicate characters.

A substring is a contiguous sequence of characters within a string.

---

## Key Assumptions:
- The string can contain English letters, digits, symbols, and spaces.
- The input length is between `0 <= s.length <= 5 * 10^4`.

---

## Examples:-

**Example 1:**

Input: s = "abcabcbb"

Output: 3

Explanation: The answer is "abc", with the length of 3.


**Example 2:**

Input: s = "bbbbb"

Output: 1

Explanation: The answer is "b".


**Example 3:**

Input: s = "pwwkew"

Output: 3

Explanation: The answer is "wke", with the length of 3.

Note: "pwke" is a subsequence, not a substring.


---

## My Approach & Thought Process:-

- My first instinct was to try all possible substrings and check if they have duplicate characters.  
  But this brute force approach would be **O(n³)** (too slow for large inputs).

- The key challenge is to find an efficient way to avoid duplicates while scanning the string.

- A better approach is to use the **Sliding Window Technique** with a **HashSet**:
  - Maintain two pointers (`left` and `right`) to represent the current window.
  - Use a HashSet to track characters inside the window.
  - Expand `right` pointer to add new characters.
  - If a duplicate is found, shrink the window from the `left` until the duplicate is removed.
  - Keep track of the maximum window size during the process.

- This way, each character is added and removed at most once → **O(n) time complexity**.

---

## Time & Space Complexity:
- **Time Complexity:** O(n)  
- **Space Complexity:** O(min(n, charset_size)) → at most the number of unique characters.

---

## Solution
See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

