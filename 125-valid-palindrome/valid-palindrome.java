class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
             if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        String res = str.toString();
        int start = 0, end = str.length()-1;
        while(start < end){
            if(res.charAt(start)!=res.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }
}