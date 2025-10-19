Here’s the complete README.md file for LeetCode #20 – Valid Parentheses ✅

Valid Parentheses (LeetCode #20) ✅

Link to Problem on LeetCode

Problem Statement:

Given a string s containing only the characters '(', ')', '{', '}', '[', and ']', determine whether the input string is valid.

A string is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Every closing bracket has a corresponding open bracket of the same type.

Examples:

Example 1:

Input:
s = "()"

Output:
true

Example 2:

Input:
s = "()[]{}"

Output:
true

Example 3:

Input:
s = "(]"

Output:
false

Example 4:

Input:
s = "([])"

Output:
true

Example 5:

Input:
s = "([)]"

Output:
false

Key Assumptions & Constraints:

1 <= s.length <= 10⁴

s consists only of characters: '(', ')', '{', '}', '[', ']'

Approach & Thought Process:
Using Stack (LIFO structure)

Create a stack to store opening brackets.

Traverse the string:

If the character is an opening bracket ((, {, [), push it onto the stack.

If it’s a closing bracket, check:

Stack must not be empty.

The top of the stack must be the matching opening bracket.

If not, the string is invalid → return false.

At the end, if the stack is empty, the string is valid; otherwise, it’s invalid.

Example Walkthrough:

Input: "([])"

Push '(' → Stack: ['(']

Push '[' → Stack: ['(', '[']

Encounter ']' → matches '[', pop → Stack: ['(']

Encounter ')' → matches '(', pop → Stack: []
✅ Stack empty → valid.

Time & Space Complexity:

Time Complexity: O(n) – Each character is processed once.

Space Complexity: O(n) – Stack can hold all opening brackets in the worst case.

Solution

See Solution.java
 for the Java implementation (LeetCode submission version, without main class).
