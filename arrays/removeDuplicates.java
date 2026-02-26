// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

package arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int count = 1;

        nums[k++] = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}