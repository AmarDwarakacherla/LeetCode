class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, len = str2.length();
        for(char c : str1.toCharArray()){
            if(i<len && (str2.charAt(i)-c+26)%26<=1){
                i++;
            }
        }
        return i==len;
    }
}