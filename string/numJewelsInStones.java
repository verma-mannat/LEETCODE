/*# Intuition
make a set of different jewels

# Approach
using for loop checking if the given stone is in set , then it is a jewel

# Complexity
- Time complexity:O(n+m)

- Space complexity:>O(n) */
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(jewels.charAt(i));
        }
        int count =0;
        for(int i=0;i<m;i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}