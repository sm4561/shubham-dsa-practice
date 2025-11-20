class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int maxD = 0;
        for (int d : deadline) if (d > maxD) maxD = d;
        
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);
        
        int[] slot = new int[maxD + 1];
        int count = 0, total = 0;
        
        for (int i = 0; i < n; i++) {
            for (int t = jobs[i][0]; t > 0; t--) {
                if (slot[t] == 0) {
                    slot[t] = 1;
                    count++;
                    total += jobs[i][1];
                    break;
                }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(total);
        return ans;
    }
}
