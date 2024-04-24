class Solution {
    public int tribonacci(int n) {
        int t[] = new int[n+1];
        t[0] = 0;
        if(n>=1)
        {
            t[1] = 1;
            if(n>=2)
            {
                t[2] = 1;
                for(int i=3;i<=n;i++)
                {
                    t[i]=t[i-1]+t[i-2]+t[i-3];
                }
            }
        }
        return t[n];

        // if(n==0)
        //     return 0;
        // if(n==1)
        //     return 1;
        // if(n==2)
        //     return 1;
        // if(n==3)
        //     return 2;
        // return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        
    }
}