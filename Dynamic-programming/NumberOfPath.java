//User function Template for Java
class Solution
{
    long numberOfPaths(int m, int n)
    {
        
         int mod = 1000000007;
        
        long [][] count =  new long[m][n];
        
        for(int i=0;i<m;i++) {
            
            count[i][0] =1;
        }
        
        for(int j=0;j<n;j++) {
            count[0][j] = 1;
        }
        
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                count[i][j] = (count[i-1][j] + count[i][j-1])%mod;
            }
        }
        
        return (count[m-1][n-1]);
        // code here
    }
}
