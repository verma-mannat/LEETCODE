class Solution {
    public int minimumSwaps(int[] nums) {
        int nonZeroCount = 0;
        
        // Step 1: Count how many non-zero elements are in the array
        for (int num : nums) {
            if (num != 0) {
                nonZeroCount++;
            }
        }
        
        // Step 2: Count how many zeros exist in the required non-zero section
        int swaps = 0;
        for (int i = 0; i < nonZeroCount; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }
        
        return swaps;
    }
}
