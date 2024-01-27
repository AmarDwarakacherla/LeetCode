class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1,num2,0);
        
    }
    public int helper(int num1,int num2,int op)
    {
        if(num1==0 || num2==0)
            return op;
        if(num1>num2)
            num1=num1-num2;
        else
            num2=num2-num1;
       
        return helper(num1,num2,op+1);
    }
}