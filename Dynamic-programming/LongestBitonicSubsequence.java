class Solution
{
    public int LongestBitonicSequence(int[] arr)
    {
        
        
        int n = arr.length;
        
        
        int [] left = new int[n];
        int [] right = new int[n];
        
        
        for(int i=0;i<n;i++) {
            left[i] = 1;
            right[i] = 1;
        }
        
        for(int i=0;i<n;i++) {
            
            for(int j=0;j<i;j++) {
            
            if(arr[i]>arr[j]) {
                
                left[i] = Math.max(left[i],left[j]+1);
                
            }
        }            
        }
        
        for(int i=n-2;i>=0;i--) {
            
            for(int j=n-1;j>i;j--) {
                
            if(arr[i]>arr[j]) {
                
                right[i] = Math.max(right[i],right[j]+1);
                
            }
        }    
                
                
            }
            
            
        int max = left[0] + right[0] -1;
        
        for(int i=1;i<n;i++) {
            if((left[i]+right[i]-1)>max) {
                max = left[i]+right[i]-1;
            }
        }
        
        
        return max;
        
        // Code here
    }
}
