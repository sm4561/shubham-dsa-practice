
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
