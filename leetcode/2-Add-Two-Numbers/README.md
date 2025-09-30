# Add Two Numbers (LeetCode #2) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/add-two-numbers/)

### Problem Statement

You are given two **non-empty linked lists** representing two non-negative integers. The digits are stored in **reverse order**, and each node contains a single digit. The task is to add the two numbers and return the sum as a new linked list.

**Key Assumptions:**

* The numbers do not have any leading zeros (except for the number 0 itself).
* The input lists are non-empty.

### Examples

**Example 1:**
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Reason: 342 + 465 = 807.


**Example 2:**

Input: l1 = [0], l2 = [0]
Output: [0]


**Example 3:**

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


---

### My Approach & Thought Process

This problem is essentially a simulation of elementary-school addition. The fact that the digits are in reverse order is actually a huge help, as it means we can process the numbers from the least significant digit to the most significant, just like we do on paper.

The main things to keep track of are:
1.  The sum of the digits at the current position.
2.  The `carry` that gets passed to the next position.

My approach is to iterate through both lists simultaneously. I'll need a new linked list to build the result. Using a `dummyHead` node is a great trick here, as it provides a stable starting point and saves me from writing extra code to handle the creation of the very first node.

Here is the step-by-step logic:
1.  Initialize a `dummyHead` for the result list and a `current` pointer to build it.
2.  Initialize a `carry` variable to `0`.
3.  Loop as long as `l1` or `l2` has nodes. In each iteration:
    * Get the values from the current nodes of `l1` and `l2`. If a list has been fully traversed, I'll consider its value to be `0`.
    * Calculate the `sum` of these two values plus the `carry`.
    * The new `carry` for the next iteration will be `sum / 10`.
    * The digit for my new node will be `sum % 10`.
    * Create this new node and attach it to my result list.
4.  After the loop, there might be one final `carry` left over (like in Example 3). If so, I'll need to create one last node for it.
5.  Finally, I'll return `dummyHead.next`, which is the actual start of my result list.

**Time Complexity:** $O(\max(m, n))$, where m and n are the lengths of the two lists.
**Space Complexity:** $O(\max(m, n))$ for the new result list.

---

### Solution

You can view the code for my solution here:
See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).


See [`main.java`](main.java) for a runnable version with test cases (for local testing in VS Code).
