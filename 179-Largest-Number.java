
class Solution {
    public String largestNumber(int[] nums) {
        // 1. numbers -> strings
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // 2. sort: put a before b if (a+b) is bigger than (b+a)//ye //sort mei condn bhi dal sakte h ye toh lastest news h fr
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));//ye kya kara h 

        // 3. glue together
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s);
//wow//maths ka kya kr diya lol
        // 4. handle all-zero case
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}