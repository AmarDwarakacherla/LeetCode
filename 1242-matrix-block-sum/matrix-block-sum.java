class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] res = new int[row][col];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int sum = 0;
                for(int r = i-k;r<=i+k;r++){
                    for(int c = j-k;c<=j+k;c++){
                        if(r>=0 && c>=0 && r<row && c<col){
                            sum+=mat[r][c];
                        }
                    }
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}