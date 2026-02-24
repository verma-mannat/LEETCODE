/*
# Intuition
Add array elements to set

# Approach
while adding array elements in set check if they are present in set or not, if the element is already present it is duplicated.

# Complexity
- Time complexity:O(n)

- Space complexity:O(n)
 */
package arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int duplicate=0;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                duplicate=nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return duplicate;
        
    }
}