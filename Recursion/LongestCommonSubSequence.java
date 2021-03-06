class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        
        if(text1.length()==0||text2.length()==0) {
            return 0;
        }
        
          String ros1 = text1.substring(1);
        String ros2 = text2.substring(1);
        
       if(text1.charAt(0)== text2.charAt(0)) {
            
          
            
            return 1 + longestCommonSubsequence(ros1, ros2);
            
            
        }
        else {
            
            int first = longestCommonSubsequence(ros1, text2);
            int second = longestCommonSubsequence(text1, ros2);
            
            return Math.max(first,second);
            
            
        }
        
        
        
        
        
    }
}
