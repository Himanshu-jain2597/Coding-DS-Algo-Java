class Solution {
    public int[] sortedSquares(int[] arr) {
        
        
        int firstPositive = 0;
        
        int[] ans = new int[arr.length];
        
        if(arr.length==1) {
            ans[0] = arr[0] * arr[0];
            return ans;
        }
        
        while(firstPositive<arr.length&&arr[firstPositive]<0) {
            
            firstPositive++;
            
        }
        
        int first = firstPositive;
        int second = first-1;
        int i=0;
        
        while(second>=0&&first<arr.length) {
            
            int left = arr[second] * arr[second];
            
            int right = arr[first] * arr[first];
            
            if(left>right) {
                
               ans[i] = right;
                first++;
                
            }
            else  {
                
                ans[i] = left;
                second--;
            }
            i++;
            
            
        }
        while(second>=0 ) {
            ans[i] = arr[second] * arr[second];
            i++;
            second--;
        }
        while(first<arr.length) {
            ans[i] = arr[first] * arr[first];
            i++;
            first++;
        }
        return ans;
    }
}
