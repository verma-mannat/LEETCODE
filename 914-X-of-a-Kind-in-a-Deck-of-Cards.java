import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : deck) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int gcd = -1;
        for (int freq : freqMap.values()) {
            if (gcd == -1) {
                gcd = freq;
            } else {
                gcd = findGCD(gcd, freq);
            }
        }

        return gcd > 1;
    }

    private int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}
