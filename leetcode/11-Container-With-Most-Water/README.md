# Container With Most Water (LeetCode #11) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/container-with-most-water/)

---

## Problem Statement:

You are given an integer array `height` of length `n`.  
There are `n` vertical lines drawn such that the two endpoints of the `iᵗʰ` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the **most water**.

Return the **maximum amount of water** a container can store.

**Note:** You may not slant the container.

---

## Examples:

**Example 1:**

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
The max area of water (blue section) the container can contain is 49.

**Example 2:**

Input: height = [1,1]
Output: 1


---

## Key Assumptions & Constraints:

* `n == height.length`  
* `2 <= n <= 10⁵`  
* `0 <= height[i] <= 10⁴`  

---

## Approach & Thought Process:

* **Brute-force (O(n²)):**
  * Try every pair of lines `(i, j)` and compute the area:
    ```
    area = min(height[i], height[j]) * (j - i)
    ```
  * Track the maximum area.
  * **Inefficient** for large inputs (`n ≤ 10⁵`).

* **Optimal Approach — Two Pointer Technique (O(n)):**
  * Initialize two pointers:
    * `left = 0`, `right = n - 1`
  * Compute area between lines `left` and `right`:
    ```
    area = min(height[left], height[right]) * (right - left)
    ```
  * Keep track of the **maximum area** seen so far.
  * Move the pointer with **smaller height** inward:
    * Because moving the taller one can’t increase the area (width decreases, and height stays limited by the shorter line).
  * Continue until both pointers meet.

* **Why it works:**
  * By always moving the smaller line, we maximize the potential height while minimizing the loss in width.
  * This guarantees we explore all possible maximums efficiently.

---

## Time & Space Complexity:

* **Time Complexity:** O(n) — single pass using two pointers.  
* **Space Complexity:** O(1) — constant extra space.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

