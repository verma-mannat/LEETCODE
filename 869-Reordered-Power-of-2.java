import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Step 1: get digit frequency of n
        String target = countDigits(n);

        // Step 2: check against all powers of 2 up to 10^9
        for (int i = 0; i < 31; i++) {  // 2^30 < 10^9
            int pow = 1 << i;           // compute 2^i
            if (countDigits(pow).equals(target)) {
                return true;
            }
        }
        return false;
    }

    // Helper: returns sorted string of digits (digit signature)
    private String countDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}
