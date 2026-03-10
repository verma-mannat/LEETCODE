import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;    
import java.util.Set;     
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int n = s.length();
        
        for (int i = 0; i <= n - 10; i++) {  
            String sub1 = s.substring(i, i + 10);
            if (seen.contains(sub1)) {
                repeated.add(sub1);  
            } else {
                seen.add(sub1);
            }
        }
        return new ArrayList<>(repeated);
    }
}