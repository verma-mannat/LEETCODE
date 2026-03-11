
import java.util.HashSet;

import java.util.Set;  
class Solution {
    public int firstUniqChar(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int n = s.length();
        
        for (int i = 0; i<n; i++) {  
            String ch = String.valueOf(s.charAt(i));
            if (seen.contains(ch)) {
                repeated.add(ch);  
            } else {
                seen.add(ch);
            }
        }
        seen.removeAll(repeated); 
        for (int i = 0; i < n; i++) {
            String ch = String.valueOf(s.charAt(i));
            if (seen.contains(ch)) {
                return i; 
            }
        }
        
        return -1;
        
    }
}