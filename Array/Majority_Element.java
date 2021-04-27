class Solution {
    public int majorityElement(int[] nums) {
        
        
        int maj_index = 0;
        
        int count =1;
        
        
        for(int i=1;i<nums.length;i++) {
            
            
            if(nums[maj_index]==nums[i]) {
                
                count++;
                
            } else {
                
                count--;
                
            }
            if(count==0) {
                
                maj_index=i;
                count=1;
                
            }
        }
            int candiadate = nums[maj_index];
        
        if(isMajority(candiadate,nums)) {
            return candiadate;
        }
        return -1;
    }
    
    
  
       public boolean isMajority(int ans,int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++) {
                
                if(nums[i]==ans) {
                    count++;
                }
                
            }
            if(count>=nums.length/2) {
                return true;
            }
            return false;
        }
        
    }
    
