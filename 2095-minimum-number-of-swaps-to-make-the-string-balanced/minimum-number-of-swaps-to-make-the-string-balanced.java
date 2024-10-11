class Solution {
    public int minSwaps(String s) {
        int imBalance = 0;
        int maxBalance = 0;
        for(char ch : s.toCharArray()){
            if(ch == '['){
                imBalance--;
            }else{
                imBalance++;
            }
            maxBalance = Math.max(maxBalance, imBalance);
        }
        return (maxBalance+1)/2;
        
    }
}