class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int ones_count=0,zero_count=0;
        for(int p:students){
            if(p==1) ones_count++;
            else zero_count++;
        }
         for(int i=0;i<n;i++){
            if(sandwiches[i]==1&&ones_count>0) ones_count-=1;
            else if(sandwiches[i]==0&&zero_count>0) zero_count-=1;
            else return n-i;
        }
        return 0;

    }
}