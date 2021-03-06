
class GFG {
    public int cutRod(int price[], int n) {
        
        int [] profit = new int[n];
        
        profit[0] = price[0];
        
        
        
        for(int i=1;i<n;i++) {
            
            int max = price[i];
        
            int left = 0;
        
            int right  = i-1;
        
            while(left<=right) {
            
            int fd = profit[left];
            int rd = profit[right];
            
            
            int total = fd + rd;
            
            if(total>max) {
                
             max = total;   
            }
            
            left++;
            right--;
            
            
        }
            
            profit[i] =  max;
        }
        
        return profit[n-1];
        
    }
}
