# Valid Parentheses (LeetCode #20) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/valid-parentheses/)

---

## Problem Statement:

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is **valid**.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.  
2. Open brackets must be closed in the correct order.  
3. Every close bracket has a corresponding open bracket of the same type.

---

## Example 1:

**Input:**  
`s = "()"`

**Output:**  
`true`

---

## Example 2:

**Input:**  
`s = "()[]{}"`

**Output:**  
`true`

---

## Example 3:

**Input:**  
`s = "(]"`

**Output:**  
`false`

---

## Example 4:

**Input:**  
`s = "([])"`

**Output:**  
`true`

---

## Example 5:

**Input:**  
`s = "([)]"`

**Output:**  
`false`

---

## Constraints:

* `1 <= s.length <= 10^4`  
* `s` consists of parentheses only `'()[]{}'`.

---

## Approach & Thought Process:

* Use a **stack** to keep track of open brackets:
  1. Iterate over each character in the string.  
  2. If it is an **opening bracket** `(`, `[`, `{`, push it onto the stack.  
  3. If it is a **closing bracket** `)`, `]`, `}`, check the top of the stack:
     - If the top matches the corresponding opening bracket, pop it.  
     - Otherwise, return `false`.  
  4. After processing all characters, if the stack is empty, the string is valid. Otherwise, it is invalid.

---

## Example Walkthrough:

For input `s = "([{}])"`:

* Step 1 → Push `'('` → Stack: `['(']`  
* Step 2 → Push `'['` → Stack: `['(', '[']`  
* Step 3 → Push `'{'` → Stack: `['(', '[', '{']`  
* Step 4 → Encounter `'}'` → Matches top `'{'` → Pop → Stack: `['(', '[']`  
* Step 5 → Encounter `']'` → Matches top `'['` → Pop → Stack: `['(']`  
* Step 6 → Encounter `')'` → Matches top `'('` → Pop → Stack: `[]`  
* Result → Stack empty → `true`

---

## Time & Space Complexity:

* **Time Complexity:** O(N) — traverse the string once.  
* **Space Complexity:** O(N) — in worst case, stack holds all opening brackets.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).  
