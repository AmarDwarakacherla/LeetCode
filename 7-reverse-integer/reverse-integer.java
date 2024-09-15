class Solution {
    public int reverse(int x) {
        int y = Math.abs(x);
        long rev = 0;
        while(y!=0)
        {
            rev = rev*10 + (y%10);
            y = y/10;
        }
        if(Integer.MAX_VALUE<rev)
            return 0;
        if(Integer.MIN_VALUE>rev)
            return 0;
        if(x<0)
            return -1*(int)rev;

        return (int)rev;

        
    }
}