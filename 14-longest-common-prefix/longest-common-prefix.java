class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String first = strs[0], end = strs[strs.length-1];
       int i=0;
       while(i<first.length() && i<end.length() && first.charAt(i)==end.charAt(i)){
        i++;
       }
       return first.substring(0,i);
        
    }
}