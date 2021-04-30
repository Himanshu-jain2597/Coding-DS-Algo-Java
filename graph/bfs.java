class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        
        boolean[] visited = new boolean[V];
        
        ArrayList<Integer> ans =  new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        
        
        queue.add(0);
        
        while(!queue.isEmpty()) {
            
            int rm = queue.removeFirst();
            ans.add(rm);
            
            
            for(int s:adj.get(rm)) {
                
                if(!visited[s]) {
                    visited[s] = true;
                    queue.add(s);
                }
                
            }
            
            
            
            
        }
        
        
        return ans;
        
        
    }
}
