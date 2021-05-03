class Solution {
    public int rob(int[] nums) {
        
        int [] loot = new int[nums.length];
        
        if(nums.length==1) {
            return nums[0];
        }
    
        loot[0] = nums[0];
        if(nums[1]>nums[0]) {
            loot[1] = nums[1];
        }
        else {
            loot[1] = nums[0];
        }
        for(int i=2;i<nums.length;i++) {
            
            
            loot[i] = Math.max(loot[i-2]+nums[i],loot[i-1]);
            
        }
        
        return loot[nums.length-1];
        
    }
}
