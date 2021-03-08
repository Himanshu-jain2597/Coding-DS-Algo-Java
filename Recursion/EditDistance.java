class Solution {
    public int minDistance(String word1, String word2) {
        
        if(word1.length()==0) {
            return word2.length();
        } else if(word2.length()==0) {
            return word1.length();
        } else if(word1==word2) {
            return 0;
        }
        
        
        char c1 = word1.charAt(0);
        char c2 = word2.charAt(0);
        
        String ros1 = word1.substring(1);
        String ros2 = word2.substring(1);
        
        int ans=0;
        if(c1==c2) {
            ans = minDistance(ros1,ros2);
        }  else {
            int i = minDistance(ros1,word2);
            int d = minDistance(word1,ros2);
            int r = minDistance(ros1,ros2);
            
             ans = Math.min(Math.min(i,d),r)+1;
            
        }
        
        return ans;
        
    }
}
