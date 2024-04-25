class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length(), ans = 0;
		int dp[] = new int[26];
		Arrays.fill(dp,0);
		for(int i=0;i<n;i++)
		{
			int maxlen = 0;
			for(char j='a';j<='z';j++)
			{
				if(Math.abs(s.charAt(i)-j)<=k)
				{
					maxlen = Math.max(maxlen, 1+dp[j-'a']);
				}
			}
			dp[s.charAt(i)-'a'] = maxlen;
			ans = Math.max(ans, maxlen);
		}
		return ans;
    }
}