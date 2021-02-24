public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
   
   int count = 0;
   HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
   
   
   for(int i=0;i<n;i++) {
       
       map.put(a[i],1);
       
   }
   
   for(int j=0;j<m;j++) {
       
       if(map.containsKey(b[j])&&map.get(b[j])==1) {
           
           count++;
           map.put(b[j],map.get(b[j])+1);
           
       }
   }
   
   return count;
    
    //Your code here
}
