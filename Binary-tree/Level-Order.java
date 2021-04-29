class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        
            ArrayList<Integer> arr = new ArrayList<>();
            
            LinkedList<Node> queue = new LinkedList<>();
            
            
            queue.add(node);
            
            
            while(!queue.isEmpty()) {
                
                Node rv = queue.removeFirst();
                
                
                arr.add(rv.data);
                
                
                if(rv.left!=null) {
                    
                    queue.addLast(rv.left);
                    
                }
                
                
                if(rv.right!=null) {
                    queue.addLast(rv.right);
                }
                
            }
            
            return arr;
        
        
    }
}

