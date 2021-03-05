class Solution {
    static long nthFibonacci(long n,int[] strg){
        
        if(n==0||n==1) {
            return n;
            
        }
        
        if(strg[n]!=0) {
            return strg[n];
        }
        
        
        strg[n]  =  nthFibonacci(n-1) + nthFibonacci(n-2);
        return strg[n];
    }
}
