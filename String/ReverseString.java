class Solution {
    static String revStr(String S) {
        
        char[] arr = S.toCharArray();
        
        int first = 0;
        int last = S.length()-1;
        while(first<=last) {
            char temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
            
        }
        String res = new String(arr);
        return res;
        // code here
    }
}
