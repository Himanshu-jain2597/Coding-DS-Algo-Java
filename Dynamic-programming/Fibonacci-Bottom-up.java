class Solution {
    static long nthFibonacci(long n){
        
        int num = (int) n;
        long[] strg =  new long[num+1];
        
        
        strg[0] = 0;
        strg[1] = 1;
        
        for(int i=2;i<strg.length;i++) {
            strg[i] = (strg[i-1] + strg[i-2])%1000000007;
        }
        
    return strg[num];
    }

}
