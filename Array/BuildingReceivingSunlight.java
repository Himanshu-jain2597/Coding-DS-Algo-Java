class Solution {

    public static int longest(int arr[],int n)
    {
        
        int count = 1;
        int max = arr[0];
        
        
        for(int i=1;i<n;i++) {
            
            if(arr[i]>=max) {
                count++;
                max=arr[i];
            }
            
            
        }
        
        return count;
        
    }
}
