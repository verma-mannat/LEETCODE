class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String z : word1){
            s1+=z;
        }
        for(String z : word2){
            s2+=z;
        }
        return ((s1.equals(s2))?true:false);
    }
}