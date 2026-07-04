class Solution {
    public int findDuplicate(int[] nums) {
    
        int duplicate=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                duplicate=nums[i];
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        return duplicate;
    }
}