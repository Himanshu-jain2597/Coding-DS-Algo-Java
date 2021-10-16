class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int res = 0;
        int cur = 0;
        for(int i=0;i<nums.length;i++) {
            
            if(nums[i]==0) {
                cur=0;
            }
            else {
                cur++;
                res = Math.max(res,cur);
            }
            
            
        }
        return res;
       
        
        
    }
}
