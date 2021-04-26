class Solution {
    public int maxProfit(int[] arr) {
        
        int profit  = 0;
        if(arr.length==1) {
            return 0;
        }
        int diff = arr[1] -arr[0];
        int min  = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            
            
            if(arr[i]-min>diff) {
                diff = arr[i] - min;
            }
            
            if(min>arr[i]) {
                min = arr[i];
            }
            
            
        }
        
        if(diff<0)
            return 0;
        return diff;
        
    }
}
