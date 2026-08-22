class Solution {
    public boolean checkDivisibility(int n) {
       int sum =0;
       int product=1;//sum+product krke usse divisbility check krni h
       int p=n;
       while(p>0){
        int digit=p%10;
        p=p/10;
        sum=sum+digit;
        product=product*digit;
       }
       int q=sum+product;//n ko final se /////oyeeeee final reserved word h java ka 
       return n%q==0;
    }
}