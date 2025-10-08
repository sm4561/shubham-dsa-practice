# Regular Expression Matching (LeetCode #10) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/regular-expression-matching/)

---

## Problem Statement:-

Given an input string `s` and a pattern `p`, implement regular expression matching with support for `.` and `*`.

* `.` Matches any single character.
* `*` Matches zero or more of the preceding element.

The matching should cover the **entire** input string (not partial).

---

## Key Assumptions:

* `s` could be empty and contains only lowercase letters `a-z`.
* `p` could be empty and contains only lowercase letters `a-z`, `.` or `*`.
* It is guaranteed that for every `*`, there is a valid preceding character to match.
* Constraints: `0 <= s.length <= 20`, `0 <= p.length <= 30`.

---

## Examples:-

**Example 1:**
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

**Example 2:**
Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

**Example 3:**
Input: s = "ab", p = "."
Output: true
Explanation: "." means "zero or more (*) of any character (.)".

I sincerely apologize for the frustration and the misunderstanding. You are right to be upset, and I am sorry for not understanding correctly and wasting your time.

Let me clarify the core issue. As an AI, I cannot create or send you an actual file. I can only provide you with the **raw text content** that you need to put into a file.

The text I provided in my last message is the complete content for the file. You just need to **copy all of it and paste it into a `README.md` file** on GitHub.

Here is the exact text again, with clear instructions.

### Instructions:

1.  Click the "Copy" icon in the top-right corner of the text box below.
2.  Go to your GitHub repository.
3.  Create a **new file** and name it exactly `README.md`.
4.  **Paste** the copied text directly into that file.

When you save it, GitHub will automatically format it correctly, just like your "Palindrome Number" example.

-----

### Copy The Text Below:

```markdown
# Regular Expression Matching (LeetCode #10) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/regular-expression-matching/)

---

## Problem Statement:-

Given an input string `s` and a pattern `p`, implement regular expression matching with support for `.` and `*`.

* `.` Matches any single character.
* `*` Matches zero or more of the preceding element.

The matching should cover the **entire** input string (not partial).

---

## Key Assumptions:

* `s` could be empty and contains only lowercase letters `a-z`.
* `p` could be empty and contains only lowercase letters `a-z`, `.` or `*`.
* It is guaranteed that for every `*`, there is a valid preceding character to match.
* Constraints: `0 <= s.length <= 20`, `0 <= p.length <= 30`.

---

## Examples:-

**Example 1:**

```

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

```

**Example 2:**

```

Input: s = "aa", p = "a\*"
Output: true
Explanation: '\*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

```

**Example 3:**

```

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (\*) of any character (.)".

```

---

## My Approach & Thought Process:-

* This problem has optimal substructure and overlapping subproblems, making it a classic **Dynamic Programming (DP)** problem.
* I'll use a 2D DP table, `dp[i][j]`, which will be `true` if the first `i` characters of `s` match the first `j` characters of `p`.
* **Base Case:** `dp[0][0] = true`, since an empty string matches an empty pattern.
* **Transitions (Filling the table):**
    * **If `p[j-1]` is a `*`:**
        * It can act as "zero" of the preceding element (`dp[i][j-2]`).
        * Or, if the current character `s[i-1]` matches the character before `*`, it can act as "one or more" (`dp[i-1][j]`).
    * **If `p[j-1]` is `.` or a letter:**
        * A match occurs only if `s[i-1]` matches `p[j-1]` AND the rest of the substrings also matched (`dp[i-1][j-1]`).
* The final answer is the value in `dp[s.length()][p.length()]`.

---

## Time & Space Complexity:

* **Time Complexity:** O(m * n) — where `m` is the length of `s` and `n` is the length of `p`.
* **Space Complexity:** O(m * n) — for the DP table.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).
```
