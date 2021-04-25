class Solution
{
    public long count(int S[], int m, int n) 
    { 
        
        long[][] dp= new long[m+1][n+1];
        for(int i=0;i<=m;i++) 
        dp[i][0] = 1;
        
        for(int i=0;i<=n;i++)
        dp[0][i] = 0;
        
        for(int i=1;i<=m;i++) {
            
            for(int j=1;j<=n;j++) {
                
                dp[i][j] = dp[i-1][j];
                if(j-S[i-1]>=0) {
                    dp[i][j]+=  dp[i][j-S[i-1]];
                }
                
            }
        }
        
        return dp[m][n];
        
        
     
    } 
}
