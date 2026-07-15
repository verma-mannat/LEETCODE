class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = (low + high) / 2;
            if (canRob(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canRob(int[] nums, int k, int mid) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= mid) {
                count++;
                i += 2; // skip adjacent
            } else {
                i++;
            }
        }
        return count >= k;
    }
}