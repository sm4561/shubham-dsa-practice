# 3Sum (LeetCode #15) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/3sum/)

---

## Problem Statement:

Given an integer array `nums`, return all the **triplets** `[nums[i], nums[j], nums[k]]` such that:

* `i != j`, `i != k`, and `j != k`, and  
* `nums[i] + nums[j] + nums[k] == 0`.

The **solution set must not contain duplicate triplets**.

---

## Examples:

**Example 1:**

Input: nums = [-1,0,1,2,-1,-4]

Output: [[-1,-1,2],[-1,0,1]]

Explanation:

nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0

nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0

nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0

Distinct triplets → [-1,0,1] and [-1,-1,2]


**Example 2:**



Input: nums = [0,1,1]

Output: []

Explanation: No triplet sums to 0.


**Example 3:**



Input: nums = [0,0,0]

Output: [[0,0,0]]

Explanation: The only possible triplet sums to 0.


---

## Key Assumptions & Constraints:

* `3 <= nums.length <= 3000`
* `-10^5 <= nums[i] <= 10^5`
* The output should **not contain duplicate triplets**.
* The order of the output and order of triplets **does not matter**.

---

## Approach & Thought Process:

* **Two-Pointer + Sorting (Optimal O(n²) Approach):**
  1. Sort the array.
  2. Fix one element `nums[i]` as the first element of the triplet.
  3. Use two pointers:
     * `left = i + 1`
     * `right = n - 1`
  4. Compute the sum → `nums[i] + nums[left] + nums[right]`
     * If sum < 0 → increment `left`
     * If sum > 0 → decrement `right`
     * If sum == 0 → add triplet to result and move both pointers, skipping duplicates.
  5. Continue until all triplets are found.

* **Why Sorting Helps:**
  * Makes it easy to **avoid duplicates**.
  * Simplifies the two-pointer logic for sum comparison.

---

## Time & Space Complexity:

* **Time Complexity:** O(n²)  
  (Sorting O(n log n) + Two-pointer scan for each element O(n²))
* **Space Complexity:** O(1)  
  (Ignoring output list; only constant extra space used.)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).


