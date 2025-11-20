# N Meetings in One Room (GFG) ✅

[Link to Problem on GFG](https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1)

---

## Problem Statement:

You are given two arrays `start[]` and `end[]`, where:

* `start[i]` → start time of meeting `i`
* `end[i]` → end time of meeting `i`

Only **one meeting** can be held in the meeting room at a time.  
You must return the **maximum number of meetings** that can be conducted.

**Important Note:**  
A meeting **cannot start at the exact time when another meeting ends**.  
(i.e., `start[i] != end[j]` for selected meetings)

---

## Examples:

**Example 1:**

Input:  
start = [1, 3, 0, 5, 8, 5]  
end   = [2, 4, 6, 7, 9, 9]

Output:  
4

Explanation:  
Possible meetings:  
(1,2), (3,4), (5,7), (8,9)

---

**Example 2:**

Input:  
start = [10, 12, 20]  
end   = [20, 25, 30]

Output:  
1

Explanation:  
Only one meeting fits without overlap.

---

**Example 3:**

Input:  
start = [1, 2]  
end   = [100, 99]

Output:  
1

---

## Key Assumptions & Constraints:

* `1 <= n <= 100000`
* `0 <= start[i] < end[i] <= 1000000`
* Only one meeting at a time.
* No meeting can start at the same time another ends.

---

## Approach & Thought Process:

* **Greedy Algorithm (Sort by End Time):**

  1. Pair meetings as `(start[i], end[i])`.
  2. Sort all meetings by **end time** (ascending).
  3. Select the first meeting (earliest end time).
  4. For each next meeting:
     * If `start > lastEnd` → schedule it.
     * Else → skip it.
  5. Count all valid meetings.

* **Why Sorting by End Time Works:**
  * Ensures we always leave maximum space for upcoming meetings.
  * Classic activity selection / interval scheduling strategy.

---

## Time & Space Complexity:

* **Time Complexity:** O(n log n)  
* **Space Complexity:** O(n) due to storing meeting pairs

---

## Solution

See `Solution.java` for the Java implementation.


