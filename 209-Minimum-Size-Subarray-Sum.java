class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //princess new ques aaj 2 kr liye h ab revise kre the na?//are ek type k sare q aaj nipta dete hai//ab or 3 bche hai bs//ok
        int n=nums.length;
        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;//-ve max toh min hi hoga
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                ans=Math.min(ans,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }//okkk jaisa  princessss saysssssss
}//ye bs se bhi hoga ? topic mei likha h//no idea