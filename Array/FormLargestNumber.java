class Solution {
    String printLargest(String[] arr) {
            
            
        Arrays.sort(arr,new Comparator<String>() {
            
            
            @Override
            public int compare(String a , String b) {
                
                
                String ab = a+b;
                String ba = b+a;
                
                return ab.compareTo(ba)>0?-1:1;
                
            }
            
        });    
        String ans = "";
        for(String a:arr)
        ans+=a;
        return ans;
    }
}
