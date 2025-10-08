Regular Expression Matching (LeetCode #10) ✅

Link to Problem on LeetCode

Problem Statement:-

Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*', where:

'.' → Matches any single character.

'*' → Matches zero or more of the preceding element.

The matching must cover the entire input string (not partial).

Key Assumptions:

Every '*' will always have a valid preceding character.

The input string and pattern only contain lowercase English letters, '.', and '*'.

Input lengths:

1 <= s.length <= 20

1 <= p.length <= 20

Examples:-

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element ('a'). 
By repeating 'a' once, it becomes "aa".

Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".

My Approach & Thought Process:-

Use Dynamic Programming (DP) to compare characters of s and p.

Consider two main cases:

Direct or '.' match: Compare previous characters.

'*' match: Check zero or multiple occurrences of the preceding element.

Start with base case dp[0][0] = true (empty string vs empty pattern).

Time & Space Complexity:

Time Complexity: O(m × n), where m = length of s, n = length of p.

Space Complexity: O(m × n)

Solution

See Solution.java
 for the Java implementation (LeetCode submission version, without main class).
