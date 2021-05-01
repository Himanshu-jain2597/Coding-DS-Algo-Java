class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        
        int res = 0;
        
        for(int i=0;i<k;i++) {
            
            
            res+=arr.get(i);
            
        }
        
        int cur_sum = res;
        for(int i=k;i<n;i++) {
            
            cur_sum+= arr.get(i) -arr.get(i-k);
            
            res = Math.max(cur_sum,res);
            
            
        }
        
        return res;
        
        
    }
}
