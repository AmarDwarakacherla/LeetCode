class Solution {
    public long minimumSteps(String s) {
        long ones = 0, swap = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='1')
                ones++;
            else
                swap += ones;
        }
        return swap;
        
    }
}