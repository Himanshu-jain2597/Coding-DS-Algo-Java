// top down approch

int lcs(int x, int y, string s1, string s2,int[][] str){  // str default size is s1.length()s2.length(); default value is -1
    
    if(text1.length()==0||text2.length()==0) {
            return 0;
        }
        
        if(str[x][y]!=0) {
            return str[x][y];
        }
        
        int ans =0;
        
       if(text1.charAt(0)== text2.charAt(0)) {
            
          
            
            ans =  1 + longestCommonSubsequence(x+1,y+1,ros1, ros2,str);
            
            
        }
        else {
            
            int first = longestCommonSubsequence(x,y+1,ros1, text2,str);
            int second = longestCommonSubsequence(x+1,y,text1, ros2,str);
            
            ans =  Math.max(first,second);
            
            
            
        }
        
        str[x][y] = ans;
        return ans;
        
        
    
     
    
}
