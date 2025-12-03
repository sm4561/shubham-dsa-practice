# Merge k Sorted Lists (LeetCode #23) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)

---

## Problem Statement:

You are given an array of `k` linked-lists, where each linked list is **sorted in ascending order**.

Your task is to **merge all the k sorted lists into a single sorted linked list** and return its head.

---

## Examples:

**Example 1:**

Input:  
lists = [[1,4,5],[1,3,4],[2,6]]

Output:  
[1,1,2,3,4,4,5,6]

Explanation:  
Merging all lists in sorted order.

---

**Example 2:**

Input:  
lists = []

Output:  
[]

---

**Example 3:**

Input:  
lists = [[]]

Output:  
[]

---

## Key Assumptions & Constraints:

* `k == lists.length`
* `0 <= k <= 10^4`
* `0 <= lists[i].length <= 500`
* `-10^4 <= Node.val <= 10^4`
* Total number of nodes across all lists ≤ `10^5`

---

## Approach & Thought Process:

### Optimal Solution → **Min-Heap / Priority Queue (O(N log k))**

1. Push the head of each linked list into a **min-heap**.
2. Pop the smallest node, add it to the result list.
3. Push the next node from the popped node’s list.
4. Repeat until heap is empty.

**Why Min-Heap Works?**
* Always extracts the smallest element available among current list heads.
* Efficient for merging multiple sorted data streams.

---

## Time & Space Complexity:

* **Time Complexity:** O(N log k)  
  (N = total nodes, heap operations per node)
* **Space Complexity:** O(k)  
  (heap stores at most one node per list)

---

## Solution

See `Solution.java` for the complete Java code.


