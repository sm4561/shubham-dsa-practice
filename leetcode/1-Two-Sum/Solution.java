import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number -> index mapping
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Add current number to the map
            map.put(nums[i], i);
        }
        
        // If no solution found (though problem guarantees one)
        return new int[] {};
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

