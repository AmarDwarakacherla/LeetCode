class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder str = new StringBuilder();
        for(String word:words)
        {
            if(ispali(word))
            {
                str.append(word);
                break;
            }
        }
        return str.toString();
    }
    public boolean ispali(String str)
    {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}