/*Intuition
Count Prime Set Bits
Approach
count number of 1 in number using bitCount , and make a function for chrcking prime numbers
Complexity
Time complexity:
O(N)
Space complexity:
O(1) */
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        
        for(int i = left; i <= right; i++) {
            // Built-in method to count 1's
            int setBits = Integer.bitCount(i);
            
            if(isPrime(setBits)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}