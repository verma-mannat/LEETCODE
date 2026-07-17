class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int base = n - 1;

        if (nums[n - 1] != base) {
            return false;
        }

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return nums[n - 2] == base;
    }
}