class Solution {
    public String reversePrefix(String word, char ch) {
        int occ = word.indexOf(ch);
        if(occ == -1)
            return word;
        StringBuilder sb = new StringBuilder(word.substring(0,occ+1));
        sb.reverse().append(word.substring(occ+1));
        return sb.toString();
        
    }
}