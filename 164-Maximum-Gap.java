class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;          
//dekh k hi aa gya smj
        Arrays.sort(nums);//easy h bhot ab isse uper lvl pr h rank puch ho gyi

        int result = 0;
        for (int i = 1; i < n; i++) { 
            result = Math.max(result, nums[i] - nums[i - 1]);
        }
        return result;
    }
}