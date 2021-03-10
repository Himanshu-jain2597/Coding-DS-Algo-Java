class Solution {
    public boolean isMatch(String s, String p) {
        
        if(p.length()==0 && s.length()==0) {
            return true;
        }  if(p.length()==0 && s.length()!=0) {
            return false;
        } if(p.length()!=0 && s.length()==0) {
            for(int i=0;i<p.length();i++) {
                
                if(p.charAt(i)!='*') {
                    return false;
                }
            }
                return true;
        }
        
        char cs = s.charAt(0);
        char cp = p.charAt(0);
        
        
        String rop = p.substring(1);
        String ros = s.substring(1);
        
        boolean res;
        if(cs==cp||cp=='?') {
             res = isMatch(ros,rop);
        } else if(cp=='*') {
            
             res = isMatch(s,rop)||isMatch(ros,p);
            
            
        } else {
            res =false ;
        }
    
        return res;
    }
}
