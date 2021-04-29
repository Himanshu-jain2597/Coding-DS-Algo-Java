class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        
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
                
                
                if(i==0) {
                    
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
