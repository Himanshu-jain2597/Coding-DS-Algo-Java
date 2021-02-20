// ony work for distnict number i.e for unique number.
class Solution {
    int MissingNumber(int array[], int n) {
        
        
        int x1 = 0; 
        for(int i=0;i<array.length;i++) {
            x1^= array[i];
        }
        
        int x2 = 0;
        for(int i=1;i<=n;i++) {
            x2^= i;
        }
        
        return x1^x2;
        
        
        // Your Code Here
    }
}
