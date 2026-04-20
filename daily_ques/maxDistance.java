import java.util.*;

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int result = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != colors[0]) {
                result = Math.max(result, j - 0);
                break; 
            }
        }
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                result = Math.max(result, (n - 1) - i);
                break; 
            }
        }
        return result;
    }
}