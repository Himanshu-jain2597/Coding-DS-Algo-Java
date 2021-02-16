
class Solution {
    int isPlaindrome(String S) {
        
        int first = 0;
        int last = S.length()-1;
        
        while(first<=last) {
            
            if(S.charAt(first)!=S.charAt(last)) {
                return 0;
            }
            first++;
            last--;
        }
        return 1;
        // code here
    }
};
