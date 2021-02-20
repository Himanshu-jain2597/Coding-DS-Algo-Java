
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        
        int xor = 0;
        for(int i=0;i<nums.length;i++) {
            xor^= nums[i];
        }
        
        int rightMostBit = xor & ~(xor-1);
        
        int [] arr = new int[2];
        
        int a = 0;
        int b = 0 ;
        for(int i=0;i<nums.length;i++) {
            int x =  nums[i];
            if((x&rightMostBit)==0) {
                a^= x;
            }
            else {
                b^= x;
            }
        }
        if(a>b) {
        arr[0] =  b;
        arr[1] = a;
        }
        else {
            arr[0] =  a;
        arr[1] = b;
        }
        // Code here
        return arr;
    }
}
