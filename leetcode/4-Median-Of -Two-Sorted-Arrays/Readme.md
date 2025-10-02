# Median of Two Sorted Arrays (LeetCode #4) ✅
[Link to Problem on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)

---

## Problem Statement:-
Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the **median** of the two sorted arrays.

The overall run time complexity should be **O(log (m+n))**.

---

## Key Assumptions:
- Arrays are already sorted in **non-decreasing order**.
- One or both arrays may be empty, but total length `m + n ≥ 1`.
- Range of elements: `-10^6 <= nums1[i], nums2[i] <= 10^6`.

---

## Examples:-

**Example 1:**

Input: nums1 = [1,3], nums2 = [2]  
Output: 2.00000  

Explanation: merged array = [1,2,3] and median is 2.

---

**Example 2:**

Input: nums1 = [1,2], nums2 = [3,4]  
Output: 2.50000  

Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

---

## My Approach & Thought Process:-

- My first instinct was to merge both arrays and then find the middle element(s).  
  But this brute force approach would be **O(m+n)**, which is too slow for large inputs.

- The key challenge is to meet the **O(log(min(m,n)))** complexity requirement.

- A better approach is to use **Binary Search on partitions**:
  - Always binary search on the smaller array.
  - Partition both arrays such that:
    - Left half contains `(m+n+1)/2` elements.
    - All left-half elements ≤ all right-half elements.
  - Compute the median based on whether total length is odd or even.

---

## Time & Space Complexity:

- **Time Complexity:** O(log(min(m,n)))
- **Space Complexity:** O(1)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).
