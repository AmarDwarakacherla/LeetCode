class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int t = s.length()-1;
        while(t>=0 && s.charAt(t)== ' ')
            t--;
        while(t>=0 && s.charAt(t)!=' ')
        {
            t--;
            len++;
        }
        return len;
    }
}