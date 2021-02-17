class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        long res[] = new long[n];
        Stack<Long> stack  = new Stack<>();
        
        //s.push(arr[0]);
        
        for(int i = n-1;i>=0;i--) {
            
            if(!stack.empty()) {
                while(!stack.empty()&&arr[i]>=stack.peek()) {
                    
                    stack.pop();
                    
                }
            }        
                res[i] = stack.empty()?-1:stack.peek();
                stack.push(arr[i]);
        
        }
        return res;
        // Your code here
    } 
}
