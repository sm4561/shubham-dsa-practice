# 3Sum Closest (LeetCode #16) 

[Link to Problem on LeetCode](https://leetcode.com/problems/3sum-closest/)

---

## Problem Statement:

Given an integer array `nums` of length `n` and an integer `target`, find **three integers** in `nums` such that the **sum is closest** to `target`.

Return the **sum of the three integers**.

It is guaranteed that **each input has exactly one solution**.

---

## Examples:

**Example 1:**

Input: nums = [-1,2,1,-4], target = 1

Output: 2

Explanation:

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)


**Example 2:**



Input: nums = [0,0,0], target = 1

Output: 0

Explanation:

The closest sum to 1 is 0 (0 + 0 + 0 = 0)


---

## Key Assumptions & Constraints:

* `3 <= nums.length <= 500`
* `-1000 <= nums[i] <= 1000`
* `-10^4 <= target <= 10^4`
* Exactly **one solution** will exist.

---

## Approach & Thought Process:

* **Sorting + Two-Pointer Technique:**
  1. Sort the array to enable efficient two-pointer traversal.
  2. For each index `i`, use two pointers:
     * `left = i + 1`
     * `right = n - 1`
  3. Calculate the sum: `currSum = nums[i] + nums[left] + nums[right]`
  4. If `|target - currSum|` is smaller than the previously recorded difference, update the **closestSum**.
  5. Move pointers:
     * If `currSum < target` → increment `left`
     * If `currSum > target` → decrement `right`
     * If exact match found (`currSum == target`) → return immediately.

* **Why This Works:**
  * Sorting enables a monotonic search for the closest sum using only O(n²) comparisons.

---

## Time & Space Complexity:

* **Time Complexity:** O(n²)  
  (Sorting O(n log n) + two-pointer traversal)
* **Space Complexity:** O(1)  
  (Only constant extra variables used.)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).




