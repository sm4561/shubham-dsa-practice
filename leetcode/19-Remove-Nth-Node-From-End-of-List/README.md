# Remove Nth Node From End of List (LeetCode #19) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

---

## Problem Statement:

Given the head of a linked list, remove the **n-th node from the end** of the list and return its head.

---

## Example 1:

![Example Image](https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg)

**Input:**  
`head = [1,2,3,4,5], n = 2`

**Output:**  
`[1,2,3,5]`

---

## Example 2:

**Input:**  
`head = [1], n = 1`

**Output:**  
`[]`

---

## Example 3:

**Input:**  
`head = [1,2], n = 1`

**Output:**  
`[1]`

---

## Constraints:

* The number of nodes in the list is **sz**.  
* `1 <= sz <= 30`  
* `0 <= Node.val <= 100`  
* `1 <= n <= sz`

---

## Approach & Thought Process:

* Use **two-pointer technique**:
  1. Create a **dummy node** pointing to head (to handle edge cases).
  2. Move the **first pointer** `n+1` steps ahead.
  3. Then move **both pointers** until the first pointer reaches the end.
  4. The **second pointer** will be right before the node to delete.
  5. Adjust the `next` pointer to skip the target node.

---

## Example Walkthrough:

For input `head = [1,2,3,4,5], n = 2`:

* Step 1 → Move first pointer 2+1 = 3 steps ahead.  
* Step 2 → Move both pointers until first reaches null.  
* Step 3 → Second pointer now at node `3`, skip `4`.  
* Result → `[1,2,3,5]`

---

## Time & Space Complexity:

* **Time Complexity:** O(L) — traverse the list once.  
* **Space Complexity:** O(1) — only pointers used.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

