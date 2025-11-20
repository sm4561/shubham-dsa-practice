class Solution {
    public int[] JobScheduling(int[] deadline, int[] profit) {
        int n = deadline.length;
        int maxD = 0;
        for (int d : deadline) if (d > maxD) maxD = d;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        java.util.Arrays.sort(idx, (a, b) -> Integer.compare(profit[b], profit[a]));
        int[] parent = new int[maxD + 1];
        for (int i = 0; i <= maxD; i++) parent[i] = i;
        java.util.function.IntUnaryOperator find = new java.util.function.IntUnaryOperator() {
            public int applyAsInt(int x) {
                int root = x;
                while (root != parent[root]) root = parent[root];
                while (x != root) {
                    int next = parent[x];
                    parent[x] = root;
                    x = next;
                }
                return root;
            }
        };
        int count = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int j = idx[i];
            int d = Math.min(deadline[j], maxD);
            int avail = find.applyAsInt(d);
            if (avail > 0) {
                count++;
                total += profit[j];
                parent[avail] = find.applyAsInt(avail - 1);
            }
        }
        return new int[]{count, total};
    }
}

