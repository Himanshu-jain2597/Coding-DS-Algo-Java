class Solution {
    public int maxArea(int[] height) {
        
        
        int left = 0;
        int right = height.length -1;
        int area = Integer.MIN_VALUE;
        
        while(left<right) {
            
            area = Math.max(Math.min(height[left],height[right])*(right-left),area);
            
            if(height[left]<height[right]) {
                left++;
            }
            else {
                right--;
            }
            
        }
        
        return area;
        
        
    }
}
