class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n) 
    {
        
        Set<Integer> set  = new HashSet<Integer>();
        
        int min =-1;
        
        for(int i=n-1;i>=0;i--) {
            
            if(set.contains(arr[i])) {
                min = i;
            }
            else {
                set.add(arr[i]);
            }
            
            
        }
        if(min!=-1)
        return min+1;
        
        return min;
    }
}
