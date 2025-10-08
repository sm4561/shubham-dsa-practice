Regular Expression Matching (LeetCode #10) ✅

Link to Problem on LeetCode

Problem Statement:-

Implement regular expression matching between a string s and a pattern p, where:

'.' → Matches any single character.

'*' → Matches zero or more occurrences of the preceding element.

Matching must cover the entire string, not just a substring.

Key Assumptions:

Each '*' in the pattern will always have a valid preceding character.

The pattern and string only contain lowercase English letters, '.', and '*'.

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

This is a Dynamic Programming (DP) problem.

Let dp[i][j] represent whether s[0..i-1] matches p[0..j-1].

Base case: dp[0][0] = true (empty string matches empty pattern).

For '*' cases:

'*' can eliminate the previous character → dp[i][j] = dp[i][j-2]

Or it can match multiple occurrences if previous characters match →
dp[i][j] = dp[i-1][j] && (s[i-1] == p[j-2] || p[j-2] == '.')

For normal or '.' characters:
dp[i][j] = dp[i-1][j-1] && (s[i-1] == p[j-1] || p[j-1] == '.')

Time & Space Complexity:

Time Complexity: O(m × n), where m = length of s, n = length of p.

Space Complexity: O(m × n) for the DP table.

Solution

See Solution.java
 for the Java implementation (LeetCode submission version, without main class).
