/*
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->convert integr to binary string

# Approach
<!-- Describe your approach to solving the problem. -->every binary number start from 1 except 0, then create 4 variables , track previous and current , and using for loop find maximum distance 

# Complexity
- Time complexity:O(log n)

- Space complexity: O(log n)
*/
class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        if(binary.length()==1 && binary.charAt(0)=='0'){
            return 0;
        }
        int prev = -1;
        int current = 0;
        int maxm;
        int maxDistance = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                current = i;
                if(prev != -1){
                    maxm = current - prev;
                    if(maxm > maxDistance){
                        maxDistance = maxm;
                    }
                }
                prev = i;
            }
        }
        return maxDistance;
    }
}