class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store value -> index mapping
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // number we need to find
            
            // Check if complement already exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store current number with its index
            map.put(nums[i], i);
        }
        
        // According to problem constraints, there will always be a solution
        throw new IllegalArgumentException("No two sum solution");
    }
}

