class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
         Set<Integer> setA = new HashSet<>(), setB = new HashSet<>();
        int count = 0;
        int[] C = new int[A.length];
        for(int i=0;i<A.length;i++){
            setA.add(A[i]);
            if(setA.contains(B[i])){
                count++;
            }
            setB.add(B[i]);
            if(A[i] != B[i] && setB.contains(A[i])){
                count++;
            }
            C[i] = count;
        }


        return C;
    }
}