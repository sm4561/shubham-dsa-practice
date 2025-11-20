# Job Sequencing Problem (GFG) ✅

[Link to Problem on GFG](https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1)

---

## Problem Statement:

You are given two arrays: `deadline[]` and `profit[]`, which represent a set of jobs. Each job takes **1 unit of time** to complete, and only **one job can be scheduled at a time**. You will earn the profit associated with a job **only if it is completed by its deadline**.

Your task is to find:
* The maximum number of jobs that can be completed within their deadlines.
* The total maximum profit earned by completing those jobs.

Return the result as an array or pair: `[maxJobs, totalProfit]`.

---

## Examples:

**Example 1:**

Input:  
deadline = [4, 1, 1, 1]  
profit = [20, 10, 40, 30]  

Output:  
[2, 60]

Explanation:  
Choose job with profit 40 (deadline 1) and job with profit 20 (deadline 4). Total jobs = 2, total profit = 60.

---

**Example 2:**

Input:  
deadline = [2, 1, 2, 1, 1]  
profit = [100, 19, 27, 25, 15]  

Output:  
[2, 127]

Explanation:  
Choose job1 (profit 100, d=2) and job3 (profit 27, d=2) → total profit = 127.

---

**Example 3:**

Input:  
deadline = [3, 1, 2, 2]  
profit = [50, 10, 20, 30]  

Output:  
[3, 100]

Explanation:  
Choose jobs with profits 50(d=3), 30(d=2), 20(d=2) scheduled appropriately → total = 100.

---

## Key Assumptions & Constraints:

* `1 <= deadline.size = profit.size <= 100000`
* `1 <= deadline[i] <= deadline.size()`
* `1 <= profit[i] <= 500`
* Each job takes exactly 1 unit time.
* Only one job can be scheduled at a time.
* A job yields profit only if finished by its deadline.

---

## Approach & Thought Process:

* **Greedy + Disjoint Set (Union-Find) for slot allocation (Optimal O(n α(n))):**
  1. Pair each job with its profit and deadline.
  2. Sort jobs in **descending order of profit**.
  3. Maintain a Disjoint Set (parent array) representing latest available free slot for each time index.
  4. For each job (highest profit first), find the latest free slot `s` ≤ `deadline[i]` using `find()`.
     * If `s > 0` → schedule job at slot `s`, add profit, increment count, and union `s` with `s-1` (mark `s` occupied).
     * If `s == 0` → no slot available, skip job.
  5. Continue until all jobs processed.

* **Why This Works:**
  * Scheduling higher-profit jobs earlier maximizes total profit.
  * DSU ensures finding & reserving the latest available slot efficiently.

---

## Time & Space Complexity:

* **Time Complexity:** O(n log n) for sorting + O(n α(n)) for union-find operations → approximately **O(n log n)** overall.  
* **Space Complexity:** O(n) for auxiliary arrays and DSU.

---

## Solution

See `Solution.java` for the Java implementation (GFG submission version).


