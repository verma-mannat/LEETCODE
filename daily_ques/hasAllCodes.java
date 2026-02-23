/*
# Intuition
Total number of combinations = 2^k

# Approach
>Make all combinations, remove duplicate using Hash set

# Complexity
- Time complexity:O(n * k)

- Space complexity:O(2^k * k)
 */
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = (int)Math.pow(2,k);
        Set<String> set = new HashSet<>();
        for(int i=0 ; i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        if(set.size()==n){
            return true;
        }
        else{
            return false;
        }
        
    }
}