class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() % 2 != 0) return false;
        int count = 0;
        //counting Open braces
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='1'){
                count += s.charAt(i) == '(' ? 1 : -1;
            }else{
                count++;
            }
            if(count<0) return false;
        }
        count = 0;
        //counting Left braces
        for(int i=s.length()-1;i>=0;i--){
            if(locked.charAt(i)=='1'){
                count += s.charAt(i) == ')' ? 1 : -1;
            }else{
                count ++;
            }
            if(count<0) return false;
        }
        return true;


        
    }
}