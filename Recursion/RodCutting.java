class GFG {
    public int cutRod(int price[], int n) {
        
        if(n<0) {
            return 0;
        }
        
        if(n==0) {
            return price[0];
        }
        
        int max = price[n-1];
        
        int left = 0;
        
        int right  = n-2;
        
        while(left<=right) {
            
            int fd = cutRod(price,left+1);
            int rd = cutRod(price,right+1);
            
            
            int total = fd + rd;
            
            if(total>max) {
                
             max = total;   
            }
            
            left++;
            right--;
            
            
        }
        return max;
    }
}
