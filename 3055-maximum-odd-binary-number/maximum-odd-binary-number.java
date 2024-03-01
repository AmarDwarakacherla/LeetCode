class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] ch = s.toCharArray();
        int count=0;
        for(int i:ch)
        {
            if(i=='1')
                count++;
        }
        ch[ch.length-1]='1';
        count--;
        int i=0;
        for(int c=0;c<count;c++)
        {
            ch[i++]='1';
        }
        for(;i<ch.length-1;i++)
        {
            ch[i]='0';
        }
        return String.valueOf(ch);
        
    }
}