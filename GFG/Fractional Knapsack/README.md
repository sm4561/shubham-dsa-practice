Fractional Knapsack (GFG) ✅
Link to Problem on GFG

Problem Statement:
Given two arrays val[] and wt[] representing the values and weights of items, and an integer capacity representing the maximum weight a knapsack can hold, determine the maximum total value that can be achieved.
You are allowed to take fractions of items if necessary.
Return the maximum value as a double, rounded to 6 decimal places.

Examples:
Example 1:
Input:
val = [60, 100, 120]
wt = [10, 20, 30]
capacity = 50
Output:
240.000000
Explanation:
Take wt = 10 → value 60
Take wt = 20 → value 100
Take 2/3rd of wt = 30 → value 80
Total = 240

Example 2:
Input:
val = [500]
wt = [30]
capacity = 10
Output:
166.670000
Explanation:
Take fraction: 10/30
Value = 500 × (10/30) = 166.670000

Key Assumptions & Constraints:


1 <= val.size = wt.size <= 100000


1 <= capacity <= 1e9


1 <= val[i], wt[i] <= 10000


Items can be taken fractionally



Approach & Thought Process:


Greedy Algorithm (Sort by value/weight ratio):


Compute ratio = val[i] / wt[i] for each item.


Sort items by descending ratio.


Iterate through items:


If the whole item fits → take it.


Otherwise → take the fraction that fits.




Stop when the knapsack is full.




Why This Works:


Higher value-per-weight items give maximum profit.


Greedy is provably optimal for fractional knapsack.





Time & Space Complexity:


Time Complexity: O(n log n)
(sorting based on value/weight ratio)


Space Complexity: O(1)
(ignoring input storage)



Solution
See Solution.java in this folder for the Java implementation (GFG submission version, without main class).

If you want, I can generate a LeetCode-style file structure for multiple GFG problems as well.
