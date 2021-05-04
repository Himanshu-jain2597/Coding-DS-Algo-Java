class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
    
        
        int[] lis = new int[n];
        
       lis[0] =1;
        for(int i=1;i<n;i++) {
            lis[i] = 1;
            for(int j=0;j<i;j++) {
                
                if(arr[i]>arr[j]) {
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
            }
            
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(max<lis[i])
            max = lis[i];
        }
