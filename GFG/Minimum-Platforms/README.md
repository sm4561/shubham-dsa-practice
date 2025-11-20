# Minimum Number of Platforms (GFG) ✅

[Link to Problem on GFG](https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1)

---

## Problem Statement:

You are given two arrays `arr[]` and `dep[]` representing the **arrival** and **departure** times of trains on the same day.

Each train requires **one platform**, and a platform **cannot be shared** between trains whose timings overlap.

Your task is to find the **minimum number of platforms** required so that **no train waits**.

Time format:  
Times are in **24-hour HHMM format**, e.g., `900`, `1130`, `1705`.  
Leading zeros may or may not be present.

---

## Examples:

**Example 1:**

Input:  
arr = [900, 940, 950, 1100, 1500, 1800]  
dep = [910, 1200, 1120, 1130, 1900, 2000]

Output:  
3

Explanation:  
Between **9:40 and 12:00**, three trains overlap → Need 3 platforms.

---

**Example 2:**

Input:  
arr = [900, 1235, 1100]  
dep = [1000, 1240, 1200]

Output:  
1

Explanation:  
No overlapping intervals → Only 1 platform needed.

---

**Example 3:**

Input:  
arr = [1000, 935, 1100]  
dep = [1200, 1240, 1130]

Output:  
3

Explanation:  
Around **11:00 to 11:30**, all trains overlap → Need 3 platforms.

---

## Key Assumptions & Constraints:

* `1 <= number of trains <= 50000`
* `0000 <= arr[i] <= dep[i] <= 2359`
* If a train arrives *before* another departs → need another platform.
* Sorting is required for optimal calculation.

---

## Approach & Thought Process:

* **Sorting + Two Pointer Method (Optimal O(n log n)):**

  1. Sort the arrival array.
  2. Sort the departure array.
  3. Use two pointers:
     * `i` for arrivals  
     * `j` for departures
  4. Traverse both arrays:
     * If `arr[i] <= dep[j]` → a train arrives before previous leaves → need a **new platform**.
     * Else → a train departed → reduce platform count.
  5. Track and update the **maximum platforms required** at any moment.

* **Why This Works?**
  * Sorting separates events (arrival/departure).
  * Two-pointer sweep simulates trains entering and leaving in order.

---

## Time & Space Complexity:

* **Time Complexity:** O(n log n) due to sorting  
* **Space Complexity:** O(1) (ignoring sorting space)

---

## Solution

See `Solution.java` for the Java implementation.


