class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++) {
            
            
            
            int first = nums[i];
            
            int start  = i+1;
            int end  = nums.length-1;
            
            
            while(start<end) {
                
                
                
                if(first+nums[start]+nums[end]==0) {
                    
                    List<Integer> arr =  new ArrayList<>();
                    
                    arr.add(first);
                    arr.add(nums[start]);
                    arr.add(nums[end]);
                    if(!set.contains(arr)) {
                    res.add(arr);
                    
                    }
                    set.add(arr);
                    start++;
                    end--;
                    
                }
                else {
                    if(first+nums[start]+nums[end]<0) {
                        
                        start++;
                    }
                    else {
                        end--;
                    }
                }
                
            }
            
            
            
        }
        
        return res;
        
        
        
        
        
        
    }
}
