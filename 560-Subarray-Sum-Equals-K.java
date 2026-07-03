class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int tillsum=0;
        int maxlength=0;
        map.put(0,-1);
        for(int i=0; i<n; i++){
            tillsum+=nums[i];
           
            if(map.containsKey(tillsum-k)){
          
                maxlength=Math.max(maxlength,i-map.get(tillsum-k));
            }
            if(!map.containsKey(tillsum)){
                map.put(tillsum,i);
            }
            
        }
        return maxlength;
    }
}