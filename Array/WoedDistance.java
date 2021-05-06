class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code hereint minDist(int arr[], int n, int x, int y) {
        
       int ans1 = -1;
       int ans2 = -1;
       int min = Integer.MAX_VALUE;
       
       for(int i=0;i<arr.length;i++) {
           
           
           if(arr[i]==x)
           ans1 = i;
           if(arr[i]==y)
           ans2=i;
           
           
           if(ans1!=-1&&ans2!=-1)
           min = Math.min(min,Math.abs(ans2-ans1));
           
           
       }
       return min==Integer.MAX_VALUE?-1:min;
}
    
}
