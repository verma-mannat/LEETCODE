class Solution {
    public int majorityElement(int[] nums) {
      
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int majorityE=0;
        int maxValue=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                majorityE = entry.getKey();
            }
        }
        return majorityE;
    }
}