class Tree
{
    int countLeaves(Node node) 
    {
        
        if(node==null) {
            return 0 ;
        }
        
        if(node.left==null&&node.right==null) {
            return 1;
        }
        int count=0; 
        
        if(node.left!=null) {
            count+=countLeaves(node.left);
        }
        
        if(node.right!=null) {
            count+=countLeaves(node.right); 
        }
        return count;
         // Your code  
    }
}
