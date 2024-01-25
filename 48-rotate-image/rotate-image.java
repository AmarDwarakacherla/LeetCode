class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
		for(int i=0;i<(n+1)/2;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				//t =bottom left
				int t=a[n-1-j][i];
				//bottom left = bottom right
				a[n-j-1][i] = a[n-i-1][n-j-1];
				//bottom right = top right;
				a[n-i-1][n-j-1] = a[j][n-i-1];
				//top right = top left
				a[j][n-i-1] = a[i][j];
				//top left = t
				a[i][j] = t;
			}
		}
        
    }
}