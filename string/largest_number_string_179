/*
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->convert array elements to string

# Approach
<!-- Describe your approach to solving the problem. -->make combinations and use bubble sort to make the final array.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->O(n² × m)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->O(n × m)
*/
class Solution {
    public String largestNumber(int[] nums) {
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }
        
        for (int i = 0; i < numStrings.length - 1; i++) {
            for (int j = 0; j < numStrings.length - 1 - i; j++) {
                String combo1 = numStrings[j] + numStrings[j + 1];
                String combo2 = numStrings[j + 1] + numStrings[j];
                
                if (combo1.compareTo(combo2) < 0) {
                    String temp = numStrings[j];
                    numStrings[j] = numStrings[j + 1];
                    numStrings[j + 1] = temp;
                }
            }
        }
        
        if (numStrings[0].equals("0")) {
            return "0";
        }
        
        String result = "";
        for (String s : numStrings) {
            result += s;
        }
        
        return result;
    }
}