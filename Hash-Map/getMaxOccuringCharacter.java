 //  maximum occuring character :-  we can do this in o(n2)  - worst case time complexity
 
 // optimise approch use hash map 
 
 import java.util.*;



class Solution  {
    
    
    
    public static char findMaxChar(String str) {
        HashMap <Character,Integer> freq = new HashMap<>();
        
        for(int i=0;i<str.length();i++) {
            char cc = str.charAt(i);
            if(freq.containsKey(cc)) {
                int oldValue  = freq.get(cc);
                oldValue++;
                freq.put(cc,oldValue);
            }
            else {
                freq.put(cc,1);
            }
        }
        int max = -1;
        char maxChar = '\0';
        Set<Map.Entry<Character,Integer>> entries = freq.entrySet();
        for(Map.Entry<Character,Integer>entry:entries) {
            if(entry.getValue()>max) {
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        System.out.println(findMaxChar(str));
        
        
    }
}
