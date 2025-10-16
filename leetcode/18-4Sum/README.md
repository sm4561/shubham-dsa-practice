# 4Sum (LeetCode #18) ✅

[Link to Problem on LeetCode](https://leetcode.com/problems/4sum/)

---

## Problem Statement:

Given an array `nums` of `n` integers, return **all the unique quadruplets** `[nums[a], nums[b], nums[c], nums[d]]` such that:

0 <= a, b, c, d < n

a, b, c, and d are distinct.

nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in **any order**.

---

## Examples:

**Example 1:**

Input:  
`nums = [1,0,-1,0,-2,2], target = 0`

Output:  
`[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]`

---

**Example 2:**

Input:  
`nums = [2,2,2,2,2], target = 8`

Output:  
`[[2,2,2,2]]`

---

## Key Assumptions & Constraints:

* `1 <= nums.length <= 200`  
* `-10^9 <= nums[i] <= 10^9`  
* `-10^9 <= target <= 10^9`  

---

## Approach & Thought Process:

* **Sorting + Two-Pointer Technique:**
  * Sort the array first to handle duplicates easily.
  * Use **two outer loops** (`i`, `j`) to fix two numbers.
  * Then, use **two pointers** (`left`, `right`) to find pairs whose sum equals the remaining target.
  * Skip duplicate elements for all four indices to avoid repeated quadruplets.
  * Add the quadruplet to the result list whenever the sum matches the target.

---

### Step-by-Step Logic:

1. Sort the array `nums`.  
2. Loop `i` from 0 to `n - 3`.  
   - Skip duplicates for `i`.  
3. Loop `j` from `i + 1` to `n - 2`.  
   - Skip duplicates for `j`.  
4. Initialize two pointers:
   - `left = j + 1`
   - `right = n - 1`
5. Compute `sum = nums[i] + nums[j] + nums[left] + nums[right]`:
   - If `sum == target`, add quadruplet → move both pointers skipping duplicates.
   - If `sum < target`, move `left++`.
   - If `sum > target`, move `right--`.

---

## Time & Space Complexity:

* **Time Complexity:** O(n³) — three nested loops after sorting.  
* **Space Complexity:** O(1) — apart from the result list.

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).

