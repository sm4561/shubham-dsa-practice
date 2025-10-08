Regular Expression Matching (LeetCode #10) ✅
Link to Problem on LeetCode

Problem Statement:-
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.

'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

Key Assumptions:
s could be empty and contains only lowercase letters a-z.

p could be empty and contains only lowercase letters a-z, . or *.

It is guaranteed that for every *, there is a valid preceding character to match.

Constraints: 0 <= s.length <= 20, 0 <= p.length <= 30.

Examples:-
Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
My Approach & Thought Process:-
This problem has optimal substructure and overlapping subproblems, making it a classic Dynamic Programming (DP) problem.

I'll use a 2D DP table, let's call it dp[i][j], which will be true if the first i characters of s match the first j characters of p, and false otherwise.

Base Case: dp[0][0] = true, since an empty string matches an empty pattern.

Transitions (Filling the table):

If p[j-1] is a *:

The * can act as "zero" of the preceding element. In this case, the match depends on the pattern excluding the * and its preceding character (dp[i][j-2]).

Or, if the current character s[i-1] matches the character before the * in p, the * can act as "one or more" of the preceding element. The match then depends on the previous state for the string (dp[i-1][j]).

If p[j-1] is . or a letter:

A match occurs only if the current characters s[i-1] and p[j-1] match, AND the rest of the substrings also matched (dp[i-1][j-1]).

The final answer is the value in dp[s.length()][p.length()].

Time & Space Complexity:
Time Complexity: O(m×n) — where m is the length of string s and n is the length of pattern p. We have to fill every cell of the DP table.

Space Complexity: O(m×n) — to store the DP table.

Solution
See Solution.java for the Java implementation (LeetCode submission version, without main class).
