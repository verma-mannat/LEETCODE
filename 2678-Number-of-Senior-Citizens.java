class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String str: details){
            String sub = str.substring(11,13);
            int num = Integer.parseInt(sub);
            if(num>60){
                count++;
            }
        }
        return count;
    }
}