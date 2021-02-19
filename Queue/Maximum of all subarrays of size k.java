class solve{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        
        Deque<Integer> Qi = new LinkedList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0;
        for(;i<k;i++) {
            
            while(!Qi.isEmpty()&&arr[i]>=arr[Qi.peekLast()]) {
                
                Qi.removeLast();
            }
            
            Qi.addLast(i);
        }
        
        for(;i<n;i++) {
            
            ans.add(arr[Qi.peek()]);
            
            while(!Qi.isEmpty()&& Qi.peek()<= i-k) {
                Qi.removeFirst();
            }
            
             while ((!Qi.isEmpty()) && arr[i] >= 
                              arr[Qi.peekLast()])
                Qi.removeLast();
                
                
                Qi.addLast(i); 
        }
              ans.add(arr[Qi.peek()]);  
            
            
        
        
        return ans;
        // Your code here
    }
}
