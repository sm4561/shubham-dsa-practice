# Generate Parentheses (LeetCode #22) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/generate-parentheses/)

---

## Problem Statement:

Given `n` pairs of parentheses, write a function to generate **all combinations of well-formed parentheses**.

A well-formed parentheses string is one where:
1. Every opening bracket `'('` has a corresponding closing bracket `')'`.  
2. No closing bracket appears before its matching opening bracket.

---

## Example 1:

**Input:**  
`n = 3`

**Output:**  
`["((()))","(()())","(())()","()(())","()()()"]`

---

## Example 2:

**Input:**  
`n = 1`

**Output:**  
`["()"]`

---

## Constraints:

* `1 <= n <= 8`

---

## Approach & Thought Process:

We use **Backtracking** to generate all possible valid combinations.

### Steps:

1. Maintain two counters:
   - `open` → number of `'('` used.
   - `close` → number of `')'` used.

2. At each step:
   - You can add `'('` if `open < n`.
   - You can add `')'` if `close < open` (to keep it valid).

3. When both `open == n` and `close == n`,  
   the current string is a valid combination → add to the result list.

---

## Example Walkthrough:

For `n = 3`:

| Step | Current String | open | close | Action |
|------|----------------|-------|--------|---------|
| 1 | `""` | 0 | 0 | Add `'('` → `"("` |
| 2 | `"("` | 1 | 0 | Add `'('` → `"(("` |
| 3 | `"(("` | 2 | 0 | Add `'('` → `"((("` |
| 4 | `"((("` | 3 | 0 | Add `')'` → `"((()"` |
| ... | ... | ... | ... | Continue until all valid combinations formed |

**Final Output:**  
`["((()))","(()())","(())()","()(())","()()()"]`

---

## Time & Space Complexity:

* **Time Complexity:** O(2ⁿ) — each position can choose `'('` or `')'` but pruned by constraints.  
* **Space Complexity:** O(n) — recursive call stack.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).  

