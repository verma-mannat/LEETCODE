1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        HashSet<String> set = new HashSet<>(wordDict); 
4        int n = s.length();
5        boolean[] dp = new boolean[n + 1];
6        dp[0] = true; // empty string base case
7
8        for (int i = 1; i <= n; i++) {
9            for (int j = 0; j < i; j++) {
10                if (dp[j] && set.contains(s.substring(j, i))) {
11                    dp[i] = true;
12                    break; 
13                }
14            }
15        }
16
17        return dp[n];
18    }
19}