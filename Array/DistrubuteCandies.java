class Solution {
    public int distributeCandies(int[] candyType) {
        
        
        Map<Integer,Boolean> map = new HashMap<>();
        
        
        
        for(int i=0;i<candyType.length;i++) {
            
            
            if(!map.containsKey(candyType[i])) {
                
                map.put(candyType[i],true);
                
            }
            
            
            
        }
        
        return Math.min(map.size(),candyType.length/2);
        
        
        
    }
}
