# Job Sequencing Problem (GFG) ✅

[Link to Problem on GFG](https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1)

---

## Problem Statement:

You are given two arrays: `deadline[]` and `profit[]`, each representing a job.  
Each job takes **1 unit of time**, and only **one job can be scheduled at a time**.

You earn the profit of a job **only if it is completed on or before its deadline**.

Your task is to return:

* The **maximum number of jobs** that can be completed.
* The **maximum total profit** earned.

The answer should be returned as:

```
[maxJobs, maxProfit]
```

---

## Examples:

**Example 1:**

Input:  
deadline = [4, 1, 1, 1]  
profit   = [20, 10, 40, 30]

Output:  
[2, 60]

Explanation:  
Select jobs with profits 40 and 20 → total = 60.

---

**Example 2:**

Input:  
deadline = [2, 1, 2, 1, 1]  
profit   = [100, 19, 27, 25, 15]

Output:  
[2, 127]

Explanation:  
Take job1 (profit 100) and job3 (profit 27) → total = 127.

---

**Example 3:**

Input:  
deadline = [3, 1, 2, 2]  
profit   = [50, 10, 20, 30]

Output:  
[3, 100]

Explanation:  
Jobs with profits 50, 30, and 20 can be scheduled → total = 100.

---

## Key Assumptions & Constraints:

* `1 <= deadline.size = profit.size <= 100000`
* `1 <= deadline[i] <= deadline.size()`
* `1 <= profit[i] <= 500`
* Every job takes **exactly 1 unit** of time.
* Only one job can be executed at any point.

---

## Approach & Thought Process:

* **Greedy Strategy (Sort by Profit):**
  1. Pair each job as `(deadline, profit)`.
  2. Sort all jobs by **descending profit**.
  3. Maintain a `slot[]` array of size = max deadline.
  4. For each job (highest profit first):
     * Try to place it at the latest possible free slot ≤ deadline.
     * If a slot is free → schedule the job.
  5. Count scheduled jobs and accumulate profit.

* **Why This Works:**
  * Picking the highest profit jobs first ensures maximum total profit.
  * Scheduling them as late as possible keeps earlier slots available.

---

## Time & Space Complexity:

* **Time Complexity:** O(n log n) for sorting + O(n * maxDeadline) scanning  
* **Space Complexity:** O(maxDeadline)

---

## Solution

See `Solution.java` for the Java implementation used for GFG.

