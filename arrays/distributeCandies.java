/*
# Intuition
She wants to eat maximum different kinds of candies.

# Approach
Add all different candies in set checking the set size to be less then n/2

# Complexity
- Time complexity:O(n)

- Space complexity:O(n)
 */
package arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.size()<n/2){
                set.add(candyType[i]);
            }
            else{
                break;
            }
            
        }
        return set.size();
        
    }
}