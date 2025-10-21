# Merge Two Sorted Lists (LeetCode #21) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)

---

## Problem Statement:

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one **sorted list**.  
The list should be made by **splicing together** the nodes of the first two lists.

Return the head of the merged linked list.

---

## Example 1:

![Example Image](https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg)

**Input:**  
`list1 = [1,2,4]`, `list2 = [1,3,4]`

**Output:**  
`[1,1,2,3,4,4]`

---

## Example 2:

**Input:**  
`list1 = []`, `list2 = []`

**Output:**  
`[]`

---

## Example 3:

**Input:**  
`list1 = []`, `list2 = [0]`

**Output:**  
`[0]`

---

## Constraints:

* The number of nodes in both lists is in the range `[0, 50]`.  
* `-100 <= Node.val <= 100`  
* Both `list1` and `list2` are sorted in **non-decreasing order**.

---

## Approach & Thought Process:

* Use a **dummy node** and a **pointer (tail)** to build the new list:
  1. Compare the values at `list1` and `list2`.  
  2. Attach the smaller node to the `tail`.  
  3. Move that list’s pointer forward.  
  4. Continue until one list is empty.  
  5. Attach the remaining part of the non-empty list.

This way, we **reuse existing nodes** without creating new ones.

---

## Example Walkthrough:

For input `list1 = [1,2,4]`, `list2 = [1,3,4]`:

* Step 1 → Compare 1 & 1 → Take list1’s 1 → `[1]`  
* Step 2 → Compare 2 & 1 → Take list2’s 1 → `[1,1]`  
* Step 3 → Compare 2 & 3 → Take list1’s 2 → `[1,1,2]`  
* Step 4 → Compare 4 & 3 → Take list2’s 3 → `[1,1,2,3]`  
* Step 5 → Compare 4 & 4 → Take list1’s 4 → `[1,1,2,3,4]`  
* Step 6 → Append list2’s 4 → `[1,1,2,3,4,4]`

---

## Time & Space Complexity:

* **Time Complexity:** O(n + m) — traverse both lists once.  
* **Space Complexity:** O(1) — merge done in-place using pointers.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).  

