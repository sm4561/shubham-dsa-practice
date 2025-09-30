Two Sum (LeetCode #1) ✅
[Link to Problem on LeetCode](https://leetcode.com/problems/two-sum/)

#Problem Statement:-
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.

#Key Assumptions:-

  -There is exactly one valid answer.
  -You cannot use the same element twice.

You can return the answer in any order.

Examples
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Reason: nums[0] + nums[1] = 2 + 7 = 9

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

#My Approach & Thought Process:-

  -My first instinct was to use a nested loop to check every pair of numbers, but I realized that would be 
   inefficient (O(n 2)) and likely too slow for larger datasets.

  -The key challenge is, for each number x, how to quickly find if its partner (target - x) exists in the array.
   A simple loop to search for the partner is slow. This is a classic use case for a HashMap.

  -My approach is to iterate through the array once, using a HashMap to keep track of the numbers I've already seen and their indices.
   For each number, I calculate the complement needed to reach the target.

  -I check the HashMap to see if this complement exists.
   If it does, I have found my pair and can immediately return the indices.
   If not, I add the current number and its index to the map, so it can serve as a potential complement for a number I'll see later.

This allows me to solve the problem in a single pass.

Time Complexity: O(n)
Space Complexity: O(n)

## Solution
See [`Solution.java`](Solution.java) for the Java implementation.
