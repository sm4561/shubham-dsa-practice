Median of Two Sorted Arrays (LeetCode #4) ✅

Link to Problem on LeetCode

Problem Statement:-

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Key Assumptions:
Arrays are already sorted in non-decreasing order.
One or both arrays may be empty, but total length m + n ≥ 1.
Range of elements: -10^6 <= nums1[i], nums2[i] <= 10^6.
Examples:-

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3], median = 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4], median = (2+3)/2 = 2.5.

My Approach & Thought Process:-

A brute force approach would be to merge both arrays and then directly pick the middle element(s).
This would take O(m+n) time, which is not optimal.

To achieve O(log(min(m,n))), we use Binary Search Partitioning:

Always apply binary search on the smaller array (let’s assume nums1).
Partition both arrays into left and right halves so that:
All elements in the left halves are ≤ all elements in the right halves.
The total number of elements in the left half = (m+n+1)/2.
Use binary search to adjust the partition index until the correct split is found.
Median is determined by:
If total length is odd → max(left1, left2)
If even → (max(left1, left2) + min(right1, right2)) / 2.

This guarantees O(log(min(m,n))) time and O(1) space.

Time & Space Complexity:
Time Complexity: O(log(min(m,n)))
Space Complexity: O(1)
Solution

See Solution.java for the Java implementation (LeetCode submission version, without main class).
