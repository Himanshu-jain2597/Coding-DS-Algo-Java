class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null) {
            return res;
        }
        
        LinkedList<Node> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            
            int n = queue.size();
            
            
            
            for(int i=0;i<n;i++) {
                
                
                Node temp = queue.removeFirst();
                
                
                if(i==n-1) {
                    
                    res.add(temp.data);
                    
                }
                
                if(temp.left!=null) {
                    
                    queue.addLast(temp.left);
                    
                }
                
                if(temp.right!=null) {
                    queue.addLast(temp.right);
                }
                
            }
            
            
            
            
            
        }
        
        return res;
      
    }
}

