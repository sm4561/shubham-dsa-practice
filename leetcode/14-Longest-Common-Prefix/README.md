# Longest Common Prefix (LeetCode #14) 

[Link to Problem on LeetCode](https://leetcode.com/problems/longest-common-prefix/)

---

## Problem Statement:

Write a function to find the **longest common prefix** string amongst an array of strings.  

If there is **no common prefix**, return an empty string `""`.

---

## Examples:

**Example 1:**

Input: strs = ["flower","flow","flight"]

Output: "fl"


**Example 2:**

Input: strs = ["dog","racecar","car"]

Output: ""

Explanation: There is no common prefix among the input strings.


---

## Key Assumptions & Constraints:

* `1 <= strs.length <= 200`  
* `0 <= strs[i].length <= 200`  
* `strs[i]` consists of **only lowercase English letters** if it is non-empty.  

---

## Approach & Thought Process:

* **Vertical Scanning Approach:**
  * Compare characters column by column (vertically) across all strings.
  * Stop when:
    * A mismatch is found, or  
    * Any string ends.  
  * The prefix up to this point is the **longest common prefix**.

* **Alternative Approaches:**
  * **Horizontal Scanning:** Compare prefixes pairwise.
  * **Divide and Conquer:** Split the array recursively, then merge.
  * **Trie:** Insert all strings into a Trie and find the common path from the root.

* **Why Vertical Scanning Works Well:**
  * Efficient for small arrays and short strings.
  * Easy to implement and read.

---

## Time & Space Complexity:

* **Time Complexity:** O(S)  
  (S = sum of all characters in all strings; in worst case, every character is checked.)  
* **Space Complexity:** O(1)  
  (Only a few variables are used.)

---

## Solution

See [`Solution.java`](Solution.java) for the Java implementation (LeetCode submission version, without main class).
