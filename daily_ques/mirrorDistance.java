class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int reversed=0,remainder;
        while(num!=0){
            remainder=num%10;
            reversed=reversed*10+remainder;
            num/=10;
        }
        int result=Math.abs(n-reversed);
        return result;
        
    }
}