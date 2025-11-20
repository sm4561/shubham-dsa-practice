class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;
        
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        
        return maxPlatforms;
    }
}

