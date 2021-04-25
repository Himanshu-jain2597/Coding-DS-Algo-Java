class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length()) {
            return false;
        }
        int[] count =  new int[256];
        
        for(int i=0;i<a.length();i++) {
            
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
            
            
        }
        
        for(int i=0;i<count.length;i++) {
            if(count[i]!=0) {
                return false;
            }
        }
        return true;
        
    }
}
