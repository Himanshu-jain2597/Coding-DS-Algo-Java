class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        Map<Integer,Integer> map = new HashMap<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++) {
            
            if(map.containsKey(arr[i])) {
                
                map.put(arr[i],map.get(arr[i])+1);
                
            }
            
            else {
                map.put(arr[i],1);
            }
            
        }
        ans.add(map.size());
        for(int i=k;i<n;i++) {
            
            if(map.containsKey(arr[i-k])) {
                
                if(map.get(arr[i-k])>1) {
                    
                    map.put(arr[i-k],map.get(arr[i-k])-1);
                    
                }
                else {
                    map.remove(arr[i-k]);
                }
                
                
            }
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
            ans.add(map.size());
        }
        
        return ans;
    }
}
