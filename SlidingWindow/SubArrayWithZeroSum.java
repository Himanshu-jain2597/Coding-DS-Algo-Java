class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        
        Set<Integer> set = new HashSet<>();
        
        int sum=0;
        for(int a:arr) {
            sum+=a;
            if(set.contains(sum)||sum==0||a==0) return true;
            set.add(sum);
            
        }
        
        return false;
        
    }
}
