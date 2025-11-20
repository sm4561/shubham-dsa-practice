class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        double[][] arr = new double[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = val[i];
            arr[i][1] = wt[i];
            arr[i][2] = (double) val[i] / wt[i];
        }
        Arrays.sort(arr, (a, b) -> Double.compare(b[2], a[2]));
        double ans = 0.0;
        for (int i = 0; i < n; i++) {
            if (capacity == 0) break;
            if (arr[i][1] <= capacity) {
                ans += arr[i][0];
                capacity -= arr[i][1];
            } else {
                ans += arr[i][2] * capacity;
                capacity = 0;
            }
        }
        return Math.round(ans * 1000000.0) / 1000000.0;
        
    }
}
