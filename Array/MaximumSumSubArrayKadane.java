class Solution {
    public int maxSubArray(int[] arr) {
        
        
        int max_sum = arr[0] ;
        int cur_sum = 0;
        
        
        for(int i=0;i<arr.length;i++) {
            
            cur_sum+=arr[i];
            
            if(cur_sum>max_sum) {
                max_sum = cur_sum;
            }
            if(cur_sum<0) {
                cur_sum=0;
            }
            
        }
        
        return max_sum;
        
    }
}
