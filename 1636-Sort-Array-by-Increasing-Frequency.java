class Solution {
    public int[] frequencySort(int[] nums) {

        int[] freq = new int[201];

        for (int x : nums)
            freq[x + 100]++;

        int k = 0;

        for (int f = 1; f <= nums.length; f++) {

            for (int x = 100; x >= -100; x--) {

                if (freq[x + 100] == f) {

                    for (int j = 0; j < f; j++) {
                        nums[k++] = x;
                    }
                }
            }
        }

        return nums;
    }
}