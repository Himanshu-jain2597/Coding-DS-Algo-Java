class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean[] visited = new boolean[V];
        
        
        dfsUtil(0,visited,ans,adj);
        
        return ans;
        
        
    }
    
    
    static void dfsUtil(int node,boolean[] visited,ArrayList<Integer> al,ArrayList<ArrayList<Integer>> adj) {
        
        visited[node] = true;
        al.add(node);
        for(int i : adj.get(node)) {
            if(!visited[i])
            dfsUtil(i,visited,al,adj);
        }
    }
    
}
