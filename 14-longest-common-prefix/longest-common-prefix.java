class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxLength = strs[0].length();
        for(String str : strs){
            maxLength = Math.min(maxLength, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<maxLength;i++){
            char ch = strs[0].charAt(i);
            for(String str : strs){
                if(str.charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
        
    }
}