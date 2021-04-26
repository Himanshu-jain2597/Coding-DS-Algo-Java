class Solution {
    public int trap(int[] arr) {
        
        
        int res = 0;
        
        int left = arr[0];
        
        int right = arr.length-1;
        
        
        for(int j=1;j<arr.length;j++) {
            
            
            for(int i=0;i<j;i++) {
                
                
                left = Math.max(left, arr[i]);
                
                
                
            }
            
            for(int i=j+1;i<arr.length;j++) {
                
                
                right = Math.max(right,arr[i]);
                
            }
            
            res = Math.min(left,right) - arr[j];
            
            
        }
        
        
        
        
        
        return res;
        
    }
}
